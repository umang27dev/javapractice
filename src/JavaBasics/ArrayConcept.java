package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array to store similar data type values in a array variable
	/* 1.int array
	 * lowest bound/index=0
	 * upper bound/index=n-1(n is size of array)
	 */
		int i[] = new int[4];
	
	     i[0]=10;
	     i[1]=20;
	     i[2]=30;
	     i[3]=40;
	     System.out.println(i[2]);
	    //System.out.println(i[4]);//array index out of bound exception
	     System.out.println(i.length);//size length of array}
//to print all values of array
	     for(int j=0;j<i.length;j++) {
	    	 System.out.println(i[j]);
	     }
	     //disadvantages of array
	     //1.size is fixed hence called static array-----to overcome this problem we use collections ------arraylist,hashtable------use dynamic array
	     //stores only similar data types------to overcome this problem we use object array
	    //object array:object is a class
	     Object ob[]=new Object[6];
	    		 ob[0]="tom";
	    		 ob[1]=25;
	    		 }
}
