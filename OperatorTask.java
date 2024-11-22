package day1;

public class OperatorTask {
public static void main(String[]args) {
	int firstNum=12;
	int secondNum=25;

	int Addition=firstNum+secondNum;
	System.out.println("Arithmetic Operations");
	System.out.println("Addition:"+(firstNum+secondNum));
	 int Substraction=firstNum-secondNum;
	 System.out.println("Substraction:"+Substraction);
	 System.out.println("Multiplication:"+(firstNum*secondNum));
	 System.out.println("Division:"+(firstNum/secondNum));
	 System.out.println("Modulus:"+(firstNum%secondNum));
	 System.out.println("");
	 
	 System.out.println("Relational operations");
	System.out.println("12>25:"+(firstNum>secondNum));
	System.out.println("12<25:"+(firstNum<secondNum));
	System.out.println("12>=25:"+(firstNum>=secondNum));
	System.out.println("12<=25:"+(firstNum<=secondNum));
	System.out.println("12==25:"+(firstNum==secondNum));
	System.out.println("12!=25:"+(firstNum!=secondNum));
	
	int thirdNum=25;
	int fourthNum=35;
	System.out.println("Logocal operations");
	System.out.println("12>10 And 25<35:"+(thirdNum<fourthNum));
	System.out.println("12<25 AND 25>35"+(thirdNum>fourthNum));
	 
}
}
