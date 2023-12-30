package DesignPattern.Singleton;

public enum SingletonEnum {
	instance;

	public void print(String message){
		System.out.println("Message : "+message);
	}
}
