package day15;

public class array {
	public static void main(String args[]) {
		int arr[]=new int[5];
		 arr[0]=10;
		 arr[1]=20;
		 arr[2]=10;
		 arr[3]=10;
		 arr[4]=10;
		 try {
			 arr [5]=89;
		 }catch(Exception r){
			 System.out.println(r);
		 }
		 try {
			 for(int i=0;i<=5;i++) {
				 System.out.println(arr[i]);
			 }
		 }catch(Exception d) {
			 System.out.println(d);
		 }
		
		 
		 
		 
		
	}

}
