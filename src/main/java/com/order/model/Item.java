package com.order.model;

/**
 * Represents an item, 
 * contains a price and a description.
 */
public class Item {

	private String description;
	private float price;

	/**
	 * Constructs an Item
	 * 
	 * @param description - Description of the Item
	 * @param price - Price of the Item
	 */
	public Item(String description, float price) {
		super();
		this.description = description;
		this.price = price;
	}

	/**
	 * Returns the item description
	 *
	 * @return item description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the item price
	 *
	 * @return item price
	 */
	public float getPrice() {
		return price;
	}
}