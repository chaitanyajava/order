package com.order;

import org.junit.Assert;
import org.junit.Test;

import com.order.model.Item;

/**
 * 
 * Unit Test Item class
 *
 */
public class ItemTest {
	
	/**
	 * 
	 * Test items
	 *
	 */
	@Test
	public void testItem() {
		Item item = new Item("Book", (float) 15.39);
		Assert.assertEquals("Book", item.getDescription());
		Assert.assertEquals((float) 15.39, item.getPrice(), 0.001);
		
		item = new Item("Music CD", (float) 12.11);
		Assert.assertEquals("Music CD", item.getDescription());
		Assert.assertEquals((float) 12.11, item.getPrice(), 0.001);
	}
}
