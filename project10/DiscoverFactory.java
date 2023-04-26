package project10;

//Factory..
public class DiscoverFactory extends CardFactory {

	// Attributes..
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public DiscoverFactory(int creditLimit, int annualCharge) {
		
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}

	// credit card..
	@Override
	public CreditCard GetCreditCard() {
		
		return new DiscoverCreditCard(creditLimit, annualCharge);
		
	}
	
}
