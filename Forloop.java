package day3;
import java.util.Scanner;
public class Forloop {
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the table");
	int table=scan.nextInt();
	for(int i=1;i<=10;i++)
		System.out.println(table+"x"+i+"="+i*table);
}
	
}
