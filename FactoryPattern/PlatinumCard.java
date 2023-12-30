package DesignPattern.FactoryPattern;

public class PlatinumCard implements ICreditCard {
	@Override
	public String getCardType() {
		return "Platinum Card";
	}

	@Override
	public int getAnnualFee() {
		return 100;
	}

	@Override
	public int getCardLimit() {
		return 100000;
	}
}
