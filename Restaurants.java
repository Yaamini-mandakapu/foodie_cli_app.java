package foodie_cli_app.java.Model;

import java.util.Objects;

public class Restaurants {
	/*
	 add the following properties
	 ----------------------------------------------
	 Datatype                       variables
	 -----------------------------------------------
	 String                          id
	 String                          name
	 String                          address
	 String                          menu
	 */
	/*
	 1. All the fields should be private
	 2. Create only n0.arg constructor
	 3. Create Getters and Setters methods
	 4. Override hashcode() and equals() methods
	 5. Override toString() methods
	 */
	
	private String restaurnatId;
	private String restaurantName;
	private String restaurantAddress;
	private String restaurantMenu;
	public String getRestaurnatId() {
		return restaurnatId;
	}
	public void setRestaurnatId(String restaurnatId) {
		this.restaurnatId = restaurnatId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantMenu() {
		return restaurantMenu;
	}
	public void setRestaurantMenu(String restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(restaurantAddress, restaurantMenu, restaurantName, restaurnatId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurants other = (Restaurants) obj;
		return Objects.equals(restaurantAddress, other.restaurantAddress)
				&& Objects.equals(restaurantMenu, other.restaurantMenu)
				&& Objects.equals(restaurantName, other.restaurantName)
				&& Objects.equals(restaurnatId, other.restaurnatId);
	}
	@Override
	public String toString() {
		return "Restaurants [restaurnatId=" + restaurnatId + ", restaurantName=" + restaurantName
				+ ", restaurantAddress=" + restaurantAddress + ", restaurantMenu=" + restaurantMenu + "]";
	}
	
	
	

}
