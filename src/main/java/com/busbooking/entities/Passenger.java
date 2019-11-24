/**
 * 
 */
package com.busbooking.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.busbooking.enums.Gender;

/**
 * @author lntinfotech
 *
 */

@Entity
public class Passenger {

	@Id
	@SequenceGenerator(name="passengerCode", initialValue=1, sequenceName="PASSENGER_SEQ")
	private int passenger_id;
	
	private int seatNo;
	private String firstName;
	private String lastName;
	private int age;
	
	//Use Gender Enum
	private Gender gender;
	
	@ManyToOne
	private CurrentBookings currentBooking;
	
	@ManyToOne
	private Bus bus;
	private Date journeyDate;
	
	public Passenger(){
		
	}
	
	public Passenger(int passenger_id, int seatNo, String firstName, String lastName, int age, Gender gender,
			CurrentBookings currentBooking, Bus bus, Date journeyDate) {
		super();
		this.passenger_id = passenger_id;
		this.seatNo = seatNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.currentBooking = currentBooking;
		this.bus = bus;
		this.journeyDate = journeyDate;
	}

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public CurrentBookings getCurrentBooking() {
		return currentBooking;
	}

	public void setCurrentBooking(CurrentBookings currentBooking) {
		this.currentBooking = currentBooking;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	
	
}
