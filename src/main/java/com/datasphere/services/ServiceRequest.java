package com.datasphere.services;


public class ServiceRequest {

	public static String LOGIN = "https://172.29.161.219:8443/mgmt/v1.2/rest/login";
	public static String CURRENT_USER = "https://172.29.161.219:8443/mgmt/v1.2/rest/users/_current";

	String url;

	public ServiceRequest(String url) {
		this.url = url;
	}
	
	public String getLoginServiceCall() {
		return this.url + "mgmt/v1.2/rest/login";
	}
	
	
}