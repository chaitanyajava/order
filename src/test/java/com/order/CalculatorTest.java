package com.order;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.order.model.Item;
import com.order.model.OrderLine;
import com.order.service.Order;

/**
 * 
 * Unit Test Order class
 *
 */
public class CalculatorTest {

	Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	/**
	 * 
	 * Test rounding method
	 *
	 */
	@Test
	public void testRounding() {
		Assert.assertEquals(12.57, calc.rounding(12.5678), 0.001);
		Assert.assertEquals(12.56, calc.rounding(12.5622), 0.001);
		Assert.assertEquals(0.23, calc.rounding(0.2345), 0.001);
		Assert.assertEquals(0.24, calc.rounding(0.2367), 0.001);
	}
	
	@Test
	public void testCalculator() throws Exception {


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

		double total = new Calculator().calculate(o);
		Assert.assertEquals(153.81, total);
	
	}
}
