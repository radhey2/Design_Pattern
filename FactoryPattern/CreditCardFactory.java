package DesignPattern.FactoryPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public abstract class CreditCardFactory {

	private final static Map<String, Supplier<ICreditCard>> whiteListedAggregators = new HashMap<>();

	static {
		whiteListedAggregators.put("101",PlatinumCard :: new);
		whiteListedAggregators.put("102",OralCard :: new);
	}

	public static ICreditCard getAggregatorInstance(String aggrId){
		Supplier<ICreditCard> aggrObj = whiteListedAggregators.get(aggrId.toUpperCase());

		if (aggrObj != null) {
			return aggrObj.get();
		} else {
			return null;
		}
	}
	public static ICreditCard getCreditCardDetails(String cardType){
		ICreditCard CreditCard = null;
		if(cardType == "Platinum"){
			return CreditCard=new PlatinumCard();
		} else if (cardType == "Oral") {
			return CreditCard=new OralCard();
		}else {
			System.out.println("Invalid Card");
		}
		return CreditCard;
	}

	protected abstract ICreditCard createFactory();
}
