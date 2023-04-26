//Avlokita Sharma
//CECS 277Project 10
//Due: 11/29/2021

package project10;

//Factory..
public class VisaFactory extends CardFactory {

	// Attributes..
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public VisaFactory(int creditLimit, int annualCharge) {
		
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}

	// credit card..
	@Override
	public CreditCard GetCreditCard() {
		
		return new VisaCreditCard(creditLimit, annualCharge);
		
	}
	
}
