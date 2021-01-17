package OOPConceptPart1;

public class Car {//class:It represents the set of properties or methods that are common to all objects of one type
	//class variable
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		//new Car() is the object of car class
		//new keyword is used to creat object
		Car a=new Car(); //object creation , here a:object reference variables
		Car b =new Car();
		Car c=new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		
		
		System.out.println(a.mod);
	System.out.println(b.wheel);
	//shifting of object refrences
	a=b;
	b=c;
	c=a;
			a.mod=10;
			System.out.println(a.mod);
			c.mod=20;
			System.out.println(a.mod);
	}

}
