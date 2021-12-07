package com.xworkz.dto;

import com.xworkz.dto.ApplicationDTO;

public class InstagramDTO extends ApplicationDTO{
	private int totalUsers;
	private String serverLocation;
	public InstagramDTO() {
		// TODO Auto-generated constructor stub
	}
	public InstagramDTO(int totalUsers, String serverLocation,String name, String company, String version, String founder) {
		super(name,company,version,founder);
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}
	public int getTotalUsers() {
		return totalUsers;
	}
	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}
	public String getServerLocation() {
		return serverLocation;
	}
	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}
}
