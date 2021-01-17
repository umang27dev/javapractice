package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	//global variable is availabel but static can called directly but non static only by object
	String name= "tom";//non static global variable
	static int age =25;//static global variable
	

	public static void main(String[] args) {
		
		//how to call static method and variable
	

		//1.direct method
			System.out.println(age);
				//calling by classname
				System.out.println(StaticAndNonStaticConcept.age);
				//for non static stuff
				StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
				obj.sendmail();
				System.out.println(obj.name);
		//static method by object
				obj.sum();//but warning is given
		
	}
public void sendmail() {//non static method
	System.out.println("send mail method");
}
public static void sum() {//static method
	System.out.println("sum method");
}
}
