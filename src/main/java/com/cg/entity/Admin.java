package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="admins")
@DynamicInsert
@DynamicUpdate
public class Admin extends User{	
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_contact",unique=true)
	private String adminContact;

	
	
	public Admin() {
		super();
	}


	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	
	
	
}