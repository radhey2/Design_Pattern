package DesignPattern.prototypeDesignP;

import java.util.Hashtable;

public class DeptCache {

	private static Hashtable<String,Dept> deptHashtable = new Hashtable<>();

	// acting like backup creating
	public static Dept getDeptDetails(String deptId) throws CloneNotSupportedException {
		Dept dept =deptHashtable.get(deptId);
		return (Dept) dept.clone();
	}

	public static void loadDeptCache(){
		Cse cse =new Cse();
		cse.setDeptId("CSE");
		deptHashtable.put(cse.getDeptId(), cse);

		Ece ece = new Ece();
		ece.setDeptId("ECE");
		deptHashtable.put(ece.getDeptId(), ece);
	}
}
