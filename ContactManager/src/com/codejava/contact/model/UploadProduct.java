package com.codejava.contact.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UploadProduct {

	@NotNull(message = "required")
	@Size(min=1, message = "required")
	private String title;
	
	@NotNull(message = "required")
	private Integer price;
	
	@NotNull(message = "required")
	private Integer stock;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
