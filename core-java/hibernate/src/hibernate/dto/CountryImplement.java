package hibernate.dto;

import org.hibernate.cfg.Configuration;

import hibernate.dao.hiberCountryDTO;

public class CountryImplement implements CountryInterface{
	public void save(CountryInterface entity) {
		System.out.println("invoked the entity"+entity);
		
		Configuration configuration=new Configuration();
		configuration.configure();
	}

	@Override
	public void save(hiberCountryDTO hiberCountryDTO) {
		// TODO Auto-generated method stub
		
	}

}
