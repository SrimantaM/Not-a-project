/**
 * 
 */
package com.busbooking.Dao;


import java.util.List;

import com.busbooking.entities.Bus;

/**
 * @author lntinfotech
 *
 */
public interface BusDao {
	
	public List<Bus> findBus(String source, String destination, String journeyDate);

}
