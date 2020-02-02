package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {
	
	  @GetMapping("/")
	    public String hello() {
		  
		  // return "Hello World!!!"; --> (old)
		  return "<h1>Welcome to the SHIELD</h1> <br>" +
				  "<a href=\"/avengers/assemble\">AVENGERS</a> <br>" +
				  "<a href=\"/secret-bases\">Shield Secret Bases</a> <br>" +
				  "<a href=\"/logout\">Logout</a>"; 
	    }
//--------------------------------------------------------------------------------	  
	  // old:
	  // @GetMapping("/admin")
	  // public String admin() {
	  //    return "Hello Admin!!!";
	  // }
//--------------------------------------------------------------------------------	  
	  
	  
	  // <=== NEW ===>
	  
	  @GetMapping("/avengers/assemble")
	  		public String avengersAssemble() {
		  		return "Avengers...  Assemble!";
	  }
	  
	  @GetMapping("/secret-bases")
	  		public String secretBases () {
		  		return "<h1>Shield Secret Bases </h1> <br>" +
		  				"Amsterdam<br>" +
		  				"Barcelona<br>" + 
						"Berlin<br>" + 
		  				"--> Bonn ;-) <br>" +
						"Brussels<br>" + 
						"Bucharest<br>" + 
						"Budapest<br>" + 
						"Dublin<br>" + 
						"Lisbon<br>" + 
						"London<br>" + 
						"Madrid<br>" + 
						"Milan<br>" + 
						"Biarritz<br>" + 
						"Bordeaux<br>" + 
						"La Loupe<br>" + 
						"Lille<br>" + 
						"Lyon<br>" + 
						"Marseille<br>" + 
						"Nantes<br>" + 
						"Orleans<br>" + 
						"Paris<br>" + 
						"Reims<br>" + 
						"Strasbourg<br>" + 
						"Toulouse<br>";
	  }	  
	  
}





