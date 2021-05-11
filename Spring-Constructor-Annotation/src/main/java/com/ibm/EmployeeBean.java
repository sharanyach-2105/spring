package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
	
	private String fullName;
	private DepartmentBean departmentBean;
	
	@Autowired
	public EmployeeBean(DepartmentBean departmentBean)
	{
		this.departmentBean = departmentBean;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
}
