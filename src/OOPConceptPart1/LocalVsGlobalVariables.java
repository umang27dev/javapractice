package OOPConceptPart1;

public class LocalVsGlobalVariables {
	//global var-----class variable
	String name = "Tom";
		int age =25;

	public static void main(String[] args) {//since static or main method has different memory allocation in java space hence we not use its variable in object because object only use non static thing
		int i=10;//local variable
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}

	public void sum() {
		int i=10;
		int j=20;
		int age=25;
		
	}
}
