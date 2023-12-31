package DesignPattern.ChainOfResponsibilityP;

public interface IJobChain {

	// setting next job
	public void setNextChain(IJobChain nextChain);
	public void getJob(Person person);
}
