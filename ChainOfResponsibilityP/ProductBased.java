package DesignPattern.ChainOfResponsibilityP;

public class ProductBased implements IJobChain{

	private IJobChain jobChain;
	@Override
	public void setNextChain(IJobChain jobChain) {
		this.jobChain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("PRODUCT BASED")){
			System.out.println("Selected in PRODUCT BASED");
		}else {
			System.out.println("Got Rejected in PRODUCT BASED");
			System.out.println("Apply for Service Based ");
			this.jobChain.getJob(person);
		}
	}
}
