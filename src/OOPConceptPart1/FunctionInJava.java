package OOPConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		int j=obj.pqr();
		System.out.println(j);
	String s1=obj.qa();
	System.out.println(s1);
	int div=obj.division(30,10);
	System.out.println(div);
	
	}

	
	//when creating object all static method given to object

	//not non static methods
	//void------doesnot return anything
	//return type=void
public void test() {//no input no output
	System.out.println("test method");
}




//return type =int
public int pqr() {//no input some output
	System.out.println("pqr method");
	int a=10;
	int b=20;
	int c=a+b;
	
	return c;
}



//return type =string
public String qa() {//no input some output
	System.out.println("qa method");
	String s="selenium";
	return s;
}



//return type =int
//x,y are input parameters or arguments
public int division(int x , int y) {
	System.out.println("division method");
	int d=x/y;
	return d;
	 
}
}
