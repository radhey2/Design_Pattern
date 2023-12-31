package DesignPattern.ChainOfResponsibilityP;

public class ServiceBased implements IJobChain{


	private IJobChain jobChain;
	@Override
	public void setNextChain(IJobChain jobChain) {
		this.jobChain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("SERVICE BASED")){
			System.out.println("Selected in SERVICE BASED");
		}else {
			System.out.println("Got Rejected in SERVICE BASED");
			System.out.println("Need More Practice");
		}
	}
}
