package Java8;

import java.util.List;

public class CustomerFL {
	
	 @Override
	public String toString() {
		return "CustomerFL [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public CustomerFL(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	private int id;
	    private String name;
	    private String email;
	    private List<String> phoneNumbers;
	

}