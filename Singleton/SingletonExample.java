package DesignPattern.Singleton;

public class SingletonExample {

	// early Loading will load the instance before method invocation occupies memory
//	private static SingletonExample instance =new SingletonExample();

	//  Lazy Loading will load the instance when method is invoke or on demand so will save memory
	public static SingletonExample instance = null;

	// achieve thread saftey

//	public static volatile SingletonExample instance;
//	private static Object object= new Object();
	private SingletonExample(String message){
		System.out.println("private Constructor : "+message);
	}

	public static SingletonExample getA(String message){

//		SingletonExample singletonExample = instance;
//		if(singletonExample==null){
//			synchronized (object){
//				singletonExample =instance;
//				if(singletonExample ==null){
//					instance = singletonExample = new SingletonExample();
//				}
//			}
////			instance = new SingletonExample();

		if(instance==null){
			instance = new SingletonExample(message);
		}
//		return singletonExample;
		return instance;
	}

	public void getMessage(String message){
		System.out.println("message : "+message);
	}
}
