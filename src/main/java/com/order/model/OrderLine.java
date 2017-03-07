package com.order.model;

/**
 * Represents an order line which contains the {@link Item} and the quantity.
 *
 */
public class OrderLine {

	private int quantity;
	private Item item;

	/**
	 * Constructs an OrderLine
	 * 
	 * @param item
	 *            - Item of the order
	 * 
	 * @param quantity
	 *            - Quantity of the item
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;
		this.quantity = quantity;
	}

	/**
	 * Returns the Item
	 *
	 * @return item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Returns the item quantity
	 *
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
}