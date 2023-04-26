package project10;

// Factory..
public class AmericanExpressFactory extends CardFactory {

	// Attributes..
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public AmericanExpressFactory(int creditLimit, int annualCharge) {
		
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}

	// credit card..
	@Override
	public CreditCard GetCreditCard() {
		
		return new AmericanExpressCreditCard(creditLimit, annualCharge);
		
	}
	
}
