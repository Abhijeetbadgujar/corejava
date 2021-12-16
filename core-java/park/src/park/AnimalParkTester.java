package park;

//import park.safaripark.FlowerPark;
//import park.safaripark.Snakepark;
import park.safaripark.*;

public class AnimalParkTester {

	public static void main(String[] args) {
		
		//same package variable using private
		AnimalPark animalpark=new AnimalPark();
		animalpark.setName("siddhrt");
		animalpark.setTypeOfAnimal("aggresive");
		System.out.println("Name of AnimalPark:"+animalpark.getName());
		System.out.println("Type of animal in park:"+animalpark.getTypeOfAnimal());
		
		//same package constructor using public
		Quantity animalPark2=new Quantity(12,10);
		System.out.println("In Park no of Zoo:"+animalPark2.noOfZoo);
		System.out.println("In Park no. of Animal:"+animalPark2.noOfAnimal);
		
		//same pakage method using default
		AreaPark animalPark3=new AreaPark(); 
		animalPark3.area=3000.5f;
		animalPark3.price=99.5f;
		animalPark3.DisplayDetails();
		
		//diff pakage variable using public
		FlowerPark flowerPark=new FlowerPark();
		flowerPark.setArea(4000);
		flowerPark.setNoOfFlower(100);
		System.out.println("the flowerpark area:"+flowerPark.getArea());
		System.out.println("In Flower park No. of flower:"+flowerPark.getNoOfFlower());
		
		//diff pakage constructor using public
		Snakepark snakepark=new Snakepark(55,280);
		System.out.println("IN AnimalPark type of snake:"+snakepark.typeOfSnake);
		System.out.println("In AnimalPark no. of snake:"+snakepark.noOfSnake);
	
		//diff pakage method using public
		FishPark fishpark=new FishPark();
		fishpark.bigFish="shark";
		fishpark.lenght=60.3f;
		fishpark.DisplayDetails();
	}

}
