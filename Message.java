package com.abhi.jerseydemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private int id;
	private String name;
	private String mess;
	
	public Message() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public Message(int id, String name, String mess) {
		super();
		this.id = id;
		this.name = name;
		this.mess = mess;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMess() {
		return mess;
	}
}
