package foodie_cli_app.java.Model;

import java.util.Objects;

public class Dishes {
	/*
	 add the following properties
	 -------------------------------------------
	 Datatype                  variables
	 -------------------------------------------
	 String                     id
	 String                     name
	 String                     description
	 double                     price
	 */
	/*
	 1. All the fields should be private
	 2. Create only n0.arg constructor
	 3. Create Getters and Setters methods
	 4. Override hashcode() and equals() methods
	 5. Override toString() methods
	 */
	
	private String dishId;
	private String dishName;
	private String dishDescription;
	private double dishPrice;
	
	public Dishes() {
		
	}

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	public String getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dishDescription, dishId, dishName, dishPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dishes other = (Dishes) obj;
		return Objects.equals(dishDescription, other.dishDescription) && Objects.equals(dishId, other.dishId)
				&& Objects.equals(dishName, other.dishName) && Objects.equals(dishPrice, other.dishPrice);
	}

	@Override
	public String toString() {
		return "Dishes [dishId=" + dishId + ", dishName=" + dishName + ", dishDescription=" + dishDescription
				+ ", dishPrice=" + dishPrice + "]";
	}
	
	

}
