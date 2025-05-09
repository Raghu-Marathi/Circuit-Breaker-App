package com.dlv.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dlv.binding.TicketModel;

@FeignClient(name = "IRCTC-API" , url = "http://localhost:8093")
public interface Client {
	
	@GetMapping("/ticket/id/{id}")
	public TicketModel getTicketById(@PathVariable Integer id);
	


}
