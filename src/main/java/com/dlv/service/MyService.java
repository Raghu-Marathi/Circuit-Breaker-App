package com.dlv.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlv.binding.TicketModel;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyService  {

	@Autowired
	private Client client;
	
	public static final String MY_SERVICE="myService"; 

	
	@CircuitBreaker(name = MY_SERVICE, fallbackMethod = "m1")
	public TicketModel getTicketById(Integer id) {
		TicketModel ticketById = client.getTicketById(id);
		return ticketById;
	}

	public TicketModel m1(Integer id, Throwable t) {
		LocalDate date = LocalDate.now();
		TicketModel t1 = new TicketModel(100, "MAHA", "HYD", "BANG", date, 19999, "435435", "confirmed");
		return t1;
	}

}
