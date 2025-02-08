package com.del;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class testme {

	public static void main(String[] args) {
//		System.out.println("Hello word");
//		
//		Employee emp1= new Employee("Ravi", null);
//
//		Employee emp2= new Employee("Ravi2", null);
//		
//		Department dep1= new Department(1, "Ravi");
//		Department dep2= new Department(2, "mine");
//		
//		List<Employee> updatedEmployeeList = new ArrayList<Employee>(); 
//		
//		List<Employee> employeeList = new ArrayList<Employee>();// Initialize the employee list
//		employeeList.add(emp1);
//		employeeList.add(emp2);
//				List<Department> departmentList = new ArrayList<Department>() ; // Initialize the department list
//
//				
//				employeeList.stream()
//			    .filter(emp -> departmentList.stream()
//			        .anyMatch(dept -> dept.getDepartmentName().equals(emp.getName())))
//			    .forEach(emp -> {
//			        emp.setStatus("active"); // update the status of the employee
//			        System.out.println("------>"+emp.getName());
//			        updatedEmployeeList.add(emp); // add the updated employee to the new list
//			    });
//
//			employeeList = updatedEmployeeList; // replace the old employeeList with the new list
//
//			updatedEmployeeList.stream().forEach((c) -> System.out.println(c.getName()+c.getStatus())); // print the updated employeeList

//		String originalInput = "test input"+"-"+"Hello world";
//		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
//
//		System.out.println("--------encodedString------>"+encodedString);
//		
		String mm="eyJyZXN0cmljdGlvblNldCI6W3sicmVzdHJpY3Rpb25Db2RlIjoiVlJDUCIsInJlc3RyaWN0aW9uVmFsdWUiOiJPIn0seyJyZXN0cmljdGlvbkNvZGUiOiJWUkNTIiwicmVzdHJpY3Rpb25WYWx1ZSI6Ik8ifSx7InJlc3RyaWN0aW9uQ29kZSI6IlZVQ1AiLCJyZXN0cmljdGlvblZhbHVlIjoiTyJ9XX0=";
		
		System.out.println(mm.length()%4);
		byte[] decodedBytes = Base64.getDecoder().decode(mm);

		
		String decodedString = new String(decodedBytes);
	System.out.println("----->"+decodedString);
		
	//	System.out.println("--------decodedString------>"+("eyJyZXN0cmljdGlvblNldCI6W3sicmVzdHJpY3Rpb25Db2RlIjoiVlJDUCIsInJlc3RyaWN0aW9uVmFsdWUiOiJPIn0seyJyZXN0cmljdGlvbkNvZGUiOiJWUkNTIiwicmVzdHJpY3Rpb25WYWx1ZSI6Ik8ifSx7InJlc3RyaWN0aW9uQ29kZSI6IlZVQ1AiLCJyZXN0cmljdGlvblZhbHVlIjoiTyJ9XX0==").endsWith("=="));
				

//		String str = "486f334e-f894-46e8-9d72-+7800f6ce1bb6+ravi.dhyani+1@gmail.com";
//		String[] parts = str.split("\\+", 2);
//		String firstPart = parts[0];
//		String secondPart = parts[1];
//		
//		System.out.println("===>"+firstPart+"---->"+secondPart);
//		
	}

}
