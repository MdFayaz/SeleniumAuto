package com.datasphere.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Vector;

import com.datasphere.constants.PDConstants;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

public class MountShare {

	static ChannelSftp channel;
	static Session session;
	static final String DATAPORTAL_IP = "";
	static String client = "172.29.160.133";
	static int    port = 22;
	static String userName = "root";
	static String password = "Tonian2013";
	
	
	public MountShare(String host, int port, String userName, String password) throws JSchException {
	    this.client = host;
	    this.port = port;
	    this.userName = userName;
	    this.password = password;
	    channel = connect();
	}
	
	private ChannelSftp connect() throws JSchException {
	    JSch jsch = new JSch();
	    session = jsch.getSession(userName,client,port);
	    session.setPassword(password);
//	    jsch.addIdentity(privateKey);
	    java.util.Properties config = new java.util.Properties();
	    config.put("StrictHostKeyChecking", "no");
	    session.setConfig(config);
	    session.connect();
	    Channel channel = session.openChannel("sftp");
	    channel.connect();
	    return (ChannelSftp)channel;
	}
	
	public void mount() {
//		PDConstants.DATAPORTAL_IP = "172.29.160.131";
//		mountShare();
		try {
			MountShare sfwsct = new MountShare(client, port, userName, password);
			String pwd  = channel.pwd();
			channel.cd("/");
			pwd = channel.pwd();
			Vector v = channel.ls(pwd);
			boolean isShrDirFound = false;
			for(Object directories : v) {
				LsEntry entry = (LsEntry)directories;
				String fileName = entry.getFilename();
				if(fileName.equals("mnt")) {
					channel.cd("mnt"); 
					System.out.println("channel cd pwd:: " + channel.pwd());
					Vector vector = channel.ls(channel.pwd());
					for(Object sharedFiles : vector) {
						entry = (LsEntry)sharedFiles;
						if(entry.getFilename().equals("share")){
							isShrDirFound = true;
							break;
						}
					}
				}
			}
			System.out.println("Outer for loop: " + channel.realpath(channel.pwd()));
			if(!isShrDirFound) {
				System.out.println("Share director not exist already");
				sfwsct.createDirectory("mkdir /mnt/share");
				channel.cd("share");
				System.out.println("Current pwd: " + channel.pwd());
				sfwsct.mountCommand("mount -o vers=3.0 "+DATAPORTAL_IP+":/mnt/data-portal/shr /mnt/share");
				sfwsct.createFile("touch /mnt/share/file!.txt");
				sfwsct.createFile("touch /mnt/share/\"some file!.txt\"\\");
				sfwsct.createFile("touch /mnt/share/some thing?.txt");
			} else {
				sfwsct.createFile("touch /mnt/share/??**textFileFromCode.txt");
			}
//			sfwsct.transferFileToRemote(FILE_PATH_WITH_SPCL_CHARS, channel.pwd());
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SftpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(session.isConnected()) {
				session.disconnect();
			}
		}
	
	}
	
	public void transferDirToRemote(String localDir, String remoteDir) throws SftpException, FileNotFoundException {
	    System.out.println("local dir: " + localDir + ", remote dir: " + remoteDir);
       try {
	    File localFile = new File(localDir);
	    channel.cd(remoteDir);
	    // for each file  in local dir
	    for (File localChildFile: localFile.listFiles()) {

	        // if file is not dir copy file
	        if (localChildFile.isFile()) {
	            transferFileToRemote(localChildFile.getAbsolutePath(),remoteDir);
	        } // if file is dir
	        else if(localChildFile.isDirectory()) {
	            // mkdir  the remote
	            SftpATTRS attrs;
	            try {
	                attrs = channel.stat(localChildFile.getName());
	            }catch (Exception e) {
	                channel.mkdir(localChildFile.getName());
	            }
	            // repeat (recursive)
	            transferDirToRemote(localChildFile.getAbsolutePath(), remoteDir + "/" + localChildFile.getName());
	            channel.cd("..");
	        }
	    }
       } catch (Exception e) {
    	   System.out.println("Exception: " );
    	   e.printStackTrace();
    	   if(channel.isConnected()) {
    		   channel.disconnect();
    	   }
       }
	}
	
	public void createDirectory(String command) throws JSchException,
			IOException {
		System.out.println("Session: " + session);
		ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
		InputStream in = null;
		if (in == null) {
			in = channelExec.getInputStream();
		}
		channelExec.setCommand(command);
		channelExec.connect();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line;
		int index = 0;
		while ((line = reader.readLine()) != null) {
			System.out.println(++index + " : " + line);
		}
		channelExec.disconnect();
		System.out.println("Create share directory. Done!");
	}
	
	public void createFile(String fileName)throws JSchException,
 IOException {
		System.out.println("Session: " + session);
		ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
		InputStream in = null;
		if (in == null) {
			in = channelExec.getInputStream();
		}
		channelExec.setCommand(fileName);
		channelExec.connect();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
		String line;
		int index = 0;
		while ((line = reader.readLine()) != null) {
			System.out.println(++index + " : " + line);
		}
		channelExec.disconnect();
		System.out.println("Created file. Done!");
	}
	
	public void mountCommand(String command) throws JSchException,
 IOException {
		Channel channelExec = (Channel) session.openChannel("shell");
		channelExec.setOutputStream(System.out);
		// Create a Shell Script
		File shellScript = mountShareWithShellScript(command);
		// Convert the shell script to byte stream
		FileInputStream fin = new FileInputStream(shellScript);
		byte fileContent[] = new byte[(int) shellScript.length()];
		fin.read(fileContent);
		InputStream in = new ByteArrayInputStream(fileContent);
		// Set the shell script to the channel as input stream
		channelExec.setInputStream(in);
		// Connect and have fun!
		channelExec.connect();
	}
	
	private void display(String fileName) {
		FileInputStream fin = null;
		try {
			System.out.println("Session: " + session);
			Channel channelExec = (Channel) session.openChannel("shell");
			channelExec.setOutputStream(System.out);
			String command = "dd if=/dev/zero of=/" + (fileName) + " bs=1024k count=100";
			File shellScript =null;// createAFile(command);
			fin = new FileInputStream(shellScript);
			byte fileContent[] = new byte[(int) shellScript.length()];
			fin.read(fileContent);
			InputStream in = new ByteArrayInputStream(fileContent);
			channelExec.setInputStream(in);
			channelExec.connect();
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public File mountShareWithShellScript(String cmd) {
	     String filename = PDConstants.PWD + "\\data\\+shellscript.sh";
	     File fstream = new File(filename);
	     try{
	          // Create file 
	         PrintStream out = new PrintStream(new FileOutputStream(fstream));
//	         out.println("mkdir /mnt/share");
	         out.println(cmd);
	         out.print("Executed mount command");
	         out.println("mount");
	         //Close the output stream
	         out.close();
	     }catch (Exception e){//Catch exception if any
	         System.err.println("Error: " + e.getMessage());
	     }
	     return fstream;
	}

	 public void transferFileToRemote(String localFile, String remoteDir) throws SftpException, FileNotFoundException {
	   channel.cd(remoteDir);
	   channel.put(new FileInputStream(new File(localFile)), new File(localFile).getName(), ChannelSftp.OVERWRITE);
	}


	public void transferToLocal(String remoteDir, String remoteFile, String localDir) throws SftpException, IOException {
	    channel.cd(remoteDir);
	    byte[] buffer = new byte[1024];
	    BufferedInputStream bis = new BufferedInputStream(channel.get(remoteFile));

	    File newFile = new File(localDir);
	    OutputStream os = new FileOutputStream(newFile);
	    BufferedOutputStream bos = new BufferedOutputStream(os);

	    int readCount;
	    while( (readCount = bis.read(buffer)) > 0) {
	        bos.write(buffer, 0, readCount);
	    }
	    bis.close();
	    bos.close();
	}
}
