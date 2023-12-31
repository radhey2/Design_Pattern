package DesignPattern.prototypeDesignP;

public class Cse extends Dept{

	public Cse(){
		deptType = "CSE";
	}
	@Override
	void rank() {
		System.out.println("Inside rank Method CSE Dept : ");
	}
}
