/**
 * 
 */
package com.busbooking.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author lntinfotech
 *
 */
@Entity
public class RouteOpMap {

	@Id
	@SequenceGenerator(name="routeopCode", initialValue=1, sequenceName="ROUTEOPMAP_SEQ")
	private int ro_id;
	
	@ManyToOne
	@JoinColumn(name="ROUTE_ID")
	private Route route;
	
//	@OneToMany(mappedBy="")
//	private List<Operators> operator;
	@ManyToOne
	@JoinColumn(name="OPERATOR_ID")
	private Operators operator;
	
	
	
	public int getRo_id() {
		return ro_id;
	}


	public void setRo_id(int ro_id) {
		this.ro_id = ro_id;
	}


	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}


	public Operators getOperator() {
		return operator;
	}


	public void setOperator(Operators operator) {
		this.operator = operator;
	}


	public RouteOpMap(){
		
	}
	
	
	public RouteOpMap(int ro_id, Route route, Operators operator) {
		super();
		this.ro_id = ro_id;
		this.route = route;
		this.operator = operator;
	}
	
	
}
