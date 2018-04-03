package assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Employeeservice {
  @Autowired
   private EmployeeDAO dao;
  public void add(Employee e){
	  
	  dao.add(e);  
  }
  public void delete(Employee e){
	  dao.delete(e);
  }
  public List<Employee> getEmployees() {
		return dao.getAllEmployees();
	}


}
