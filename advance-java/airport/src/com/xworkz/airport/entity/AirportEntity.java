package com.xworkz.airport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.airport.entity.flightEnum.DOMASTIC_FLIGHTS;
import com.xworkz.airport.entity.flightEnum.INTERNATIONAL_FLIGHTS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "airport_detailssss")
public class AirportEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_password")
	private String password;
	@Column(name = "a_location")
	private String location;
	@Column(name = "a_city")
	private String city;
	@Column(name = "a_state")
	private String state;
	@Column(name = "a_domastic")
	private int domastic_flights;
	@Column(name = "a_international")
	private int international_flights;
	@Column(name = "a_capacity")
	private int capacity;
	@Column(name = "a_noOfRunways")
	private int no_of_runways;
	@Column(name = "a_repairCenter")
	private boolean repair_center;
	@Column(name = "a_international_R_not")
	private boolean international_or_not;
	@Column(name = "a_noOfGates")
	private int no_of_gates;
	@Column(name = "a_noOfArrival")
	private int no_of_arrival;
	@Column(name = "a_noOfDepatures")
	private int no_of_depatures;
	public AirportEntity( String name, String password, String location, String city, String state,
			int domastic_flights, int international_flights, int capacity, int no_of_runways, boolean repair_center,
			boolean international_or_not, int no_of_gates, int no_of_arrival, int no_of_depatures) {
		super();
		this.name = name;
		this.password = password;
		this.location = location;
		this.city = city;
		this.state = state;
		this.domastic_flights = domastic_flights;
		this.international_flights = international_flights;
		this.capacity = capacity;
		this.no_of_runways = no_of_runways;
		this.repair_center = repair_center;
		this.international_or_not = international_or_not;
		this.no_of_gates = no_of_gates;
		this.no_of_arrival = no_of_arrival;
		this.no_of_depatures = no_of_depatures;
	}




/*
@Data
//@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "airport_detailss")
public class AirportEntity {

	@Id
	@GeneratedValue
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_password")
	private String password;
	@Column(name = "a_location")
	private String location;
	@Column(name = "a_city")
	private String city;
	@Column(name = "a_state")
	private String state;
	@Column(name = "a_domastic")
	private DOMASTIC_FLIGHTS domastic_flights;
	@Column(name = "a_international")
	private INTERNATIONAL_FLIGHTS international_flights;
	@Column(name = "a_capacity")
	private int capacity;
	@Column(name = "a_noOfRunways")
	private int no_of_runways;
	@Column(name = "a_repairCenter")
	private boolean repair_center;
	@Column(name = "a_international_R_not")
	private boolean international_or_not;
	@Column(name = "a_noOfGates")
	private int no_of_gates;
	@Column(name = "a_noOfArrival")
	private int no_of_arrival;
	@Column(name = "a_noOfDepatures")
	private int no_of_depatures;

	public AirportEntity(String name, String password, String location, String city, String state,
			DOMASTIC_FLIGHTS domastic_flights, INTERNATIONAL_FLIGHTS international_flights, int capacity,
			int no_of_runways, boolean repair_center, boolean international_or_not, int no_of_gates, int no_of_arrival,int no_of_depatures) {
		super();
		this.name = name;
		this.password = password;
		this.location = location;
		this.city = city;
		this.state = state;
		this.domastic_flights = domastic_flights;
		this.international_flights = international_flights;
		this.capacity = capacity;
		this.no_of_runways = no_of_runways;
		this.repair_center = repair_center;
		this.international_or_not = international_or_not;
		this.no_of_gates = no_of_gates;
		this.no_of_arrival = no_of_arrival;
		this.no_of_depatures = no_of_depatures;
	}

	@Enumerated(EnumType.STRING)
	public DOMASTIC_FLIGHTS getDomastic_FLIGHTS() {
		return domastic_flights;
	}

	INTERNATIONAL_FLIGHTS getInternational_FLIGHTS() {
		return international_flights;
	}
*/
}
