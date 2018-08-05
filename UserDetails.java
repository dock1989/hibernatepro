package com.hibernate.impl;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserDetails {
	@Id 
 private int UserId;
 private String UserName;
 @Temporal(TemporalType.DATE)
 private Date joinedDate;
 @Lob
 private String description;
 @Embedded
 private Address address;
 
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getUserId() {
	return UserId;
}
public Date getJoinedDate() {
	return joinedDate;
}
public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}
public void setUserId(int userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
