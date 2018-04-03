package assignment;

public class Employee {
	private int empid;
	private String empname;
	private double salary;
	private String empdes;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, double salary, String empdes) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.empdes = empdes;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpdes() {
		return empdes;
	}
	public void setEmpdes(String empdes) {
		this.empdes = empdes;
	}
	public Object getsalary() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	
}
