package com.packt.webstore.domain;

import java.math.BigDecimal;

public class Product {

	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public Product() {
		super();
	}
	
	public Product(String productId, String name, BigDecimal unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
		
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public long getUnitsInStock() {
		return unitsInStock;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if(productId == null) {
			if(other.productId != null)
				return false;
		} else if(!productId.equals(other.productId))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		return result;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId="+ productId +", name="+ name +"]";
	}
	
}
