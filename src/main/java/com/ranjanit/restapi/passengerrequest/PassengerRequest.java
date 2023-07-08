package com.ranjanit.restapi.passengerrequest;



import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class PassengerRequest {

	private String name;
	private String email;
	private Long   phno;
	private String from;
	private String to;
	private String jdate;
	private String trainNum; 
}
