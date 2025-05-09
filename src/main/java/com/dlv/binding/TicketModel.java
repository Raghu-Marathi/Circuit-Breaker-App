package com.dlv.binding;

import java.time.LocalDate;


public class TicketModel {

	private Integer ticketId;
	private String name;
	private String source;
	private String destination;
	private LocalDate journeyDate;
	private Integer trainNum;
	private String ticketPnr;
	private String ticketStatus;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketPnr() {
		return ticketPnr;
	}
	public void setTicketPnr(String ticketPnr) {
		this.ticketPnr = ticketPnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public TicketModel(Integer ticketId, String name, String source, String destination, LocalDate journeyDate,
			Integer trainNum, String ticketPnr, String ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.trainNum = trainNum;
		this.ticketPnr = ticketPnr;
		this.ticketStatus = ticketStatus;
	}
	
	
}
