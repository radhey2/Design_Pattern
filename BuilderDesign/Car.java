package DesignPattern.BuilderDesign;

import java.nio.CharBuffer;

public class Car {

	// Mandatory Attribute
	public String steeringWheel;
	public String brake;
	public String mirror;

	// Optional Attribute
	public String ac;
	public String musicSystem;
	public String seatCover;

	// Mention both mandatory and optional parameter
	public Car(CarBuilder carBuilder){
		this.ac = carBuilder.ac;
		this.seatCover = carBuilder.seatCover;
		this.mirror = carBuilder.mirror;
		this.musicSystem = carBuilder.musicSystem;
		this.brake = carBuilder.brake;
		this.steeringWheel = carBuilder.steeringWheel;
	}

	@Override
	public String toString() {
		String sc  = "Car Details : ";
		sc += "Steering Wheel : " +steeringWheel;
		sc += ", brake : " +brake;
		sc += ", mirror : " +mirror;
		sc += ", AC : " +ac;
		sc += ", Music System : " +musicSystem;
		sc += ", Seat Cover : " +seatCover;
		return sc;
	}

	public static class CarBuilder{
		// Mandatory Attribute
		public String steeringWheel;
		public String brake;
		public String mirror;

		// Optional Attribute
		public String ac;
		public String musicSystem;

		public String seatCover;

		// to set mandatory Attribute use constructor
		public CarBuilder(String steeringWheel,String brake,String mirror){
			this.steeringWheel = steeringWheel;
			this.brake = brake;
			this.mirror = mirror;
		}

		// Optional Attribute using setters methods
		public CarBuilder setAc(String ac) {
			this.ac = ac;
			return this;
		}

		public CarBuilder setMusicSystem(String musicSystem) {
			this.musicSystem = musicSystem;
			return this;
		}

		public CarBuilder setSeatCover(String seatCover) {
			this.seatCover = seatCover;
			return this;
		}

		// Method use for creating the object
		public Car build(){
			return new Car(this);
		}
	}

}
