package project10;

// American Express
public class AmericanExpressCreditCard extends CreditCard {

	// Attributes..
	private String cardType;
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public AmericanExpressCreditCard(int creditLimit, int annualCharge) {
		
		this.cardType = "AmericanExpress";
		this.creditLimit = creditLimit;
		this.annualCharge = annualCharge;
		
	}

	// Methods..
	@Override
	public String CardType() {
		
		return cardType;
		
	}

	@Override
	public int CreditLimit() {
		
		return creditLimit;
		
	}

	@Override
	public int AnnualCharge() {
		
		return annualCharge;
		
	}
	
}
