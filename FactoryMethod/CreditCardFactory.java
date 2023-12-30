package DesignPattern.FactoryMethod;


public abstract class CreditCardFactory {

	protected abstract ICreditCard createFactory();
	public ICreditCard cardFactory(){
		return createFactory();
	}

}
