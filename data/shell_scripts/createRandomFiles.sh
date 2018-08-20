echo " for($i=0; $i < 3; $i++) {system("dd if=/dev/zero of=/mnt/share/file_$i.txt bs=1024 count=100"); sleep(1);}" > createRandomFiles.pl
