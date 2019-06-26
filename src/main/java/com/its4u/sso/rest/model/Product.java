package com.its4u.sso.rest.model;

/**
 * Product.
 *
 * @author jerome.cristante
 *
 */
public class Product {

	/**
	 * ID.
	 */
	private Integer id;

	/**
	 * Name.
	 */
	private String name;

	/**
	 * Description.
	 */
	private String description;

	/**
	 * Price.
	 */
	private Double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
