package com.demo.model;

import javax.persistence.*;

@Entity
public class Users {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int usersId; 
	
	@Column(unique=true)
	private String username;
	private String password;
	private Boolean enabled;
	

	public int getUsersId() {
		return usersId; 
	    }

	public void setUsersId(int usersId) { 
		this.usersId = usersId; 
	    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	

}
