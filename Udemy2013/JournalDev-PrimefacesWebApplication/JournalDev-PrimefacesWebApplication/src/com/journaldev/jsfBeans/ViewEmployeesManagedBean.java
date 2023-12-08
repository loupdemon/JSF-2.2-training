package com.journaldev.data.jsfBeans;

import com.journaldev.data.Employee;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {

	private List<Employee> employees;

	@PostConstruct
	public void init() {
		employees = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#" + i);
			employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}
