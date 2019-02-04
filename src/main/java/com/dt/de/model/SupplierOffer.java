package com.dt.de.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="DT_TBL_SUPPLIER_OFFER")
@SecondaryTable(name="DT_TBL_SUPPLIER_MASTER")
public class SupplierOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int SUPPLIEROFFERID;
	int SUPPLIERID;
	int pROCESSID;
	String MATERIALNO;
	String DESCRIPTION;
	String NOOFPIECES;
	String PRICEPERPIECE;
	String TOTALAMOUNT;
	String RECEIVEDDATE;
	String EXPIRYDATE;
	
	@Column(table="DT_TBL_SUPPLIER_MASTER")
	String SUPPLIERNAME;

	@Column(table="DT_TBL_SUPPLIER_MASTER")
	String SUPPLIERCONTACT;
	
	
	public int getSUPPLIEROFFERID() {
		return SUPPLIEROFFERID;
	}
	public void setSUPPLIEROFFERID(int sUPPLIEROFFERID) {
		SUPPLIEROFFERID = sUPPLIEROFFERID;
	}
	public int getSUPPLIERID() {
		return SUPPLIERID;
	}
	public void setSUPPLIERID(int sUPPLIERID) {
		SUPPLIERID = sUPPLIERID;
	}
	public int getPROCESSID() {
		return pROCESSID;
	}
	public void setPROCESSID(int PROCESSID) {
		pROCESSID = PROCESSID;
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
	public String getNOOFPIECES() {
		return NOOFPIECES;
	}
	public void setNOOFPIECES(String nOOFPIECES) {
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
	
	public String getSUPPLIERNAME() {
		return SUPPLIERNAME;
	}
	public void setSUPPLIERNAME(String sUPPLIERNAME) {
		SUPPLIERNAME = sUPPLIERNAME;
	}
	public String getSUPPLIERCONTACT() {
		return SUPPLIERCONTACT;
	}
	public void setSUPPLIERCONTACT(String sUPPLIERCONTACT) {
		SUPPLIERCONTACT = sUPPLIERCONTACT;
	}
	@Override
	public String toString() {
		return "SupplierOffer [SUPPLIEROFFERID=" + SUPPLIEROFFERID + ", SUPPLIERID=" + SUPPLIERID + ", pROCESSID="
				+ pROCESSID + ", MATERIALNO=" + MATERIALNO + ", DESCRIPTION=" + DESCRIPTION + ", NOOFPIECES="
				+ NOOFPIECES + ", PRICEPERPIECE=" + PRICEPERPIECE + ", TOTALAMOUNT=" + TOTALAMOUNT + ", RECEIVEDDATE="
				+ RECEIVEDDATE + ", EXPIRYDATE=" + EXPIRYDATE + ", SUPPLIERNAME=" + SUPPLIERNAME + ", SUPPLIERCONTACT="
				+ SUPPLIERCONTACT + "]";
	}
	

	
}
