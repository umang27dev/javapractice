package OOPConceptPart1;

public class CallByRefrenceAndCallByValue {
	int p;
	int q;
	

	public static void main(String[] args) {
	
		CallByRefrenceAndCallByValue obj= new CallByRefrenceAndCallByValue();
		int x=10;
		int y=20;
		obj.testSum(x,y);//call by value and pass by value\
		
		obj.p=50;
		obj.q=60;
		
		
		obj.swap(obj);
		//after swap 
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testSum(int a,int b) {
		a=30;
		b=40;
		//above values not change value of x and y
		int c= a+b;
		return c;
	}
	//call by refrence
	public void swap(CallByRefrenceAndCallByValue t) {
		int temp;
		temp=t.p;//temp=50
		t.p=t.q;//t.p=60
		t.q=temp;//t.q=50
		
		
	}
	

}
