package com.dt.de.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dt_tbl_product_master")
public class Product {

	@Id
	private int PRODUCTID;
	private String PRODUCTNAME;
	private String PRODUCTDESCRIPTION;
	
	public int getPRODUCTID() {
		return PRODUCTID;
	}
	public void setPRODUCTID(int pRODUCTID) {
		PRODUCTID = pRODUCTID;
	}
	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}
	public void setPRODUCTNAME(String pRODUCTNAME) {
		PRODUCTNAME = pRODUCTNAME;
	}
	public String getPRODUCTDESCRIPTION() {
		return PRODUCTDESCRIPTION;
	}
	public void setPRODUCTDESCRIPTION(String pRODUCTDESCRIPTION) {
		PRODUCTDESCRIPTION = pRODUCTDESCRIPTION;
	}
	
	@Override
	public String toString() {
		return "Product [PRODUCTID=" + PRODUCTID + ", PRODUCTNAME=" + PRODUCTNAME + ", PRODUCTDESCRIPTION="
				+ PRODUCTDESCRIPTION + "]";
	}

	
}
