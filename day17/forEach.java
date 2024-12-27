package day17;

import java.util.ArrayList;

public class forEach {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(10);
a1.add(20);
a1.add(40);
for(Integer c1:a1) {
if(c1==30) {
	System.out.println("thirty");
}else {
	System.out.println("no");
}
}
}
}
