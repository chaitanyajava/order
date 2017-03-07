package com.order;

import java.text.DecimalFormat;
import java.util.Map;

import com.order.service.Order;

/**
 * Calculator class that calculates the total amount charged for all the orders and the tax
 *
 */
public class Calculator {
	/**
	 * DecimalFormat - To format the price to 2 decimal places
	 */
	private static DecimalFormat decimalFormat = new DecimalFormat("#.00");

	/**
	 * Returns the rounded value up to 2 decimal places
	 * 
	 * @param value - input decimal number
	 * @return double value to 2 decimal places
	 */
	public static double rounding(double value) {
		return new Double(decimalFormat.format(value));
	}

	/**
	 * Takes multiple of orders as input. Iterates on each order line and calculates the total price which
	 * is the item's price * quantity * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order
	 * @return 
	 */
	public double calculate(Map<String, Order> orderMap) {

		double grandtotal = 0;

		// Iterate through the orders
		for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");
			// Get an order from map
			Order order = entry.getValue();

			double totalTax = 0;
			double total = 0;

			// Iterate through the items in the order
			for (int i = 0; i < order.size(); i++) {

				// Calculate the taxes
				double tax = 0;

				// Check if the item is an imported item and calculate tax accordingly
				if (order.get(i).getItem().getDescription().contains("imported")) {
					tax = rounding(order.get(i).getItem().getPrice() * 0.15); // Extra 5% tax on imported items
				} else {
					tax = rounding(order.get(i).getItem().getPrice() * 0.10);
				}

				// Calculate the total price
				double totalprice = order.get(i).getItem().getPrice() + tax;

				// Print out the item's total price
				System.out.println(order.get(i).getQuantity() + " " + order.get(i).getItem().getDescription() + ": " + rounding(totalprice));

				// Keep a running total tax
				totalTax += tax;
				// Keep a running total
				total += order.get(i).getItem().getPrice();
			}

			// Print out the total taxes
			System.out.println("Sales Tax: " + rounding(totalTax));

			// Print out the total amount
			System.out.println("Total: " + rounding(total));
			grandtotal += total;
		}
		// Print total amount for all the orders
		System.out.println("Sum of orders: " + rounding(grandtotal));
		return rounding(grandtotal);
	}
}