package DesignPattern.prototypeDesignP;

public abstract class Dept implements Cloneable{

	private String deptId;
	protected String  deptType;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	// abstract method ;

	abstract void rank();

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
