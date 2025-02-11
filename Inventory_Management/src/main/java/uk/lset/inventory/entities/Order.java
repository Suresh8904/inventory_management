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
@Table(name = "orders")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {
	@Id
	@UuidGenerator
	@Column(name = "order_id")
	private String id;
	private Date orderDate;
	private String orderSupplier;
	private String orderProduct;
	private Date expectedDate;
	private Date actualDate;
	private boolean completedOrder;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
