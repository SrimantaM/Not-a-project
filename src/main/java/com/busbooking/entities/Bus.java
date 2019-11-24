/**
 * 
 */
package com.busbooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author lntinfotech
 *
 */
@Entity
public class Bus {

	@Column(name="BUS_ID")
	@Id
	@SequenceGenerator(name="BusCode", initialValue=1, sequenceName="BUS_SEQ")
	private int busId;
	
	@Column(name="BUS_TYPE")
	private String busType;
	
	private double ticketPrice;
	private int totalSeats;
	
	@ManyToOne
	@JoinColumn(name="ROUTE_ID")
	private Route route;

	
	public Bus(){
		
	}
	
	public Bus(int busId, String busType,double ticketPrice, int totalSeats, Route route) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.totalSeats = totalSeats;
		this.route = route;
		this.ticketPrice = ticketPrice;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
		
}
