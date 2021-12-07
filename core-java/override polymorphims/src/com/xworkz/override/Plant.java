package com.xworkz.override;

public class Plant {
	private String name;
	private boolean alive;
	private float lifeSpan;
	private PlantType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public float getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(float lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public PlantType getType() {
		return type;
	}

	public void setType(PlantType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("invoked the toString ");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj!= null) {
			if (obj instanceof Plant) {
				Plant casted = (Plant) obj;
				PlantType ref = casted.getType();
				System.out.println("Life of the plant:" + ref);
				String ref1 = casted.getName();
				System.out.println("Plant name:" + ref1);
				if (this.type.WEL.equals(ref) && this.name.equals(ref1)) {
					System.out.println("data is matching");
					return true;
				}
			}
		}
		return false;
	}
}
