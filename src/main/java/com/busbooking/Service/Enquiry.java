/**
 * 
 */
package com.busbooking.Service;

import java.util.List;

import com.busbooking.entities.Bus;

/**
 * @author lntinfotech
 *
 */
public interface Enquiry {
	
	public List<Bus> findBus(String source,String destination,String journeyDate);

}
