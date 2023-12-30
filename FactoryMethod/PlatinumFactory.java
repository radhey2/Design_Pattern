package DesignPattern.FactoryMethod;

public class PlatinumFactory extends CreditCardFactory {
	@Override
	protected ICreditCard createFactory() {
		return new PlatinumCard();
	}
}
