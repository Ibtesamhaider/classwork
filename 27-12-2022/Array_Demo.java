package array;

import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
		/*int arr[]= {4,5,6,7,8};//create array statistically
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		//user input
		int arr[]=new int[10];
		System.out.println("enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();//take an input
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}

	}

}
