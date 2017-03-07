package com.order;

import org.junit.Assert;
import org.junit.Test;

import com.order.model.Item;
import com.order.model.OrderLine;

/**
 * 
 * Unit Test OrderLine class
 *
 */
public class OrderLineTest {

	/**
	 * 
	 * Test order lines with non-null item
	 *
	 */
	@Test
	public void testOrderLine() throws Exception {
		OrderLine orderLine1 = new OrderLine(new Item("Book", (float) 12.49), 1);
		OrderLine orderLine2 = new OrderLine(new Item("Music CD", (float) 14.99), 2);
		OrderLine orderLine3 = new OrderLine(new Item("Chocolate Bar", (float) 0.85), 3);

		Assert.assertEquals("Book", orderLine1.getItem().getDescription());
		Assert.assertEquals((float) 12.49, orderLine1.getItem().getPrice(), 0.001);
		Assert.assertEquals(1, orderLine1.getQuantity());

		Assert.assertEquals("Music CD", orderLine2.getItem().getDescription());
		Assert.assertEquals((float) 14.99, orderLine2.getItem().getPrice(), 0.001);
		Assert.assertEquals(2, orderLine2.getQuantity());

		Assert.assertEquals("Chocolate Bar", orderLine3.getItem().getDescription());
		Assert.assertEquals((float) 0.85, orderLine3.getItem().getPrice(), 0.001);
		Assert.assertEquals(3, orderLine3.getQuantity());
	}

	/**
	 * 
	 * Test order lines with null item
	 *
	 */
	@Test(expected = Exception.class)
	public void testOrderLineWithNull() throws Exception {
		new OrderLine(null, 1);
	}
}