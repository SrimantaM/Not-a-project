/**
 * 
 */
package com.busbooking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author lntinfotech
 *
 */
@Entity
public class CurrentBookings {

	@Id
	@SequenceGenerator(name="BookingCode", initialValue=1, sequenceName="BOOKINGS_SEQ")
	private int Booking_ID;
	
	@OneToOne
	private RegisterEntity customer;


	public int getBooking_ID() {
		return Booking_ID;
	}


	public void setBooking_ID(int booking_ID) {
		Booking_ID = booking_ID;
	}


	public RegisterEntity getCustomer() {
		return customer;
	}


	public void setCustomer(RegisterEntity customer) {
		this.customer = customer;
	}

	
	public CurrentBookings(){
		
	}

	public CurrentBookings(int booking_ID, RegisterEntity customer) {
		super();
		Booking_ID = booking_ID;
		this.customer = customer;
	}


}
