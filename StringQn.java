package test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringQn {
	public static void main(String[] args) {
	
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter the size of the array--> ");
		
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			arr.add(sc.next());
		}
		
		System.out.println("The Reversed String is: ");
		for(int j=arr.size()-1;j>=0;j--) {
			System.out.println(arr.get(j));
		}
		
		sc.close();
}
}
