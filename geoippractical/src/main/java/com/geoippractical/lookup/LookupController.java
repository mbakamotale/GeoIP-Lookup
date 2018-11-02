/**
 * @authors Mbaka Isaac Motale, Brandon Tabe
 * Company : Bubingaa PTY LTD
 * Project : Country lookup by IP
 * Location: Midrand, South Africa
 * Web based project
 * 
 */

package com.geoippractical.lookup;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SuppressWarnings("unused")
@Controller
public class LookupController {
	private Integer age;
	
	//this method returns the a JSP file called search.jsp upon HTTP requested
	@RequestMapping(value = "/lookUp", method = RequestMethod.GET)
	public String displayView(Model model) {
		return "search.jsp";
	}

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String test(Map<String, Object> model) {
//		return "search.jsp";
//	}

}