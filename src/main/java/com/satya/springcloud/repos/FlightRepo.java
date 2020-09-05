package com.satya.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.springcloud.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

}
