/**
 * 
 */
package com.busbooking.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.busbooking.Service.Enquiry;
import com.busbooking.entities.Bus;

/**
 * @author Srimanta Mondal
 *
 */

@Controller
public class FrontController{
	
	@Autowired
	private Enquiry en;
	
	
	public Enquiry getEn() {
		return en;
	}

	
	public void setEn(Enquiry en) {
		this.en = en;
	}


	
	@RequestMapping("/")
    public ModelAndView index() {
       return new ModelAndView("index",new HashMap<>());
    }
	
	/*int i=0;
	@RequestMapping("/hello")
    public ModelAndView sayHello() {
        i++;
        ModelAndView mv = new ModelAndView("hellopage",
                "message", "Hello request count=" + i);
        return mv;
    }*/
	
	//public ModelAndView check(@RequestParam("source") String source, @RequestParam("destination") String dest, HttpServletRequest request, HttpServletResponse response)
	@RequestMapping("/searchBuses")
	public ModelAndView searchBuses(@RequestParam("source") String source, @RequestParam("destination") String dest, @RequestParam("journeyDate") String journeyDate)
	{
//		String source = (String)request.getParameter("source");
//		String dest = (String)request.getParameter("destination");
		
		
		//Can't convert String to date
		//Date date = (Date)request.getParameter("journeyDate");
		
		/*Enquiry en = new Enquiry();
		String result= en.find(source, dest);*/
		//System.out.println("Front Controller Executed");
		List<Bus> bus = en.findBus(source,dest,journeyDate);
		if(bus == null)
		{
			Map<String, Object> modelMap = new HashMap<String, Object>();
			modelMap.put("source", source);
	        modelMap.put("destination", dest);
	        modelMap.put("journeyDate", journeyDate);
			
			ModelAndView mv = new ModelAndView("BusNotFound","modelMap",modelMap);
			return mv;
		}
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("source", source);
        modelMap.put("destination", dest);
        modelMap.put("journeyDate", journeyDate);
        modelMap.put("busDetails", bus);
		
		
        
        ModelAndView mv = new ModelAndView("ResultBuses", modelMap);
		
		
		//mv.setViewName("ResultBuses");//The view it'll switch to. Extension is mentioned in BookingConfig 
		//mv.addObject("rest", bus);
		
		
		return mv;
	}
}
