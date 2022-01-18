package com.xworkz.tourist.stater;

import com.xworkz.tourist.dao.WebsiteDAO;
import com.xworkz.tourist.dao.WebsiteDAOImpl;
import com.xworkz.tourist.entity.WebsiteEntity;

public class WebsiteStater {

	public static void main(String[] args) {

		WebsiteEntity entity=new WebsiteEntity( "facebook", "www", 1947, "abhi", ".com");
		WebsiteEntity entity1=new WebsiteEntity( "facebook", "www", 1947, "abhi", ".com");
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.save(entity);
		dao.save(entity1);
		dao.save(new WebsiteEntity( "microsoft", "www.microsoft.com", 2000, "bill gates", ".com"));
		dao.save(new WebsiteEntity( "apple", "www.apple.in", 1980, "tim cook", ".in"));
		dao.save(new WebsiteEntity( "Alibaba", "www.Alibaba.com", 2008, "jack ma", ".com"));
		dao.save(new WebsiteEntity( "flipkart", "www.flipkart.com", 2003, "sachin bansal", ".com"));
		dao.save(new WebsiteEntity( "amazon", "www.amazon", 2000, "andy jassy", ".com"));
		dao.save(new WebsiteEntity( "netflix", "www.netflix.com", 2012, "reed hastings", ".com"));
		dao.save(new WebsiteEntity( "parle", "www.parle.in", 1980, "vijay chauhan", ".in"));
		dao.save(new WebsiteEntity( "zandu bam", "www.zandu.in", 2000, "emami", ".in"));
		dao.save(new WebsiteEntity( "gucchi", "www.gucchi.com", 1947, "abhi", ".com"));
		dao.save(new WebsiteEntity( "reliance", "www.reliance.com", 1947, "abhi", ".com"));
		dao.save(new WebsiteEntity( "tata", "www.tata.com", 1947, "abhi", ".com"));
		dao.save(new WebsiteEntity( "amazon", "www.amazon", 2000, "andy jassy", ".com"));
		dao.save(new WebsiteEntity( "parle", "www.parle.in", 1980, "vijay chauhan", ".in"));
		dao.save(new WebsiteEntity("Alibaba", "www.Alibaba.com", 2008, "jack ma", ".com"));
		dao.save(new WebsiteEntity( "netflix", "www.netflix.com", 2012, "reed hastings", ".com"));
		dao.save(new WebsiteEntity( "gucchi", "www.gucchi.com", 1947, "abhi", ".com"));
		dao.save(new WebsiteEntity( "microsoft", "www.microsoft.com", 2000, "bill gates", ".com"));
		dao.save(new WebsiteEntity(  "amazon", "www.amazon", 2000, "andy jassy", ".com"));


	}

}
