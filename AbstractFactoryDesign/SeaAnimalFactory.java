package DesignPattern.AbstractFactoryDesign;

public class SeaAnimalFactory extends AnimalFactory{

	@Override
	public IAnimal getAnimal(String animal) {
		if(animal.equals("Shark")){
			return new Shark();
		}else if (animal.equals("Octopus")){
			return new Octopus();
		}
		else {
			System.out.println("invalid Sea Animal Type");
			return null;
		}
	}
}
