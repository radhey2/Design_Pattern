package DesignPattern.AbstractFactoryDesign;

public class MainMethod {
	public static void main(String[] args) {
		IAnimal animal;
		AnimalFactory animalFactory = AnimalFactory.createAnimalFactory("Land");
		animal= animalFactory.getAnimal("Lion");
		System.out.println("Animal Factory type : " +animal.type());
		System.out.println("Animal Speak type : " +animal.speak());

		System.out.println();

		AnimalFactory animalFactory2 = AnimalFactory.createAnimalFactory("Sea");
		animal= animalFactory2.getAnimal("Octopus");
		System.out.println("Animal Factory type : " +animal.type());
		System.out.println("Animal Speak type : " +animal.speak());
	}
}
