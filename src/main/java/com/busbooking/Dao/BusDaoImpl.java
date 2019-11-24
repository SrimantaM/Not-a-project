/**
 * 
 */
package com.busbooking.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.busbooking.entities.Bus;
import com.busbooking.entities.Route;



/**
 * @author lntinfotech
 *
 */
@Repository
public class BusDaoImpl implements BusDao {

	@PersistenceContext
	EntityManager em;
	
	public BusDaoImpl(){
		
	}
	
	public List<Bus> findBus(String source, String destination, String journeyDate) {
		// TODO Auto-generated method stub
		String s = "select t from Route t where t.source = :source AND t.destination = :destination";
		System.out.println("It's printing!!!!");
		Query q = em.createQuery(s);
		q.setParameter("source", source);
		q.setParameter("destination", destination);
		
		Route r = (Route) q.getSingleResult();
		s = "select b from Bus b where b.route_id = :r_id";
		
		q = em.createQuery(s);
		int r_id = r.getRoute_id();
		System.out.println("Hello From Dao"+r_id);
		q.setParameter("r_id", r_id);
		
		//Nested Query Exception
		@SuppressWarnings("unchecked")
		List<Bus> b = (List<Bus>)q.getResultList();
		
		return b;
	}

}
