package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {

	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrders;
	
	public ShoppingMall() {
		this.customers = new ArrayList<Customer>();
		this.orders = new ArrayList<Order>();
		this.customerOrders = new HashMap<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		customerOrders.put(customer.getUid(), new ArrayList<>());
	}
	
	public void addOrder(Order order) {
		orders.add(order);
		customerOrders.get(order.getCustomer().getUid()).add(order);
		
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	
}

