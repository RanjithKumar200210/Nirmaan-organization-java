package day17;




class son{
	int money= 1000;
	String name="sri ram";
}

class dad extends son{
	
}
public class inheritance {
public static void main(String[] args) {
	

	dad d1=new dad();
System.out.println(d1.money);
System.out.println(d1.name);
}
}
