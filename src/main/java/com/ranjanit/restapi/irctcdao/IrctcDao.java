package com.ranjanit.restapi.irctcdao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ranjanit.restapi.ticketresponse.TicketResponse;

@Repository
public class IrctcDao {
	
	private Map<String ,TicketResponse> ticketmap=new HashMap<>();
	
	public String saveTicket(TicketResponse response) {
		
		ticketmap.put(response.getPnr(),response);
		return response.getPnr();
		
	}
	public String   updateTicket(TicketResponse response) {
		  String pnr=response.getPnr();
		  ticketmap.put(pnr, response);
		  return "ticket updated";
		
		
	}
	
	public String deleteTicket(String pnr) {
		
		ticketmap.remove(pnr);
	   return "ticket delete";
	}
	 public TicketResponse  getTicketByPnr(String pnr) {
		  System.out.println(pnr);
		 if(ticketmap.containsKey(pnr)) {
			 return  ticketmap.get(pnr);
		 }
		 else {
			 return ticketmap.get(pnr);
		 }
	 }

}
