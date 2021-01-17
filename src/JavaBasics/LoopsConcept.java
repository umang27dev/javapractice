package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
  //1.while loop:
		int i=1;//initialization
		while(i<=10) {//conditional part
			System.out.println(i);
			i=i+1;//if we not give incremental and dectremental part it give infinite loop this is disadvantage
			
		}
		//j++ means j=j+1
		System.out.println("***************");
//2.for loop
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
	//print 10 to 1
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
	}

}
