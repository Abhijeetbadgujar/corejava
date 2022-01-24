package com.xworkz.product.stater;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;


public class ProductStater {

	public static void main(String[] args) {

		//ProductEntity entity=new ProductEntity(1, "tyre", 4, "goodyear", 2500, 4);
		//ProductEntity entity1=new ProductEntity( "tyre", 4, "MRF", 2800, 5);
		ProductEntity entity3=new ProductEntity("tyresssss", 4, "MRF", 2800, 5);

		//ProductDAO dao=new ProductDAOImpl();
		//dao.save(entity);
		
		List<ProductEntity> productEntitiess=new ArrayList<ProductEntity>();
		ProductDAO dao=new ProductDAOImpl();
		//dao.save(entity3);
		
	/*	dao.addAll(entity1);
		productEntitiess(new ProductEntity(3,"pullover",5,"bing human",800,4));
		productEntities(new ProductEntity(4,"dress",5,"bing human",800,4));
		productEntities(new ProductEntity(5,"pants",5,"bing human",800,4));
		productEntities(new ProductEntity(6,"shirt",5,"bing human",800,4));
		productEntities(new ProductEntity(7,"t-shirt",5,"bing human",800,4));
		productEntities(new ProductEntity(8,"jacket",5,"bing human",800,4));
		productEntities(new ProductEntity(9,"shorts",5,"bing human",800,4));
		productEntities(new ProductEntity(10,"nightdress",5,"bing human",800,4));
		productEntities(new ProductEntity(11,"jenes",5,"bing human",800,4));

		dao.saveAll(productEntitiess);
		System.out.println(dao);
		*/
		System.out.println("-----------------------");
		dao.getAll();
		
		System.out.println("----------------------");
		
		System.out.println(dao.getBypriceGreaterThan(550));
		System.out.println(dao.getBypriceGreaterThan(550).size());
		
		System.out.println("-------------*---------");

		System.out.println(dao.getBypriceLessThan(80));
		System.out.println(dao.getBypriceLessThan(80).size());
		
		System.out.println("------------*----------");

	//	System.out.println(dao.getByNameAndId("tyre",22));
		
	//	System.out.println("------------*------------");
		
		System.out.println(dao.getTotalName());
		
		System.out.println("----------------------");
		
		System.out.println(dao.getMaxPrice());

		System.out.println("----------*------------");

		System.out.println(dao.getTotalPrice());
		
		System.out.println("----------*------------");

	}

	
	

	

	

	

}
