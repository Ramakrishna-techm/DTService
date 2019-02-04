package com.dt.de.model;

public class Login {

	private int USERID;
	private String uSERNAME;
	private String message;
	
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getuSERNAME() {
		return uSERNAME;
	}
	public void setuSERNAME(String uSERNAME) {
		this.uSERNAME = uSERNAME;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Login [USERID=" + USERID + ", uSERNAME=" + uSERNAME + ", message=" + message + "]";
	}

	
	
}
