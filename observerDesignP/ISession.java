package DesignPattern.observerDesignP;

public interface ISession {

	public void register(IObserverStudent student);

	public void unRegister(IObserverStudent student);

	public void notifiedStudent();

	public String getUpdate(IObserverStudent student);
}
