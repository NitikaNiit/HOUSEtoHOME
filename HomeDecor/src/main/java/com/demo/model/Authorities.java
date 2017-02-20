package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authorities { 
	 @Id 
	 @GeneratedValue(strategy=GenerationType.AUTO)  	
	 private int authoritiesId; 
	 
	 @Column(unique=true)
	 private String username;  
	 private String authority; 

	public int getAuthoritiesId() {  	
		return authoritiesId; 
	    } 

	public void setAuthoritiesId(int authoritiesId) {  	
		this.authoritiesId = authoritiesId; 
	    } 

	public String getUsername() {  
		return username; 
	    } 

	public void setUsername(String username) {  
		this.username = username; 
	    } 

	public String getAuthority() {  
		return authority; 
	    } 

	public void setAuthority(String authority) {  
		this.authority = authority; 
	    } 
	}
