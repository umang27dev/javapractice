package OOPConceptPart2;

public class TestCar {
//static polymorphism or compile time polymorphism
	//poymorphism is method overriding or to take many forms
	public static void main(String[] args) {
		Bmw b= new Bmw();
		b.start();
		b.stop();
		b.engine();
		
		
		Car c=new Car();
		c.start();//parent object not inherit any property from child
		//top casting
		Car c1=new Bmw();//new object without any refrence
		//child class object can be referred by parent class refrence variable is called dynamic polymorphism or run time polymorphism
        c1.start();
        c1.stop();//only common/overridden and parent methods can be accessed 
        
        
        //down casting is not allowed it is only with sintax
        Bmw b1 = (Bmw)new Car();//this is allowed only compile time but runtime it give class cast exception

	}

}
