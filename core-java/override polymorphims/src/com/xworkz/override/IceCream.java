package com.xworkz.override;

public class IceCream {
	
	private String name;
	private Flaour flaour;
	private TypeIce type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flaour getFlaour() {
		return flaour;
	}

	public void setFlaour(Flaour flaour) {
		this.flaour = flaour;
	}

	public TypeIce getType() {
		return type;
	}

	public void setType(TypeIce type) {
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("invoked the toString");
		return "amol";
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!= null) {
			if (obj instanceof IceCream) {
				IceCream created = (IceCream) obj;
				Flaour ref = created.getFlaour();
				System.out.println("IceCream flavour:"+ref);
				
				TypeIce ref1=created.getType();
				System.out.println("type of icecream:"+ref1);
				if(this.flaour.equals(ref) && this.type.equals(ref1)) {
					System.out.println("datatype is match");
					return true;
				}
			
			}
			else {
				System.err.println("cant converting the datatype");
			}
		}
		
		return false;
	}
}
