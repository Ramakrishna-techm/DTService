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
@Table(name="DT_TBL_PROCESS_STAGE_MASTER")
@SecondaryTable(name = "DT_TBL_PROCESS_MONITORING", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PROCESSSTAGEID"))
public class ProcessMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pROCESSSTAGEID;
	String pROCESSSTAGEDESCRIPTION;
	String PROCESSSTAGETYPE;
	String STATUS;
	String ACTIVEDATE;
	String EXPIRYDATE;
	
	@Column(table = "DT_TBL_PROCESS_MONITORING")
	String pROCESSID;

	public String getpROCESSID() {
		return pROCESSID;
	}

	public void setpROCESSID(String pROCESSID) {
		this.pROCESSID = pROCESSID;
	}

	public int getPROCESSSTAGEID() {
		return pROCESSSTAGEID;
	}

	public void setPROCESSSTAGEID(int PROCESSSTAGEID) {
		pROCESSSTAGEID = PROCESSSTAGEID;
	}

	public String getPROCESSSTAGEDESCRIPTION() {
		return pROCESSSTAGEDESCRIPTION;
	}

	public void setPROCESSSTAGEDESCRIPTION(String PROCESSSTAGEDESCRIPTION) {
		pROCESSSTAGEDESCRIPTION = PROCESSSTAGEDESCRIPTION;
	}

	public String getPROCESSSTAGETYPE() {
		return PROCESSSTAGETYPE;
	}

	public void setPROCESSSTAGETYPE(String pROCESSSTAGETYPE) {
		PROCESSSTAGETYPE = pROCESSSTAGETYPE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getACTIVEDATE() {
		return ACTIVEDATE;
	}

	public void setACTIVEDATE(String aCTIVEDATE) {
		ACTIVEDATE = aCTIVEDATE;
	}

	public String getEXPIRYDATE() {
		return EXPIRYDATE;
	}

	public void setEXPIRYDATE(String eXPIRYDATE) {
		EXPIRYDATE = eXPIRYDATE;
	}

	@Override
	public String toString() {
		return "ProcessMaster [pROCESSSTAGEID=" + pROCESSSTAGEID + ", pROCESSSTAGEDESCRIPTION="
				+ pROCESSSTAGEDESCRIPTION + ", PROCESSSTAGETYPE=" + PROCESSSTAGETYPE + ", STATUS=" + STATUS
				+ ", ACTIVEDATE=" + ACTIVEDATE + ", EXPIRYDATE=" + EXPIRYDATE + "]";
	}

	
}
