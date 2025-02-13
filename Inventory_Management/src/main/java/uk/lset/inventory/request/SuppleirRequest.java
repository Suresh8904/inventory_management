package uk.lset.inventory.request;

public class SuppleirRequest {
	private String id;
	private int supplierRegNr;
	private String supplierName;
	private String supplierAddress;
	private int telephoneNumber;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSupplierRegNr() {
		return supplierRegNr;
	}
	public void setSupplierRegNr(int supplierRegNr) {
		this.supplierRegNr = supplierRegNr;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
}
