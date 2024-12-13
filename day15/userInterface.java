package day15;
import java.util.Scanner;
public class userInterface {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	Calculator calc=new Calculator();
	System.out.println("enter first number");
	int first=scan.nextInt();
	System.out.println("enter second number");
	int second=scan.nextInt();
System.out.println(calc.add(first, second));
System.out.println(calc.sub(first, second));
System.out.println(calc.mul(first, second));
System.out.println(calc.div(first, second));



}

}
