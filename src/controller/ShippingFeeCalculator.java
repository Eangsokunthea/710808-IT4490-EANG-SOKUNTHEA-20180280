package controller;

import entity.order.Order;

/**
 * eang sokunthea - 20180280 
 */

public interface ShippingFeeCalculator {
	 int calculateShippingFee(Order order);
}
