package com.cg.shoppingmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Mall")
public class Mall {
	
	@Id
	private int Id;
	private String mallAdmin;
	private String mallName;
	private String location;
	private int shops_id;
	private String categories;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getShops_id() {
		return shops_id;
	}
	public void setShops_id(int shops_id) {
		this.shops_id = shops_id;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
	

}
