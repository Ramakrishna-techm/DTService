package com.dt.de.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="dt_tbl_customer")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int CUSTOMERID;
	private String CUSTOMERNAME;
	private String COMPANY;
	private String CONTACT;
	private Long CONTRACTNO;
	private String ALTERNATENAME;
	private String ALTERNATECONTACT;
	private String ALTERNATEEMAIL;
	private String STATUS;
	
	public Customer() {}

	public int getCUSTOMERID() {
		return CUSTOMERID;
	}

	public void setCUSTOMERID(int cUSTOMERID) {
		CUSTOMERID = cUSTOMERID;
	}

	public String getCUSTOMERNAME() {
		return CUSTOMERNAME;
	}

	public void setCUSTOMERNAME(String cUSTOMERNAME) {
		CUSTOMERNAME = cUSTOMERNAME;
	}

	public String getCOMPANY() {
		return COMPANY;
	}

	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}

	public String getCONTACT() {
		return CONTACT;
	}

	public void setCONTACT(String cONTACT) {
		CONTACT = cONTACT;
	}

	public Long getCONTRACTNO() {
		return CONTRACTNO;
	}

	public void setCONTRACTNO(Long cONTRACTNO) {
		CONTRACTNO = cONTRACTNO;
	}

	public String getALTERNATENAME() {
		return ALTERNATENAME;
	}

	public void setALTERNATENAME(String aLTERNATENAME) {
		ALTERNATENAME = aLTERNATENAME;
	}

	public String getALTERNATECONTACT() {
		return ALTERNATECONTACT;
	}

	public void setALTERNATECONTACT(String aLTERNATECONTACT) {
		ALTERNATECONTACT = aLTERNATECONTACT;
	}

	public String getALTERNATEEMAIL() {
		return ALTERNATEEMAIL;
	}

	public void setALTERNATEEMAIL(String aLTERNATEEMAIL) {
		ALTERNATEEMAIL = aLTERNATEEMAIL;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "Customer [CUSTOMERID=" + CUSTOMERID + ", CUSTOMERNAME=" + CUSTOMERNAME + ", COMPANY=" + COMPANY
				+ ", CONTACT=" + CONTACT + ", CONTRACTNO=" + CONTRACTNO + ", ALTERNATENAME=" + ALTERNATENAME
				+ ", ALTERNATECONTACT=" + ALTERNATECONTACT + ", ALTERNATEEMAIL=" + ALTERNATEEMAIL + ", STATUS=" + STATUS
				+ "]";
	}
	
	
}