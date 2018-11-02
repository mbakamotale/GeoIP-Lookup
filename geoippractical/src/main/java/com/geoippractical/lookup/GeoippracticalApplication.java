/**
 * @authors Mbaka Isaac Motale, Brandon Tabe
 * Company : Bubingaa PTY LTD
 * Project : Country lookup by IP
 * Location: Midrand, South Africa
 * Web based project
 * 
 */

package com.geoippractical.lookup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxmind.geoip.Country;
import com.maxmind.geoip.LookupService;

@SuppressWarnings("unused")
@SpringBootApplication


//this class test the project getting the IP address via the terminal using the Scanner class.
public class GeoippracticalApplication {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		CountryLookup countryLookup = new CountryLookup();

		System.out.println("Enter IP address");
		String ipAddress = scanner.nextLine();
		countryLookup.setIpAddress(ipAddress);
		
		//this actually searches through the database and display the country that matches with the IP address passed.
		System.out.println(countryLookup.lookupService.getCountry(ipAddress).getName());

	}
}
