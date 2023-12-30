package DesignPattern.AbstractFactoryDesign;

public class Shark implements IAnimal{
	@Override
	public String speak() {
		return "Can't Speak";
	}

	@Override
	public String type() {
		return "Shark";
	}
}
