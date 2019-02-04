package com.dt.de.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="dt_tbl_create_process")
@SecondaryTable(name="dt_tbl_customer", pkJoinColumns = @PrimaryKeyJoinColumn(name = "CUSTOMERID"))
public class Process {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PROCESSID;
    private int CUSTOMERID;
	private String sTAFFID;
	private String REQUIREMENT;
	private String PROCESSSTATUS;
	private String CREATEDDATE;
	private String CLOSUREDATE;

	//@Transient
	@Column(table="dt_tbl_customer")
	private String CUSTOMERNAME;
	//@Transient
	@Column(table="dt_tbl_customer")
	private String ALTERNATENAME;
	
	public Process() {}

	public int getPROCESSID() {
		return PROCESSID;
	}

	public void setPROCESSID(int pROCESSID) {
		PROCESSID = pROCESSID;
	}

	public int getCUSTOMERID() {
		return CUSTOMERID;
	}

	public void setCUSTOMERID(int cUSTOMERID) {
		CUSTOMERID = cUSTOMERID;
	}

	public String getSTAFFID() {
		return sTAFFID;
	}

	public void setSTAFFID(String STAFFID) {
		sTAFFID = STAFFID;
	}

	public String getREQUIREMENT() {
		return REQUIREMENT;
	}

	public void setREQUIREMENT(String rEQUIREMENT) {
		REQUIREMENT = rEQUIREMENT;
	}

	public String getPROCESSSTATUS() {
		return PROCESSSTATUS;
	}

	public void setPROCESSSTATUS(String pROCESSSTATUS) {
		PROCESSSTATUS = pROCESSSTATUS;
	}

	public String getCREATEDDATE() {
		return CREATEDDATE;
	}

	public void setCREATEDDATE(String cREATEDDATE) {
		CREATEDDATE = cREATEDDATE;
	}

	public String getCLOSUREDATE() {
		return CLOSUREDATE;
	}

	public void setCLOSUREDATE(String cLOSUREDATE) {
		CLOSUREDATE = cLOSUREDATE;
	}

	public String getCUSTOMERNAME() {
		return CUSTOMERNAME;
	}

	public void setCUSTOMERNAME(String cUSTOMERNAME) {
		CUSTOMERNAME = cUSTOMERNAME;
	}

	public String getALTERNATENAME() {
		return ALTERNATENAME;
	}

	public void setALTERNATENAME(String aLTERNATENAME) {
		ALTERNATENAME = aLTERNATENAME;
	}

	@Override
	public String toString() {
		return "Process [PROCESSID=" + PROCESSID + ", CUSTOMERID=" + CUSTOMERID + ", STAFFID=" + sTAFFID
				+ ", REQUIREMENT=" + REQUIREMENT + ", PROCESSSTATUS=" + PROCESSSTATUS + ", CREATEDDATE=" + CREATEDDATE
				+ ", CLOSUREDATE=" + CLOSUREDATE + ", CUSTOMERNAME=" + CUSTOMERNAME + ", ALTERNATENAME=" + ALTERNATENAME
				+ "]";
	}
}