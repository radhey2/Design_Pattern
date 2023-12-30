package DesignPattern.AbstractFactoryDesign;

public class LandAnimalFactory extends AnimalFactory{

	@Override
	public IAnimal getAnimal(String animal) {
		if(animal.equals("Dog")){
			return new Dog();
		}else if (animal.equals("Cat")){
			return new Cat();
		} else if (animal.equals("Lion")) {
			return new Lion();
		}
		else {
			System.out.println("invalid land Animal Type");
			return null;
		}


	}
}
