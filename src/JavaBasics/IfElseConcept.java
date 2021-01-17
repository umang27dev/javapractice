package JavaBasics;

public class IfElseConcept {//comparison operator

	public static void main(String[] args) {
		int a=30;
		int b=20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		//comparison operators;
		//<,>,<=,>=,==,!=
		//= 'this operator is used to assign the value'
		//logic to find heigher no.
		int a1=400;
		int b1=500;
		int c1=300;
		//nested if else
		if (a1>b1 & a1>c1) {//false and true is equal to false
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is greatest");
		}
		else{
			System.out.println("c1 is the greatest");
		}
	}

}
