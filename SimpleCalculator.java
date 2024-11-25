package day2;
import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int firstNum=scan.nextInt();
		System.out.println("enter the second number");
		int secondNum=scan.nextInt();
		System.out.println("enter your choice");
		System.out.println("0 for add");
		System.out.println("1 for sub");
		System.out.println("2 for mul");
		System.out.println("3 for div");
		System.out.println("4 for mod");
		int key=scan.nextInt();
//		
		switch(key) {
		case 0:
			System.out.println("addition:"+(firstNum+secondNum));
			case 1:
		System.out.println("substraction:"+(firstNum-secondNum));
			case 2:
				System.out.println("multiplication:"+(firstNum*secondNum));
			case 3:
				System.out.println("division:"+(firstNum/secondNum));
			case 4:
				System.out.println("modulas:"+(firstNum%secondNum));
				
		}
	}
	}

