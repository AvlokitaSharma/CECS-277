package project10;

// Credit Card..
public abstract class CreditCard {

	// Abstract methods..
	public abstract String CardType();
	public abstract int CreditLimit();
	public abstract int AnnualCharge();
	
	// To String..
	@Override
	public String toString() {
		
		return "Card Type:" + CardType() + "\n"
				+ "Credit Limit: $" + CreditLimit() + "\n" 
				+ "Annual Charge:$" + AnnualCharge();
		
	}
	
}
