package uk.lset.inventory.entities;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "inventory")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Inventory {
@Id
@UuidGenerator
@Column(name = "inventor_id")
private String inventoryId;
private int quantityAvailable;
private int minimumStockLevel;
private int maximumStockLevel;
private int reorderPoint;
public String getInventoryId() {
	return inventoryId;
}
public void setInventoryId(String inventoryId) {
	this.inventoryId = inventoryId;
}
public int getQuantityAvailable() {
	return quantityAvailable;
}
public void setQuantityAvailable(int quantityAvailable) {
	this.quantityAvailable = quantityAvailable;
}
public int getMinimumStockLevel() {
	return minimumStockLevel;
}
public void setMinimumStockLevel(int minimumStockLevel) {
	this.minimumStockLevel = minimumStockLevel;
}
public int getMaximumStoclLevel() {
	return maximumStockLevel;
}
public void setMaximumStoclLevel(int maximumStoclLevel) {
	this.maximumStockLevel = maximumStoclLevel;
}
public int getReorderPoint() {
	return reorderPoint;
}
public void setReorderPoint(int reorderPoint) {
	this.reorderPoint = reorderPoint;
}


}
