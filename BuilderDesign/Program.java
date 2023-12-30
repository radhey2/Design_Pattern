package DesignPattern.BuilderDesign;

public class Program {
	public static void main(String[] args) {
		Car car = new Car.CarBuilder("SW","Hand","Left").build();
		System.out.println(car);
		Car car2 = new Car.CarBuilder("SW","Hand","Left").setAc("Yes").setMusicSystem("JBL").setSeatCover("Polished").build();
		System.out.println(car2);
	}
}
