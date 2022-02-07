package com.example.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Students {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String fname;
	
	private String lname;
	
	private String email;

	public Students(Integer id, String fname, String lname, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	
	public Students() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	
	
}
