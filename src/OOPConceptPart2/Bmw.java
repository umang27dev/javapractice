package OOPConceptPart2;

public class Bmw extends Car {//extends used for inheritence
//has a relationship
	//when same method is present in parent class and child class with same name and no. of argument it is called method overriding
	public void start() {//over ridden method
		System.out.println("Bmw-------start");
	}
	public void theftsafety() {
		System.out.println("Bmw-------threat safety");
	}

}
