/**
 * 
 */
package com.busbooking.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busbooking.Dao.BusDao;
import com.busbooking.entities.Bus;

/**
 * @author Srimanta Mondal
 *
 */
@Service
@Transactional
public class EnquiryImpl implements Enquiry{

	
	@Autowired
	private BusDao busDao;
	
	public BusDao getBusDao() {
		return busDao;
	}

	public void setBusDao(BusDao busDao) {
		this.busDao = busDao;
	}

	
	
	public List<Bus> findBus(String source, String destination, String journeyDate){
		
		List<Bus> b = busDao.findBus(source,destination, journeyDate);
		return b;

	}
	
	
}
