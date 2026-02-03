package com.demo.angular.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMPLOYEE_PERSONAL_DTL")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="EMP_ID", unique = true, nullable = false)
    private String empId;
    @Column(name="EMP_FIRST_NAME")
    private String empFName;
    @Column(name="EMP_lAST_NAME")
    private String empLNmae;
    @Column(name="DEGINATION")
    private String degination;
    @Column(name="EMAIL_ID")
    private String email;
    @Column(name="MOBILE")
    private String phone;
    @Column(name="GENDER")
    private String gender;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="STATE")
    private String state;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="PINCODE")
    private String pincode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getEmpLNmae() {
		return empLNmae;
	}
	public void setEmpLNmae(String empLNmae) {
		this.empLNmae = empLNmae;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empFName=" + empFName + ", empLNmae=" + empLNmae
				+ ", degination=" + degination + ", email=" + email + ", phone=" + phone + ", gender=" + gender
				+ ", address=" + address + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}



    
    
}
