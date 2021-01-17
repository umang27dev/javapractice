package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		//to convert 100  into integer or string to int
		int i=Integer.parseInt(x);//full form=parse into
		System.out.println(i+20);
		 //Integer,Boolean,double,Character these are wrapper classes
		//string to double conversion
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		//string to char is not available
		
		//integer to string
		int j=20;
		String s=String.valueOf(j);
		System.out.println(s+20);
		//number format exception
		String p="100a";
		int t=Integer.parseInt(p);
		
	}

}
