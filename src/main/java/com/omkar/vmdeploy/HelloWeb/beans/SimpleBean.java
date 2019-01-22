package com.omkar.vmdeploy.HelloWeb.beans;

public class SimpleBean 
{

	private String user;
	private String supportLevel;
	private String SSN;
	
	public SimpleBean(String user, String supportLevel, String sSN) {
		super();
		this.user = user;
		this.supportLevel = supportLevel;
		SSN = sSN;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSupportLevel() {
		return supportLevel;
	}

	public void setSupportLevel(String supportLevel) {
		this.supportLevel = supportLevel;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "SimpleBean [user=" + user + ", supportLevel=" + supportLevel + ", SSN=" + SSN + "]";
	}
	
	
}
