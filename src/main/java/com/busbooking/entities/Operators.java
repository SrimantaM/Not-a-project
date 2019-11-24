/**
 * 
 */
package com.busbooking.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.expression.spel.ast.Operator;

/**
 * @author Srimanta Mondal
 *
 */
@Entity
public class Operators {

	

	@Id
	@Column(name="OPERATOR_ID")
	@SequenceGenerator(name="operatorCode", initialValue=1, sequenceName="OPERATORS_SEQ")
	private int operatorId;
	
	@Column(name="OPERATOR_NAME")
	private String operatorName;
	
	
	@OneToMany(mappedBy="operator", cascade=CascadeType.ALL)
	private List<RouteOpMap> routeOpMap = new ArrayList<>();
	
	public List<RouteOpMap> getRouteOpMap() {
		return routeOpMap;
	}

	public void setRouteOpMap(List<RouteOpMap> routeOpMap) {
		this.routeOpMap = routeOpMap;
	}
	
	public void addOperator(RouteOpMap routeOpMap){
		routeOpMap.setOperator(this);
		
		this.getRouteOpMap().add(routeOpMap);
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Operators(){
		
	}
	
	public Operators(int operatorId, String operatorName) {
		super();
		this.operatorId = operatorId;
		this.operatorName = operatorName;
	}

}
