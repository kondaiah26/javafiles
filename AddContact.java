package oops_example;

public class AddContact {
	public AddContact() {
		super();
	}
	public AddContact(String name, long phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	private String name;
	private long phoneNumber;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AddContact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	

}
