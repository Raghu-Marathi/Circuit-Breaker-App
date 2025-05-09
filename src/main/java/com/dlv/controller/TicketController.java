package com.dlv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dlv.binding.TicketModel;
import com.dlv.service.MyService;

@RestController
public class TicketController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/mmt/ticket/id/{ticketId}")
	 public ResponseEntity<TicketModel> getTicketById(@PathVariable Integer ticketId){
	 TicketModel ticketById = myService.getTicketById(ticketId);
		return new ResponseEntity<TicketModel>(ticketById,HttpStatus.OK);
	}

}
