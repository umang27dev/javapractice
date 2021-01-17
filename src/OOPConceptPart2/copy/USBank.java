package OOPConceptPart2.copy;

public interface USBank {//multiple inheritence by use of impliments
	
	int min_bal=100;
	
	public void credit();//in interface we not give method body
	
	public void debit();

	public void transfermoney();
	
	//only method declaration no mrthod body only method protoype
	//in interface we can declare the variables and these are by default static in nature
	//value of variable will not be change,its final not static in nature
	//no static method in interface
	//we can not creat object of interface
	//interface is abstract in nature
	
}
