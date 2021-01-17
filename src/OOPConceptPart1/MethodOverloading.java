package OOPConceptPart1;

public class MethodOverloading {
//we can not creat method inside method and same method with same parameter
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		
	}
	//we can overload main method and other method but different data types
	public static void main(int k) {
		
	}
	
	
	//method overloading : when method is same with different arguments or input parameters with in the same class
	public void sum() {//0 input parameter
		}
	
	public void sum(int i) {//1 input parameter
		
	}
public void sum(int i , int k) {//2 input parameter
		
	} 


}
