package com.order;

import java.util.HashMap;
import java.util.Map;

import com.order.model.Item;
import com.order.model.OrderLine;
import com.order.service.Order;

/**
 * This class contains the main method.
 *
 */
public class Foo {

	public static void main(String[] args) throws Exception {

		Map<String, Order> o = new HashMap<String, Order>();

		Order c = new Order();

		// Add OrderLines to the Order
		c.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));

		// Add order to the map
		o.put("Order 1", c);

		// Create a new Order
		c = new Order();
		// Add OrderLines to the Order
		c.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		c.add(new OrderLine(new Item("imported bottle of perfume", (float) 47.50), 1));

		// Add order to the map
		o.put("Order 2", c);

		// Create a new Order
		c = new Order();
		// Add OrderLines to the Order
		c.add(new OrderLine(new Item("imported bottle of perfume", (float) 27.99), 1));
		c.add(new OrderLine(new Item("bottle of perfume", (float) 18.99), 1));
		c.add(new OrderLine(new Item("packet of headache pills", (float) 9.75), 1));
		c.add(new OrderLine(new Item("box of imported chocolates", (float) 11.25), 1));

		// Add order to the map
		o.put("Order 3", c);

		new Calculator().calculate(o);
	}
}