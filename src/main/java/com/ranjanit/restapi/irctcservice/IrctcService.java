package com.ranjanit.restapi.irctcservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjanit.restapi.irctcdao.IrctcDao;
import com.ranjanit.restapi.passengerrequest.PassengerRequest;
import com.ranjanit.restapi.ticketresponse.TicketResponse;

@Service
public class IrctcService {
	  @Autowired
      private IrctcDao  dao;
	  
	public  String bookTicket(PassengerRequest request) {
		TicketResponse   ticketresponse=new TicketResponse();
		ticketresponse.setName(request.getName());
		ticketresponse.setCost(450.00);
		ticketresponse.setStatus("CONFIRMED");
		ticketresponse.setTicketId(101);
		ticketresponse.setFrom(request.getFrom());
		ticketresponse.setTo(request.getTo());
		ticketresponse.setJdate(request.getJdate());
	    //String pnr=UUID.randomUUID().toString();
		ticketresponse.setPnr("PNR007894");
		return dao.saveTicket(ticketresponse);
		
	}
	
	public String  deleteTicketBypnr(String pnr) {
		
		return dao.deleteTicket(pnr);
	}
	public String  updateBypnr(TicketResponse response) {
		
		  return dao.updateTicket(response);
	}
	
	
	public TicketResponse  getTicketPnr(String pnr) {
		return dao.getTicketByPnr(pnr);
	}
}
