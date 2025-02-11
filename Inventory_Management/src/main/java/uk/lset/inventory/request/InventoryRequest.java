package uk.lset.inventory.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InventoryRequest {

	private String inventoryId;
	private int quantityAvailable;
	private int minimumStockLevel;
	private int maximumStoclLevel;
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
		return maximumStoclLevel;
	}
	public void setMaximumStoclLevel(int maximumStoclLevel) {
		this.maximumStoclLevel = maximumStoclLevel;
	}
	public int getReorderPoint() {
		return reorderPoint;
	}
	public void setReorderPoint(int reorderPoint) {
		this.reorderPoint = reorderPoint;
	}
}
