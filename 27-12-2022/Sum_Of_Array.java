package array;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int []arr=new int[10];
		int s=0;
		System.out.println("enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("sum of array elements: ");
		for(int i=0;i<n;i++)
		{
			s=s+arr[i];
		}
		System.out.println(s);
	}

}
