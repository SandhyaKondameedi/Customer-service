package com.example.config.model;

public class DatabaseDetails {
	
	private String url;
	
	private String username;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public DatabaseDetails(String url, String username, String pwd) {
		super();
		this.url = url;
		this.username = username;
		this.pwd = pwd;
	}

	private String pwd;

}
