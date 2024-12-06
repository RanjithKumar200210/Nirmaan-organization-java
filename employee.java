package day11;

public class employee {
	private int age;
	private String name;
	private	long phNumber;
	private String department;
	  
	 public employee(){
		
	}
	public employee(String name,int age,long phNumber,String department){
	this.name=name;
	this.age=age;
	this.phNumber=phNumber;
	this.department=department;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age){
		this.age=age;
	}
	public void setphNumber(long phNumber){
		this.phNumber=phNumber;
	}
	public void setdepartment(String name) {
		this.department=department;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public long getphNumber() {
		return phNumber;
	}
	public String getdepartment() {
		return department;
	}
	public String toString(){
		return "your name is"+name+"\nyour age is"+age+"\nyour phNumber is"+phNumber+"\nyour department is"+department;
	}
}
