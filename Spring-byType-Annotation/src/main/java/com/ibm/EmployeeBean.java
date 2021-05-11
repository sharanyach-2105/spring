package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
	private String fullName;
	
	@Autowired
	private DepartmentBean departmentBean;
	
	//getters and setters

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	@Override
	public String toString() {
		return "EmployeeBean[fullName=" +fullName + ", departmentBean=" +departmentBean +"]";
	}

}