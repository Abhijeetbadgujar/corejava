package com.xworkz.override;

public class Newspaper {
	private String name;
	private int lang;
	private int since;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	@Override
	public String toString() {
		System.out.println("invoked the tostring");
		return super.toString();
	}
	@Override
	public int hashCode() {
		System.out.println("invoked the hashcode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Newspaper) {
				Newspaper casted=(Newspaper)obj;
				String ref=casted.getName();
				System.out.println("newspaper since:"+ref);
				if(this.name.equals(ref)) {
					System.out.println("datatype is match");
					return true;
				}
			}else {
				System.err.println("cant converting the datatype");
				return false;
			}
		}else {
			System.err.println("obj is null");
			return false;
		}
	
	return false;
	}
}
