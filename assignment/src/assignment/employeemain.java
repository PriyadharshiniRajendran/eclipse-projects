package assignment;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employeeservice service = (Employeeservice)context.getBean("service");
		Employee employee = (Employee) context.getBean("EmployeeObject");
		

		Scanner sc=new Scanner(System.in);
		int n;
		String empname;
		double salary;
		String empdes;
		System.out.println("******** Employee Management System ********");
		System.out.println("1)Add   2)Delete by Id  3)Display All  4)Update by id  5)Exit");
		
			System.out.println("***Enter your choice***");
		n=sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("**** Performing Insert ****");
			System.out.println("Enter id, name, salary, description");
			System.out.println("Enter id");
			employee.setEmpid(sc.nextInt());
			System.out.println("Enter name");
			employee.setEmpname(sc.next());
			System.out.println("Enter salary");
			employee.setSalary(sc.nextDouble());
			System.out.println("Enter description");
	        employee.setEmpdes(sc.next());
			service.add(employee);
			System.out.println("**** Employee information stored successfully ****");
			break;
		case 2:
			System.out.println(" *** Performing Delete ***");
			n=sc.nextInt();
			service.delete(employee);
			System.out.println(" Employee deleted successfully ");
			break;
		case 3:
			
			System.out.println("***display all***");
			List<Employee> EmployeeList = service.getEmployees();
			for(Employee e : Employee)
		case 4:
			System.out.println(" ***Main menu exits*** ");
			System.out.println(" ****Thank you for visiting***** ");
			break;
		default:
			break;
		}
		
		
	
	
}
}
