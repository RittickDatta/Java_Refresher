package rittick.code.classes;

public class Employee {
	private String name;
	private String location;
	private String department;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public String getDepartment(){
		return this.department;
	}
	
	public void displayInfo(){
		System.out.println("Name: "+getName());
		System.out.println("Location: "+getLocation());
		System.out.println("Department: "+getDepartment());
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setName("John");
		employee.setLocation("US");
		employee.setDepartment("IT");
		employee.displayInfo();
	}
}
