package com.xworkz.dto;

public class WebSeriesDTO {
	String name;
	String genre;
	int cast;
	int noOfCharacters;
	int rating;
	int totalSeason;
	int totalEpisode;
	
	public WebSeriesDTO() {
		//System.out.println("invoked default constructor");
	}
	

	public WebSeriesDTO(String name, String genre, int cast, int noOfCharacters, int rating, int totalSeason,
			int totalEpisode) {
		super();
		this.name = name;
		this.genre = genre;
		this.cast = cast;
		this.noOfCharacters = noOfCharacters;
		this.rating = rating;
		this.totalSeason = totalSeason;
		this.totalEpisode = totalEpisode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getCast() {
		return cast;
	}

	public void setCast(int cast) {
		this.cast = cast;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTotalSeason() {
		return totalSeason;
	}

	public void setTotalSeason(int totalSeason) {
		this.totalSeason = totalSeason;
	}

	public int getTotalEpisode() {
		return totalEpisode;
	}

	public void setTotalEpisode(int totalEpisode) {
		this.totalEpisode = totalEpisode;
	}
	
}
