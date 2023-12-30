package DesignPattern.FactoryMethod;

public class OralCardFactory extends CreditCardFactory {
	@Override
	protected ICreditCard createFactory() {
		return new OralCard();
	}
}
