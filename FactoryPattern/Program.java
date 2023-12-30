package DesignPattern.FactoryPattern;

import java.util.logging.Logger;

public class Program {

	public static final Logger logger = Logger.getLogger("Program");
	public static void main(String[] args) {
//		ICreditCard creditCard = CreditCardFactory.getCreditCardDetails("Oral");
		ICreditCard creditCard = CreditCardFactory.getAggregatorInstance("102");
		if(creditCard!=null){
			logger.info("Card type : " +creditCard.getCardType());
			logger.info("Card fee : " +creditCard.getAnnualFee());
			logger.info("Card limit : " +creditCard.getCardLimit());
		}
	}
}
