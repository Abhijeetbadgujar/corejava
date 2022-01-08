package hibernatte.Runner;

import hibernate.dao.hiberCountryDTO;
import hibernate.dto.CountryImplement;
import hibernate.dto.CountryInterface;

public class CountryStater {

	public static void main(String[] args) {

		CountryInterface countryInterface=new CountryImplement();
		countryInterface.save(new hiberCountryDTO());
	}

}
