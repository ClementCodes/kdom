package com.example.demo.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
public class User {
	

		
		public String toString() {
		return firstName.toString();
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
	
		private String firstName;
	    private String lastName;
		private int zipCode;
		
		private String mail;
		
		private String street;
		
		private int phone;
		
		private String roles;
		
		private String password;

		public User(String firstName, String lastName, int zipCode, String mail, String street, int phone, String roles,
				String password) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.zipCode = zipCode;
			this.mail = mail;
			this.street = street;
			this.phone = phone;
			this.roles = roles;
			this.password = password;
		}

		
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}





		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

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

		public int getZipCode() {
			return zipCode;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getRoles() {
			return roles;
		}

		public void setRoles(String roles) {
			this.roles = roles;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	

	

	





}
