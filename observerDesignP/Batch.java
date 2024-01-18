package DesignPattern.observerDesignP;

import java.util.ArrayList;
import java.util.List;

public class Batch implements ISession{
	List<IObserverStudent> registeredStudent;
	private String studyTopic;

	public Batch(){
		this.registeredStudent = new ArrayList<>();
	}

	@Override
	public void register(IObserverStudent student) {
		System.out.println("Registered student : " +student.getName());
		this.registeredStudent.add(student);
	}

	@Override
	public void unRegister(IObserverStudent student) {
		System.out.println("removed student : " +student.getName());
		this.registeredStudent.remove(student);
	}

	@Override
	public void notifiedStudent() {
		for (IObserverStudent student : registeredStudent){
			student.update();
		}
	}

	@Override
	public String getUpdate(IObserverStudent student) {
		if(registeredStudent.contains(student)){
			return this.studyTopic;
		}
		return null;
	}

	public void addStudyTopic(String studyTopic){
		System.out.println("Added the Study Topic : "+studyTopic);
		this.studyTopic= studyTopic;
	}
}
