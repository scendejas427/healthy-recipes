package com.revature.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	private String username;
<<<<<<< HEAD
	@Column(name="pass")
	private String password;
=======
	private String pass;
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
	private String email;
	private String avatar;
	
	
	@ManyToMany
	@JoinTable(name = "comment_table", 
	joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="recipe_id"))
	private List<RecipeTable>recipes;


	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


<<<<<<< HEAD
	public Users(int userId, String username, String password, String email, String avatar, List<RecipeTable> recipes) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
=======
	public Users(int userId, String username, String pass, String email, String avatar, List<RecipeTable> recipes) {
		super();
		this.userId = userId;
		this.username = username;
		this.pass = pass;
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
		this.email = email;
		this.avatar = avatar;
		this.recipes = recipes;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatar == null) ? 0 : avatar.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
<<<<<<< HEAD
		result = prime * result + ((password == null) ? 0 : password.hashCode());
=======
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
		result = prime * result + ((recipes == null) ? 0 : recipes.hashCode());
		result = prime * result + userId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (avatar == null) {
			if (other.avatar != null)
				return false;
		} else if (!avatar.equals(other.avatar))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
<<<<<<< HEAD
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
=======
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
			return false;
		if (recipes == null) {
			if (other.recipes != null)
				return false;
		} else if (!recipes.equals(other.recipes))
			return false;
		if (userId != other.userId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


	@Override
	public String toString() {
<<<<<<< HEAD
		return "users [user_id=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
=======
		return "users [user_id=" + userId + ", username=" + username + ", pass=" + pass + ", email=" + email
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
				+ ", avatar=" + avatar + ", recipes=" + recipes + "]";
	}


	public int getUserId() {
		return userId;
	}


	public void setUser_id(int userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


<<<<<<< HEAD
	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
=======
	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
>>>>>>> 78400c10d67ec00d0383311b7bdaf0a0a6b1fad7
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAvatar() {
		return avatar;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	public List<RecipeTable> getRecipes() {
		return recipes;
	}


	public void setRecipes(List<RecipeTable> recipes) {
		this.recipes = recipes;
	}
	

}


