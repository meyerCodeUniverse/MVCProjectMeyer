package edu.dmacc.spring.mvcprojectmeyer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String productname;
	private double cost;
	private double retail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productName) {
		this.productname = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRetail() {
		return retail;
	}
	public void setRetail(double retail) {
		this.retail = retail;
	}
	
	public Product() {
		
	}
	public Product(long id, String productName, double cost, double retail) {
		this.id = id;
		this.productname = productName;
		this.cost = cost;
		this.retail = retail;
	}
	
}
