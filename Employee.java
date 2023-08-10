package emp;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double salary;
	
	public Employee(String name, String jobTitle, double salary) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setjobTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void raiseSalary(double percentage) {
		salary=salary+salary*percentage/100;
	}
	public void printEmployeeDetails() {
	System.out.println("name -"+name);
	System.out.println("jobTitle -"+jobTitle);
	System.out.println("salary -"+salary+" Cr PA");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee empDeatils=new Employee("karthick","CEO",1000.5);

empDeatils.printEmployeeDetails();

empDeatils.raiseSalary(10);


		


		
		
		
	}
	

}
