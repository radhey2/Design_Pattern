package DesignPattern.ChainOfResponsibilityP;

public class MaangGroup implements IJobChain{

	private IJobChain jobChain;
	@Override
	public void setNextChain(IJobChain jobChain) {
		this.jobChain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		if(person.getSkillType().equals("MAANG")){
			System.out.println("Selected in Manng");
		}else {
			System.out.println("Got Rejected in MAANG");
			System.out.println("Apply for Product Based ");
			this.jobChain.getJob(person);
		}
	}
}
