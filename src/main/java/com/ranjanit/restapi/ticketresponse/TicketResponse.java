package com.ranjanit.restapi.ticketresponse;



import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class TicketResponse {
	private Integer ticketId;
	private String  status;
	private Double  cost;
	private String  from;
	private String  to;
	private String  pnr;
	private String  jdate;
	private String  name;

}
