/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expensetrack.pro;

import java.util.Date;

/**
 *
 * @author Rashid Williams
 */
public class User {
	private int userId;
	private String username;
        private String upassword_;
	private String Registration_Date;
	private Date createdDate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
        
        public String upassword_() {
	return upassword_;
	}

	public void setupassword_(String upassword_) {
		this.upassword_ = upassword_;
	}


	public String getRegistration_Date() {
		return Registration_Date;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
