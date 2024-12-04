package day8;

public class constructor {
int markSheet;
String name;
constructor(int markSheet,String name){
this.markSheet=markSheet;
this.name=name;
}

public static void main(String[]args) {
	  constructor obj=new constructor(100,"ranjith");
	  System.out.println(obj.markSheet);
	  System.out.println(obj.name);
	  
  }
}

