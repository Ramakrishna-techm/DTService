package com.dt.de.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "dt_tbl_supplier_master")
@SecondaryTable(name="dt_tbl_product_master")
public class Supplier {
	@Id
	private int sUPPLIERID;
	private String SUPPLIERNAME;
	private String SUPPLIERCONTACT;
	private int PRODUCTID;
	
	@Column(table="dt_tbl_product_master")
	private String pRODUCTDESCRIPTION;
	@Column(table="dt_tbl_product_master")
	private String pRODUCTNAME;	
	
	private String PREFERREDSUPPLIER;
	private String STATUS;
	
	public int getsUPPLIERID() {
		return sUPPLIERID;
	}
	public void setsUPPLIERID(int sUPPLIERID) {
		this.sUPPLIERID = sUPPLIERID;
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
	public int getPRODUCTID() {
		return PRODUCTID;
	}
	public void setPRODUCTID(int pRODUCTID) {
		PRODUCTID = pRODUCTID;
	}
	public String getPRODUCTDESCRIPTION() {
		return pRODUCTDESCRIPTION;
	}
	public void setPRODUCTDESCRIPTION(String PRODUCTDESCRIPTION) {
		pRODUCTDESCRIPTION = PRODUCTDESCRIPTION;
	}
	public String getpRODUCTNAME() {
		return pRODUCTNAME;
	}
	public void setpRODUCTNAME(String pRODUCTNAME) {
		this.pRODUCTNAME = pRODUCTNAME;
	}
	public String getPREFERREDSUPPLIER() {
		return PREFERREDSUPPLIER;
	}
	public void setPREFERREDSUPPLIER(String pREFERREDSUPPLIER) {
		PREFERREDSUPPLIER = pREFERREDSUPPLIER;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getpRODUCTDESCRIPTION() {
		return pRODUCTDESCRIPTION;
	}
	public void setpRODUCTDESCRIPTION(String pRODUCTDESCRIPTION) {
		this.pRODUCTDESCRIPTION = pRODUCTDESCRIPTION;
	}
	
	@Override
	public String toString() {
		return "Supplier [sUPPLIERID=" + sUPPLIERID + ", SUPPLIERNAME=" + SUPPLIERNAME + ", SUPPLIERCONTACT="
				+ SUPPLIERCONTACT + ", PRODUCTID=" + PRODUCTID + ", pRODUCTDESCRIPTION=" + pRODUCTDESCRIPTION
				+ ", pRODUCTNAME=" + pRODUCTNAME + ", PREFERREDSUPPLIER=" + PREFERREDSUPPLIER + ", STATUS=" + STATUS
				+ "]";
	}
	
}
