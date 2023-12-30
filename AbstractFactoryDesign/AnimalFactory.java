package DesignPattern.AbstractFactoryDesign;

public abstract class AnimalFactory {

	public abstract IAnimal getAnimal(String animal);

	public static AnimalFactory createAnimalFactory(String factoryType){
		if(factoryType.equals("Sea")){
			return new SeaAnimalFactory();
		} else if (factoryType.equals("Land")) {
			return new LandAnimalFactory();
		}else {
			System.out.println("Invalid Factory");
			return null;
		}

	}

}
