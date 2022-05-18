package com.abhi.jerseydemo.services;

import java.util.ArrayList;
import java.util.List;

import com.abhi.jerseydemo.model.Message;

	public class MessageServices {

	public List<Message> getAll() {
		 Message m1=new Message(2, "Abhijeet", "started journy"); 
		 Message m2=new Message(3, "Abhi", "started journyeee");
		 
		 List<Message> list=new ArrayList<Message>();
		 list.add(m1);
		 list.add(m2);
		return list;

	}
}
