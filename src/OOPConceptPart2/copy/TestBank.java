package OOPConceptPart2.copy;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);//can be called by class name because static variable
		//USBank.min_bal = 200 ;//we not change value
		
		
		
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		
		//dynamic polymorphism
		//child class object can be referred by parent interface reference variable
		USBank b=new HSBCBank();
		

	}

}
