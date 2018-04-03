package com.org;

import javax.ws.rs.Path;

public class DemoREST {
	@Path("/demo")
	public class DemoREST {
		
		private static EmployeeService service = new EmployeeService();
		
		@Path("/simple")
		@GET
		@Produces(MediaType.APPLICATION_XML)
		public String test() {
			System.out.println("test() is called");
			return "<greeting>Hello RESTFul</greeting>";
		}
		
		//employee object wants to be returned to the client
		@GET
		@Path("/getCustomer")
		@Produces(MediaType.APPLICATION_XML)
		public Customer sendCustomer() {
			System.out.println("sendCustomer is called");
			Customer c = new Customer(111, "Rahul", 34);
			return c;
		}
		
		@Path("/storeCustomer")
		@POST
		@Consumes(MediaType.APPLICATION_XML)
		@Produces(MediaType.TEXT_PLAIN)
		public String recieveCustomer(Customer c) {
			//call to Service or DAO classes
			System.out.println("Id = "+c.getCustomerId());
			System.out.println("Name = "+c.getCustomerName());
			System.out.println("Age = "+c.getAge());
			return "Stored Successfully";
		}
		
		/*@Path("/allEmployees")
		@GET
		@Produces(MediaType.APPLICATION_XML)
		public List getAllEmployees() {
			return service.displayAll();
		}*/
		
		@Path("/storeEmp")
		@POST
		@Consumes(MediaType.APPLICATION_XML)
		@Produces(MediaType.TEXT_PLAIN)
		public String storeEmployee(Employee emp) {
			int count = service.insertObject(emp);
			return count+" Record added";
		}
		
		@Path("/update/{i}/{s}")	//update/555/87000
		@PUT
		@Produces(MediaType.APPLICATION_XML)
		public Employee updateEmployeeSalary(@PathParam("i")int id, 
				@PathParam("s") double salary) {
			Employee e = service.updateSalary(id, salary);
			return e;
		}
	}

}
