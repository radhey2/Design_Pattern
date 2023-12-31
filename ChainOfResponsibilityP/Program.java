package DesignPattern.ChainOfResponsibilityP;

public class Program {
	public static void main(String[] args) {
		MaangGroup maangGroup = new MaangGroup();
		ProductBased productBased = new ProductBased();
		ServiceBased serviceBased = new ServiceBased();
		maangGroup.setNextChain(productBased);
		productBased.setNextChain(serviceBased);

		Person person = new Person("SERVICE BASED");
		maangGroup.getJob(person);
		System.out.println();
		Person person2 = new Person("PRODUCT BASED");
		maangGroup.getJob(person2);



	}

}
