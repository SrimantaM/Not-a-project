/**
 * 
 */
package com.busbooking.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author lntinfotech
 *
 */

@Entity
public class Admin {

	@Id
	private int admin_id;
	private String name;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Admin(){
		
	}
	
	public Admin(int admin_id, String name) {
		super();
		this.admin_id = admin_id;
		this.name = name;
	}
}
