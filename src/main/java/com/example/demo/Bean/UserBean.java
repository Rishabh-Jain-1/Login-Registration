package com.example.demo.Bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity

public class UserBean {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	
	@Column
	@NotNull(message = "This Field cannot be Empty")
	private String firstName;
	
	@Column
	@NotNull(message = "This Field cannot be Empty")
	private String lastName;
	
	@Column(unique = true)
	@NotNull(message = "This Field cannot be Empty")
	@Email(message = "Insert valid Email")
	private String email;
	
	@Column
	@NotNull(message = "This Field cannot be Empty")
	private String password;
	
	@Column
	@NotNull(message = "Please select one of two")
	private String gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserBean [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", gender=" + gender + "]";
	}

}
