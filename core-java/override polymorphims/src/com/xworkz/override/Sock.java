package com.xworkz.override;

public class Sock {
	private Size size;
	private int price;
	private Material material;
	private SockType type;

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("invoked the toString");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("invoked the hashCode");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Passed value is not null");
			if (obj instanceof Sock) {
				Sock created = (Sock) obj;
				Size ref = created.getSize();
				// System.out.println("sock size:"+ref);

				Material ref1 = created.getMaterial();
				// System.out.println("material of sock:"+ref1);

				SockType ref2 = created.getType();
				// System.out.println("sock type:"+ref2);

				if (this.size.equals(ref) && this.material.equals(ref1) && this.type.equals(ref2)) {
					System.out.println("datatype is matched");
					return true;

				} else {
					System.err.println("data is mismatch");
					return false;
				}
			}

		}
		return false;
	}
}
