package com.dt.de.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DT_TBL_CUSTOMER_OFFER")
public class CustomerOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int CUSTOMEROFFERID;
	int sUPPLIEROFFERID;
	String MATERIALNO;
	String DESCRIPTION;
	int NOOFPIECES;
	String PRICEPERPIECE;
	String TOTALAMOUNT;
	String RECEIVEDDATE;
	String EXPIRYDATE;
	public int getCUSTOMEROFFERID() {
		return CUSTOMEROFFERID;
	}
	public void setCUSTOMEROFFERID(int cUSTOMEROFFERID) {
		CUSTOMEROFFERID = cUSTOMEROFFERID;
	}
	public int getsUPPLIEROFFERID() {
		return sUPPLIEROFFERID;
	}
	public void setsUPPLIEROFFERID(int sUPPLIEROFFERID) {
		this.sUPPLIEROFFERID = sUPPLIEROFFERID;
	}
	public String getMATERIALNO() {
		return MATERIALNO;
	}
	public void setMATERIALNO(String mATERIALNO) {
		MATERIALNO = mATERIALNO;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	public int getNOOFPIECES() {
		return NOOFPIECES;
	}
	public void setNOOFPIECES(int nOOFPIECES) {
		NOOFPIECES = nOOFPIECES;
	}
	public String getPRICEPERPIECE() {
		return PRICEPERPIECE;
	}
	public void setPRICEPERPIECE(String pRICEPERPIECE) {
		PRICEPERPIECE = pRICEPERPIECE;
	}
	public String getTOTALAMOUNT() {
		return TOTALAMOUNT;
	}
	public void setTOTALAMOUNT(String tOTALAMOUNT) {
		TOTALAMOUNT = tOTALAMOUNT;
	}
	public String getRECEIVEDDATE() {
		return RECEIVEDDATE;
	}
	public void setRECEIVEDDATE(String rECEIVEDDATE) {
		RECEIVEDDATE = rECEIVEDDATE;
	}
	public String getEXPIRYDATE() {
		return EXPIRYDATE;
	}
	public void setEXPIRYDATE(String eXPIRYDATE) {
		EXPIRYDATE = eXPIRYDATE;
	}
	@Override
	public String toString() {
		return "CustomerOffer [CUSTOMEROFFERID=" + CUSTOMEROFFERID + ", sUPPLIEROFFERID=" + sUPPLIEROFFERID
				+ ", MATERIALNO=" + MATERIALNO + ", DESCRIPTION=" + DESCRIPTION + ", NOOFPIECES=" + NOOFPIECES
				+ ", PRICEPERPIECE=" + PRICEPERPIECE + ", TOTALAMOUNT=" + TOTALAMOUNT + ", RECEIVEDDATE=" + RECEIVEDDATE
				+ ", EXPIRYDATE=" + EXPIRYDATE + "]";
	}
	

	
}
