package DesignPattern.FactoryMethod;

import java.util.logging.Logger;

public class Program {

	public static final Logger logger = Logger.getLogger("Program");
	public static void main(String[] args) {
	String cardType= "Platinum";
		ICreditCard creditCard = null;

		if(cardType.equals("Platinum")){
			creditCard = new PlatinumFactory().cardFactory();
		} else if (cardType.equals("Oral")) {
			creditCard = new OralCardFactory().cardFactory();
		}else {
			logger.info("Invalid Card");
		}
		logger.info("Printing card Details");
		if(creditCard!=null){
			logger.info("Card Type : "+creditCard.getCardType());
			logger.info("Card Fee : "+creditCard.getAnnualFee());
			logger.info("Card Limit : "+creditCard.getCardLimit());
		}
	}
}
