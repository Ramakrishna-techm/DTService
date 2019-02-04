package com.dt.de.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dt_tbl_user")
public class User {
    @Id
	private int USERID;
	private String uSERNAME;
	private String PASSWORD;
	private String ROLE;
	private String STATUS;
	
	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getUSERNAME() {
		return uSERNAME;
	}
	public void setUSERNAME(String USERNAME) {
		uSERNAME = USERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getROLE() {
		return ROLE;
	}
	public void setROLE(String rOLE) {
		ROLE = rOLE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	@Override
	public String toString() {
		return "User [USERID=" + USERID + ", USERNAME=" + uSERNAME + ", PASSWORD=" + PASSWORD + ", ROLE=" + ROLE
				+ ", STATUS=" + STATUS + "]";
	}

 
	
	
}

