package project10;

//Discover
public class DiscoverCreditCard extends CreditCard {

	// Attributes..
	private String cardType;
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public DiscoverCreditCard(int creditLimit, int annualCharge) {
		
		this.cardType = "Discover";
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

