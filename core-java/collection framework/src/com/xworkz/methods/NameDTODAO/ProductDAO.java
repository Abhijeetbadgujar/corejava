package com.xworkz.methods.NameDTODAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sun.javafx.collections.ArrayListenerHelper;

public class ProductDAO {
	
	private List<ProductDTO> collection=new ArrayList<ProductDTO>();
	public ProductDAO() {
		ProductDTO dao=new ProductDTO();
		ProductDTO dao1=new ProductDTO();
		ProductDTO dao2=new ProductDTO("AB12","abhi cargo","airoplane",999);
		ProductDTO dao3=new ProductDTO("AB13","ABHI","airoplane",1200);
		
		this.collection.add(dao);
		this.collection.add(dao1);
		this.collection.add(dao2);
		this.collection.add(dao3);
	}
	public boolean find(ProductSearch finder,ProductDTO match) {
		Iterator<ProductDTO> iterator=collection.iterator();
		while(iterator.hasNext()) {
			ProductDTO product=iterator.next();
			if (finder.expression(product, match)) {
				return product.equals(match);
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	/*public boolean operation(ProductSearch arg1,ProductDTO arg2) {
		Iterator<ProductDTO> iterator=collection.iterator();
		while(iterator.hasNext()) {
			ProductDTO product=iterator.next();
			if (arg1.expression(product, arg2)) {
				return true;
			}
		}
		return false;
	}*/
}
