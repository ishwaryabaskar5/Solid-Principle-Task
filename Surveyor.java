public class Surveyor {
	
	private int surveyorId;
	private String name;
	private String phoneNumber;
	private String email;
	private Address address;
	
	public Surveyor(){}
	
	public Surveyor(int surveyorId, String name, String phoneNumber, String email, Address address) {
		this.surveyorId = surveyorId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
	public int getSurveyorId() {
		return surveyorId;
	}
	
	public void setSurveyorId(int surveyorId) {
		this.surveyorId = surveyorId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
}
