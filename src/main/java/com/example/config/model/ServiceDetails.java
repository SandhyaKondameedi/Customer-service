package com.example.config.model;

public class ServiceDetails {
	
	private String host;
	
	private String serviceName;
	
	private String env;

	public ServiceDetails(String host, String serviceName, String env) {
		super();
		this.host = host;
		this.serviceName = serviceName;
		this.env = env;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

}
