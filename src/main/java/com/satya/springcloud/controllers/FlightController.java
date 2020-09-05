package com.satya.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.satya.springcloud.repos.FlightRepo;
import com.satya.springcloud.model.Flight;

@RestController
@RequestMapping("/flightapi")
public class FlightController {

	@Autowired
	FlightRepo repo;
	
	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repo.findAll();
	}
}
