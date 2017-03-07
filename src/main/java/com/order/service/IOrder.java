package com.order.service;

import com.order.model.OrderLine;

/**
 * Represents an order interface
 *
 */
public interface IOrder {

	void add(OrderLine orderLn) throws IllegalArgumentException;

	int size();

	OrderLine get(int idx);

	void clear();

}
