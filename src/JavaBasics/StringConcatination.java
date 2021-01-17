package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		String x="hello";
				String y="world";
				
				// + is concatination operator
				System.out.println(a+b);
				System.out.println(x+y);
				System.out.println(a+b+x+y);
				System.out.println(x+y+a+b);//left to right execution , x+y is sting and x+y+a is new string
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println("to print string directly");
		System.out.println("to use concatination operator:"+a);
	System.out.print("hello");	
	System.out.print("line not change without ln");//print ln is used to print on console with new line
	
	  String t= x.concat(y);
	System.out.println(t);
	String l = new String();
	String l1 = new String ("done");
	l.concat(l1);
	System.out.println(l);
	}

}
