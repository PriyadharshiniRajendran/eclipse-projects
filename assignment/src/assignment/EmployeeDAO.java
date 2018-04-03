package assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	public void add(Employee e)
	{
	template.update("insert into employee values(?, ?, ?)",new Object[] {e.getEmpid(),e.getEmpname(),e.getsalary(),e.getEmpname()});
	}
	
	public void delete(Employee e)
	{
		template.update("delete from employee where id=e.getEmpid");
	}
	public List<Employee> getAllEmployees() {
		List<Employee> list = template.query("select * from Employee", 
				new EmployeeRowMapper());
		return list;
	}


}
