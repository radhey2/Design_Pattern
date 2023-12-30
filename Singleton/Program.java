package DesignPattern.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {

	public static void main(String[] args) {
//		SingletonExample singletonExample = new SingletonExample();

		// multithreaded env singleton obj is created more than once it is violated Singleton design

//		ExecutorService executorService = Executors.newCachedThreadPool();
//		Runnable createFirstObj1 = () -> printFirstMessage();
//		executorService.execute(createFirstObj1);
//
//		Runnable createSecondObj2 = () -> printSecondMessage();
//		executorService.execute(createSecondObj2);
//
//		Runnable createThirdObj3 = () -> printThirdMessage();
//		executorService.execute(createThirdObj3);
//
//		executorService.shutdown();

		// Singleton example
//		SingletonExample singletonExample =SingletonExample.getA();


//		// normal approach
//		Demo demo = new Demo();
//		Demo demo2 = new Demo();
//		Demo demo3 = new Demo();
//		demo3.printMessage();

		SingletonEnum.instance.print("Message from First obj");
		SingletonEnum.instance.print("Message from Second obj");
		SingletonEnum.instance.print("Message from Third obj");

//		can not create obj foe Enums
//		SingletonEnum singletonEnum = new SingletonEnum();

	}

//	private static void printFirstMessage() {
//
//		SingletonExample singletonExample1 = SingletonExample.getA();
//		singletonExample1.getMessage("Message from first obj");
//	}

//	private static void printSecondMessage() {
//
//		SingletonExample singletonExample1 = SingletonExample.getA();
//		singletonExample1.getMessage("Message from Second obj");
//	}
//	private static void printThirdMessage() {
//
//		SingletonExample singletonExample1 = SingletonExample.getA();
//		singletonExample1.getMessage("Message from Third obj");
//	}
}
