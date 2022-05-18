package com.abhi.jerseydemo.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.abhi.jerseydemo.model.Message;
import com.abhi.jerseydemo.services.MessageServices;

@Path("/messagesss")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class MessengeResoureces {

	MessageServices messageservices= new MessageServices();
	
	@GET		//@Get- get is want to getting somethings
	@Produces(MediaType.APPLICATION_XML)	// @produces- what the return formate
	public List<Message> getMessenger() {
		return messageservices.getAll();
	}
}
