package uk.lset.inventory.request;

import java.sql.Date;

public class OrderRequest {
	private String orderId;
	private Date orderDate;
	private String orderSupplier;
	private String orderProduct;
	private Date expectedDate;
	private Date actualDate;
	private boolean completedOrder;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderSupplier() {
		return orderSupplier;
	}
	public void setOrderSupplier(String orderSupplier) {
		this.orderSupplier = orderSupplier;
	}
	public String getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}
	public Date getActualDate() {
		return actualDate;
	}
	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}
	public boolean isCompletedOrder() {
		return completedOrder;
	}
	public void setCompletedOrder(boolean completedOrder) {
		this.completedOrder = completedOrder;
	}
}
