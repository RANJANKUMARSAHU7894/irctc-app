package com.ranjanit.restapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranjanit.restapi.irctcservice.IrctcService;
import com.ranjanit.restapi.passengerrequest.PassengerRequest;
import com.ranjanit.restapi.ticketresponse.TicketResponse;

@RestController
public class IrctcRestController {
	@Autowired
	private IrctcService service;

	@PostMapping(value = "/bookticket", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> bookTicket(@RequestBody PassengerRequest request) {
		String pnr = service.bookTicket(request);
		System.out.println("this is controller");
		System.out.println("second");
		String msg = "Ticket Booking completed ::" + pnr;
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "/ticket/{pnr}", produces = { "application/xml", "application/json" })
	public ResponseEntity<TicketResponse> getTicket(@PathVariable String pnr) {
		TicketResponse ticketPnr = service.getTicketPnr(pnr);
		return new ResponseEntity<>(ticketPnr, HttpStatus.OK);
	}

	@PutMapping(value = "/ticketupdate", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> updataTicket(@RequestBody TicketResponse response) {

		String updateBypnr = service.updateBypnr(response);
		return new ResponseEntity<String>(updateBypnr, HttpStatus.OK);
	}

	@DeleteMapping(value = "/ticketdelete/{pnr}", produces = { "application/xml", "application/json" })
	public ResponseEntity<String> deleteTicket(@PathVariable String pnr) {

		String deleteTicketBypnr = service.deleteTicketBypnr(pnr);
		return new ResponseEntity<String>(deleteTicketBypnr, HttpStatus.OK);
	}
}
