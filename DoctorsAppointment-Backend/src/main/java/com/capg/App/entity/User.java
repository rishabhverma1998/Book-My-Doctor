package com.capg.App.entity;



import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "user_details")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String email;
	private String password;
	private String role;

	public User() {
	}

	public User(int userId, String email, String password, String role) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return userId == user.userId && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
	}
	@Override
	public int hashCode() {
		return Objects.hash(userId, email, password, role);
	}
}
