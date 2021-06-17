package com.ivan.polovyi.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employeeClassAdapter);
		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
		String designCard = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println("designCard = " + designCard);

		/** Using Object Adapter **/

		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		String designCard2 = businessCardDesigner.designCard(employeeObjectAdapter);
		System.out.println("designCard2 = " + designCard2);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Ivan Polovyi");
		employee.setJobTitle("Java Developer mid level");
		employee.setOfficeLocation("Sensedia, Campinas, SP");
	}
}
