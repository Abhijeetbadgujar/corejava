package com.xworkz.airport.airportService;


import com.xworkz.airport.dao.AirportDAO;
import com.xworkz.airport.entity.AirportEntity;


public class AirportServiceImpl implements AirportService {
	

	private AirportDAO dao;
	boolean valid = true;

	public AirportServiceImpl(AirportDAO airportDAO) {
		this.dao = airportDAO;
	}

	@Override

	public boolean validataAndSave(AirportEntity airportEntity) {
		// try {
		if ((airportEntity.getName() != null || airportEntity.getName().length() >= 3)
				&& airportEntity.getName().length() <= 300) {
			valid = true;
		} else {
			System.out.println("Name is invalid");
			System.out.println(airportEntity.getName().length());
			valid = false;
			return valid;
		}

		if ((airportEntity.getPassword() != null &&  airportEntity.getPassword().length() >= 4)
				&& airportEntity.getPassword().length() <= 5000) {
			valid = true;
		} else {
			System.out.println("name is invalied");
			valid = false;
			return valid;
		}

		if ((airportEntity.getLocation() != null && airportEntity.getLocation().length() >= 4)
				&& airportEntity.getPassword().length() <= 500) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getCity() != null && airportEntity.getCity().length() >= 4)
				&& airportEntity.getPassword().length() <= 500) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getState() != null && airportEntity.getState().length() >= 4)
				&& airportEntity.getState().length() <= 400) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getDomastic_flights() != 0 && airportEntity.getDomastic_flights() >= 4)
				&& airportEntity.getDomastic_flights() <= 50000) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getInternational_flights() != 0 && airportEntity.getInternational_flights() >= 4)
				&& airportEntity.getInternational_flights() <= 600) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getCapacity() != 0 && airportEntity.getCapacity() >= 4)
				&& airportEntity.getCapacity() <= 5000) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getNo_of_runways() != 0 && airportEntity.getNo_of_runways() >= 2)
				&& airportEntity.getNo_of_runways() <= 5000) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if (airportEntity.isRepair_center() != false) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if (airportEntity.isInternational_or_not() != false) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getNo_of_gates() != 0 && airportEntity.getNo_of_gates() >= 4)
				&& airportEntity.getNo_of_gates() <= 500) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getCreated_By_name() != null && airportEntity.getCreated_By_name().length() >= 4)
				&& airportEntity.getCreated_By_name().length() <= 500) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getCreated_By_dateWithSeconds() != null /*
																	 * && airportEntity.getCreated_By_dateWithSeconds().
																	 * length() >= 4)
																	 */)) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if ((airportEntity.getUpdate_By() != null && airportEntity.getUpdate_By().length() >= 4)
				&& airportEntity.getUpdate_By().length() <= 500) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}      

		if ((airportEntity.getUpdate_AT() != null/* && airportEntity.getUpdate_AT().length() >= 4) */)) {
			valid = true;
		} else {
			System.out.println("name is invalid");
			valid = false;
			return valid;
		}

		if (valid) {
			dao.save(airportEntity);
			
		}
		return false;
	}
}
