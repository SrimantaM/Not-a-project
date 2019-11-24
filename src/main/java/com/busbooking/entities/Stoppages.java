/**
 * 
 */
package com.busbooking.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * @author lntinfotech
 *
 */
@Entity
public class Stoppages {
	
	@Id
	@SequenceGenerator(name="stoppageCode", initialValue=1, sequenceName="STOPPAGES_SEQ")
	private int stoppage_ID;
	
	@ManyToOne
	private Route route;
	private String stoppage;
	
	public Stoppages(){
		
	}
	
	public Stoppages(int stoppage_ID, Route route, String stoppage) {
		super();
		this.stoppage_ID = stoppage_ID;
		this.route = route;
		this.stoppage = stoppage;
	}

	public int getStoppage_ID() {
		return stoppage_ID;
	}

	public void setStoppage_ID(int stoppage_ID) {
		this.stoppage_ID = stoppage_ID;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public String getStoppage() {
		return stoppage;
	}

	public void setStoppage(String stoppage) {
		this.stoppage = stoppage;
	}
	
		

}
