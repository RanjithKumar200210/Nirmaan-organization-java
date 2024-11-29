package Day6;

public class nirmaanOrganaisation {
	int id=0;
	String name="";
	float salary=0;
	String department="";
	
	void checkin(String inTime) {
		System.out.println(inTime);
	}
	void checkout(String outTime) {
		System.out.println(outTime);
	}
	
	public static void main(String[]args){
		nirmaanOrganaisation emp1=new nirmaanOrganaisation();
		emp1.id=1234;
		emp1.name="ranjith";
		emp1.salary=10000.77f;
		emp1.department="cse";
		emp1.checkin("checkin time 9clock");
		emp1.checkout("checkout time 5clock");
		System.out.println("");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		System.out.println(emp1.department);
		
	}
}
