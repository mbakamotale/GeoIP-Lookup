/**
 * @authors Mbaka Isaac Motale, Brandon Tabe
 * Company : Bubingaa PTY LTD
 * Project : Country lookup by IP
 * Location: Midrand, South Africa
 * Web based project
 * 
 */

package com.geoippractical.lookup;

import java.io.IOException;

import com.maxmind.geoip.Country;
import com.maxmind.geoip.LookupService;

//this is a custom class that contains getters and setter.
//this is class contain the variable that actually hold the IP address value.
//this class creates an object of the LookupService class that takes the path to DB as an argument in the constructor.

public class CountryLookup {
	
	//this variable holds the ip address provided.
	private String ipAddress;

	// this sets the ip address value that has been passed by the user to the ipAddress variable.
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	// this get the value that has been set to the ipAddress variable.
	public String getIpAddress() {
		return ipAddress;
	}

	public CountryLookup() throws IOException {

	}

	// this LookupService object is responsible to load the database.
	LookupService lookupService = new LookupService("../geoippractical/src/main/resources/GeoIP.dat",
			LookupService.GEOIP_MEMORY_CACHE | LookupService.GEOIP_CHECK_CACHE);

	// this actually searches through the database to get country with the correct IP address.
	Country country = lookupService.getCountry(ipAddress);
}
