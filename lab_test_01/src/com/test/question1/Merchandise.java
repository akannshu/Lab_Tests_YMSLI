package com.test.question1;

public class Merchandise {
	
	 private String itemCode;
	 private int quantity;
	 private double unitPrice;
	 
	 public Merchandise() {}

	public Merchandise(String itemCode, int quantity, double unitPrice) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Merchandise [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	
	 
}
