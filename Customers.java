package foodie_cli_app.java.Model;

import java.util.Objects;

public class Customers {
	 /*add the following properties
	 ------------------------------------------------
	 Datatype                     variables
	 ------------------------------------------------
	 String                       id
	 String                       name
	 String                       email
	 String                       password
	 */
	/*
	 1. All the fields should be private
	 2. Create only n0.arg constructor
	 3. Create Getters and Setters methods
	 4. Override hashcode() and equals() methods
	 5. Override toString() methods
	 */
	
	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	
	public Customers() {
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerEmail, customerId, customerName, customerPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(customerEmail, other.customerEmail) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName)
				&& Objects.equals(customerPassword, other.customerPassword);
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + "]";
	}
	
	

}
