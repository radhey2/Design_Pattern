package DesignPattern.prototypeDesignP;

import DesignPattern.Singleton.SingletonExample;

public class Test implements Cloneable{
	private int myField;
	public int getMyField() {
		return myField;
	}

	public void setMyField(int myField) {
		this.myField = myField;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Test test = new Test();
		test.setMyField(12);

		Test testClone = (Test) test.clone();
		Test testClone2 = (Test) test.clone();
		System.out.println("Original Obj : "+test.getMyField());
		System.out.println("Copy Obj : "+testClone.getMyField());
		System.out.println("Copy Obj2 : "+testClone2.getMyField());
	}
}
