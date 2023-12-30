package DesignPattern.AbstractFactoryDesign;

public class Octopus implements IAnimal{
	@Override
	public String speak() {
		return "Octopus is Speaking";
	}

	@Override
	public String type() {
		return "Octopus";
	}
}
