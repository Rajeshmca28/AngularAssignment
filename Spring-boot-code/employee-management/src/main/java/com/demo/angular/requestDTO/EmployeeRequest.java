package com.demo.angular.requestDTO;



public class EmployeeRequest {
	private String empId;
    private String empFName;
    private String empLName;
    private String degination;
    private String email;
    private String phone;
    private String gender;
    private String address;
    private String state;
    private String country;
    private String pincode;

    
    
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpFName() {
		return empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	public String getDegination() {
		return degination;
	}

	public void setDegination(String degination) {
		this.degination = degination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	EmployeeRequest()
	{
		
	}
    
	public EmployeeRequest(String empId, String empFName,String empLName, String degination, String email, String phone, String gender,
			String address, String state, String country,String pincode) {
	
		this.empId = empId;
		this.empFName = empFName;
		this.empLName = empLName;
		this.degination = degination;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [empId=" + empId + ", empFName=" + empFName + ", empLName=" + empLName + ", degination="
				+ degination + ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", address=" + address
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	}
