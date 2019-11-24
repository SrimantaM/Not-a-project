/**
 * 
 */
package com.busbooking.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author Srimanta Mondal
 *
 */
@Entity
public class Route {

	@Id
	@SequenceGenerator(name="routeCode", initialValue=1, sequenceName="ROUTE_SEQ")
	private int route_id;
	
	private String source;
	private String destination;
	
	@OneToMany(mappedBy="route", cascade=CascadeType.ALL)
	private List<RouteOpMap> routeOpMap = new ArrayList<RouteOpMap>();
	
	public List<RouteOpMap> getRouteOpMap() {
		return routeOpMap;
	}

	public void setRouteOpMap(List<RouteOpMap> routeOpMap) {
		this.routeOpMap = routeOpMap;
	}
	
	public void addOperator(RouteOpMap routeOpMap){
		routeOpMap.setRoute(this);
		
		this.getRouteOpMap().add(routeOpMap);
	}
	
	public int getRoute_id() {
		return route_id;
	}


	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public Route(){
		
	}
	
	
	public Route(int route_id, String source, String destination) {
		super();
		this.route_id = route_id;
		this.source = source;
		this.destination = destination;
	}
	
	
}
