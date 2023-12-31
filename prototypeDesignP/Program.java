package DesignPattern.prototypeDesignP;

public class Program {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeptCache.loadDeptCache();

		Dept cloneEce = DeptCache.getDeptDetails("ECE");
		cloneEce.rank();
		System.out.println("Dept name : "+cloneEce.getDeptId());

		Dept cse = DeptCache.getDeptDetails("CSE");
		cse.rank();
		System.out.println("Dept name : "+cse.getDeptId());
	}
}
