package com.xworkz.things;

public class Tissue {
public Tissue() {
	System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor in tissue"));
}

public Boolean cleaner() {
	return true;
}

public String sucssion() {
	return "sucking the oil";
}

}
