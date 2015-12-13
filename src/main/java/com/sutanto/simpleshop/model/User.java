package com.sutanto.simpleshop.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class User {
	@Id
	private int Id;
	@Column(unique=true)
	private String Username;
	private String Password;
	private String PasswordSalt;
	private Date LastLogin;
	private Date LastChangePassword;
	private int LoginFailedCount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPasswordSalt() {
		return PasswordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		PasswordSalt = passwordSalt;
	}
	public Date getLastLogin() {
		return LastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		LastLogin = lastLogin;
	}
	public Date getLastChangePassword() {
		return LastChangePassword;
	}
	public void setLastChangePassword(Date lastChangePassword) {
		LastChangePassword = lastChangePassword;
	}
	public int getLoginFailedCount() {
		return LoginFailedCount;
	}
	public void setLoginFailedCount(int loginFailedCount) {
		LoginFailedCount = loginFailedCount;
	}
}
