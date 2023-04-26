package project10;

//Visa
public class VisaCreditCard extends CreditCard {

	// Attributes..
	private String cardType;
	private int creditLimit;
	private int annualCharge;
	
	// Constructor..
	public VisaCreditCard(int creditLimit, int annualCharge) {
		
		this.cardType = "Visa";
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
