package com.ashwani.training.jMockit;

public class Product {

	private long sku;
	private double price;

	public Product(long sku) {
		this.sku = sku;
	}

	public long getSku() {
		return sku;
	}

	public void setSku(long sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
