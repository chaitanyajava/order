package com.order.service;

import java.util.ArrayList;
import java.util.List;

import com.order.model.OrderLine;

/**
 * Represents an order service which contains collection of {@link OrderLine} elements
 *
 */
public class Order implements IOrder {

	private List<OrderLine> orderLines = new ArrayList<OrderLine>();

	/**
	 * Add an OrderLine to the collection of orderLines
	 * 
	 * @param orderLine - Represents {@link OrderLine}
	 * @throws IllegalArgumentException if the specified orderLine is null
	 */
	@Override
	public void add(OrderLine orderLn) throws IllegalArgumentException {
		// Throw an exception if the item is null
		if (orderLn == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(orderLn);
	}

	/**
	 * Get the count of order line items
	 * 
	 * @return returns the number of order line items
	 */
	@Override
	public int size() {
		return orderLines.size();
	}

	/**
	 * Get the {@link OrderLine} at the given index position
	 * 
	 * @param  index - index of the element to return
	 * @return returns {@link OrderLine} at the given index position
	 */
	@Override
	public OrderLine get(int idx) {
		return orderLines.get(idx);
	}

	/**
	 * Remove all the elements from the collection of order lines
	 * 
	 */
	@Override
	public void clear() {
		this.orderLines.clear();
	}
}