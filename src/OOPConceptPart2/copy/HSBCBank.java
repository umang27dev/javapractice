package OOPConceptPart2.copy;

public class HSBCBank implements USBank,BrazilBank {
	//if a class is implimenting any interface , then is mandatory to define / override all methods of interface

	public void mutualfund() {
		System.out.println("brazil");
	}
	public void credit() {
		System.out.println("hsbc    credit");
	}
	
	public void debit(){
		System.out.println("hsbc    debit");
	}

	public void transfermoney(){
		System.out.println("hsbc  edu loan");
	}
	public void educationloan(){
		System.out.println("hsbc    yyyyyydebit");
	}

	public void carloan(){
		System.out.println("hsbc  edu loan");
	}
	
	
}
