package uk.lset.inventory.entities;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "supplier")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Supplier {
@Id
@UuidGenerator
@Column(name = "supplier_id")
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
