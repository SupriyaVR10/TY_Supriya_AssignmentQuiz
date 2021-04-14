package com.tyss.assignment.dto;

import java.io.Serializable; 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Register implements Serializable {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;
	@Column
	@Id
	private String username;
	@Column
	private String password;
	@Column
	private String confirmpassword;
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
	public String getConfirmpassword() {
	    return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
	    this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
	    return "Register [username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword
		    + "]";
	}

}
