package day14;

public class Employee {
private String name;
private int id;
private long phNumber;
private String department;
public Employee() {
	
}

public Employee(String name, int id, long phNumber, String department) {
	super();
	this.name = name;
	this.id = id;
	this.phNumber = phNumber;
	this.department = department;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getPhNumber() {
	return phNumber;
}
public void setPhNumber(long phNumber) {
	this.phNumber = phNumber;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", phNumber=" + phNumber + ", department=" + department + "]";
}

}
