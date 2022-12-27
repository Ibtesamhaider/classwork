//@author Ibtesam Haider
//count the number of even and odd elements in an array
package array;

import java.util.Scanner;

public class EvenOdd_array {

	public static void main(String[] args) {
		System.out.print("Enter the Array Size :- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Element :- ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is :- ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.println("");
		System.out.println("Even numbers :- ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println("");
		System.out.println("Odd numbers :- ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.print(" "+arr[i]);
			}
		}

	}

	}
