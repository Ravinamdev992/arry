package oct12.arrys;

import java.util.Scanner;

public class Dyanamic2Arry {
public static void main(String[] args) {
	int size,i;
	Scanner r = new Scanner(System.in);
	System.out.println("Enter size of arry ");
	size=r.nextInt();
	
	int a[] = new int[size];
	
	for (i=0; i<size; i++) {
		a[i]=r.nextInt();
	}
	System.out.println("printed arry elements");
	
	for(i=0; i<size; i++) {
	System.out.println(a[i] +" ");
	}
}
}
