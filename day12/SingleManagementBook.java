package day12;
import java.util.Scanner;
public class SingleManagementBook {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		Book B1=new Book();
		boolean isTrue=true;
	while(isTrue) {
		
	
		System.out.println("eneter your choice");
		System.out.println("1 for add");
		System.out.println("2 for display");
		System.out.println("3 for exit");
	int key=scan.nextInt();
	scan.nextLine();
		switch (key) {
	case 1: {
		System.out.println("enter your title");
		String  Title=scan.nextLine();
		B1.setTitle(Title);
		System.out.println("enter author name");
		String Author=scan.nextLine();
		B1.setAuthor(Author);
		System.out.println("enter the price");
		double Price=scan.nextDouble();
		B1.setPrice(Price);
		System.out.println("enter number of copies");
		int NumberOfCopies=scan.nextInt();	
		B1.setNumberOfCopies(NumberOfCopies);
				}
case 2: {
		
		System.out.println(B1);
		break;
	}
case 3: {
	isTrue=false;
	System.out.println("Thank you");
	break;
	
	
}
		}}
	 }
}
