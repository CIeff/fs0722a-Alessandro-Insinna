package esercizio.giovedi;

import java.time.LocalDate;
import java.util.List;

public class Order {

	String status;		
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<Product> products;
	Customer customer;
	
	long id;
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products,
			Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}
	
	public String getStatus() {
		return status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public long getId() {
		return id;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Order [status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", products="
				+ products + ", customer=" + customer + ", id=" + id + "]";
	}
}
