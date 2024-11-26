package day3;
import java.util.Scanner;
public class Loops {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int mark=scan.nextInt();
	if(mark>=35) {
		if(mark>=90) {
			System.out.println("grade a");
			
		}else if(mark>=70) {
			System.out.println("grade b");
		}else{
		System.out.println("grade c");
		}		
	}
	else
		System.out.println("fail");
	}

}
