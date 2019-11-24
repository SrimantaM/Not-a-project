/**
 * 
 */
package com.busbooking.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author Srimanta Mondal
 *
 */
@Entity
public class BookingHistory {
	
	@Id
	@SequenceGenerator(sequenceName="Book_Code", initialValue=1, name="sqBH")
	private int transactin_id;
	
	@ManyToOne
	private RegisterEntity customer;
	
	@OneToOne
	private CurrentBookings currentBooking;
	
	
	public int getTransactin_id() {
		return transactin_id;
	}

	public void setTransactin_id(int transactin_id) {
		this.transactin_id = transactin_id;
	}

	public RegisterEntity getCustomer() {
		return customer;
	}

	public void setCustomer(RegisterEntity customer) {
		this.customer = customer;
	}

	public CurrentBookings getCurrentBooking() {
		return currentBooking;
	}

	public void setCurrentBooking(CurrentBookings currentBooking) {
		this.currentBooking = currentBooking;
	}

	
	public BookingHistory(){
		
	}
	
	public BookingHistory(int transactin_id, RegisterEntity customer, CurrentBookings currentBooking) {
		super();
		this.transactin_id = transactin_id;
		this.customer = customer;
		this.currentBooking = currentBooking;
	}
	
}
