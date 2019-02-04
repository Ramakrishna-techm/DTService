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
@Table(name="DT_TBL_PROCESS_MONITORING")
@SecondaryTable(name="DT_TBL_PROCESS_STAGE_MASTER", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PROCESSSTAGEID"))
public class ProcessMonitoring {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int PROCESSMONITORINGID;
	int pROCESSID;
	int PROCESSSTAGEID;
	@Column(table = "DT_TBL_PROCESS_STAGE_MASTER")
	String pROCESSSTAGEDESCRIPTION;
	@Column(table = "DT_TBL_PROCESS_STAGE_MASTER")
	String pROCESSSTAGETYPE;
	String STAGINGDATE;

	public int getPROCESSMONITORINGID() {
		return PROCESSMONITORINGID;
	}

	public void setPROCESSMONITORINGID(int pROCESSMONITORINGID) {
		PROCESSMONITORINGID = pROCESSMONITORINGID;
	}

	public int getPROCESSID() {
		return pROCESSID;
	}

	public void setPROCESSID(int PROCESSID) {
		pROCESSID = PROCESSID;
	}

	public int getPROCESSSTAGEID() {
		return PROCESSSTAGEID;
	}

	public void setPROCESSSTAGEID(int pROCESSSTAGEID) {
		PROCESSSTAGEID = pROCESSSTAGEID;
	}

	public String getpROCESSSTAGEDESCRIPTION() {
		return pROCESSSTAGEDESCRIPTION;
	}

	public void setpROCESSSTAGEDESCRIPTION(String pROCESSSTAGEDESCRIPTION) {
		this.pROCESSSTAGEDESCRIPTION = pROCESSSTAGEDESCRIPTION;
	}

	public String getpROCESSSTAGETYPE() {
		return pROCESSSTAGETYPE;
	}

	public void setpROCESSSTAGETYPE(String pROCESSSTAGETYPE) {
		this.pROCESSSTAGETYPE = pROCESSSTAGETYPE;
	}

	public String getSTAGINGDATE() {
		return STAGINGDATE;
	}

	public void setSTAGINGDATE(String sTAGINGDATE) {
		STAGINGDATE = sTAGINGDATE;
	}

	@Override
	public String toString() {
		return "ProcessMonitoring [PROCESSMONITORINGID=" + PROCESSMONITORINGID + ", pROCESSID=" + pROCESSID
				+ ", PROCESSSTAGEID=" + PROCESSSTAGEID + ", pROCESSSTAGEDESCRIPTION=" + pROCESSSTAGEDESCRIPTION
				+ ", pROCESSSTAGETYPE=" + pROCESSSTAGETYPE + ", STAGINGDATE=" + STAGINGDATE + "]";
	}
}
