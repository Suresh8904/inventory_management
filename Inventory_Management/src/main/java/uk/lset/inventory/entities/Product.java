package uk.lset.inventory.entities;


import java.sql.Date;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Product")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {
	@Id
	@UuidGenerator
	@Column(name = "product_id")
	private String id;
	private String productDescription;
	private int productPlu;
	private long barCode;
	private Date expireDate;
	private double packingWeightKg;
	private double packingHeightCm;
	private double packingWidthCm;
	private double packingDepthCm;
	private boolean frozen;
	private int productQuantity;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductPlu() {
		return productPlu;
	}
	public void setProductPlu(int productPlu) {
		this.productPlu = productPlu;
	}
	public long getBarCode() {
		return barCode;
	}
	public void setBarCode(long barCode) {
		this.barCode = barCode;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public double getPackingWeightKg() {
		return packingWeightKg;
	}
	public void setPackingWeightKg(double packingWeightKg) {
		this.packingWeightKg = packingWeightKg;
	}
	public double getPackingHeightCm() {
		return packingHeightCm;
	}
	public void setPackingHeightCm(double packingHeightCm) {
		this.packingHeightCm = packingHeightCm;
	}
	public double getPackingWidthCm() {
		return packingWidthCm;
	}
	public void setPackingWidthCm(double packingWidthCm) {
		this.packingWidthCm = packingWidthCm;
	}
	public double getPackingDepthCm() {
		return packingDepthCm;
	}
	public void setPackingDepthCm(double packingDepthCm) {
		this.packingDepthCm = packingDepthCm;
	}
	
	public boolean isFrozen() {
		return frozen;
	}
	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
}
