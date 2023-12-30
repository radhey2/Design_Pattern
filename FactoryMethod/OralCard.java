package DesignPattern.FactoryMethod;

public class OralCard implements ICreditCard {
	@Override
	public String getCardType() {
		return "Oral Card";
	}

	@Override
	public int getAnnualFee() {
		return 500;
	}

	@Override
	public int getCardLimit() {
		return 500000;
	}
}
