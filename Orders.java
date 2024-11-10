package foodie_cli_app.java.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Orders {
	/*
	  add the following properties
	  -------------------------------------------
	  Datatype                      variable
	  -------------------------------------------
	  String                        id
	  Customer                      customer
	  Restaurant                    restaurant
	  List<Dish>                    dishes
	  double                        price
	 */
	/*
	 1. All the fields should be private
	 2. Create only n0.arg constructor
	 3. Create Getters and Setters methods
	 4. Override hashcode() and equals() methods
	 5. Override toString() methods
	 */
	
	private String orderId;
	private Customers customer;
	private Restaurants restaurant;
	private List<Dishes> dish;
	private double totalPrice;
	private Date orderDate;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public Restaurants getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}
	public List<Dishes> getDish() {
		return dish;
	}
	public void setDish(List<Dishes> dish) {
		this.dish = dish;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer, dish, orderDate, orderId, restaurant, totalPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(dish, other.dish)
				&& Objects.equals(orderDate, other.orderDate) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(restaurant, other.restaurant)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customer=" + customer + ", restaurant=" + restaurant + ", dish=" + dish
				+ ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + "]";
	}
	
	

}
