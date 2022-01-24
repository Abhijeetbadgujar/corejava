package com.xworkz.tourist.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "website_detailss")
@NamedQueries ({@NamedQuery(name = "GetByNameflipkart",
		query = "select web from WebsiteEntity web where web.name='Mit'"),
				@NamedQuery(name ="getByLikeUrlX",
		query = "select web from WebsiteEntity web where web.url='www.Mit.com'")})
public class WebsiteEntity implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name = "w_id")
	private int id;
	@Column(name = "w_name")
	private String name;
	@Column(name = "w_url")
	private String url;
	@Column(name = "w_since")
	private int since;
	@Column(name = "w_owner")
	private String owner;
	@Column(name = "w_domain")
	private String domain;

	public WebsiteEntity() {
		// TODO Auto-generated constructor stub
	}

	public WebsiteEntity( String name, String url, int since, String owner, String domain) {
		super();
		this.name = name;
		this.url = url;
		this.since = since;
		this.owner = owner;
		this.domain = domain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [id=" + id + ", name=" + name + ", url=" + url + ", since=" + since + ", owner=" + owner
				+ ", domain=" + domain + "]";
	}
}
