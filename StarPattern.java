package oops;
import java.util.*;
public class StarPattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of row: ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for (int j=0;j<=n-i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print(" ");
			}
			for(int l=n-i;l>=0;l--)
			{
				if(l!=n)
					System.out.print("*");
			}
			System.out.println();
			}
	}
	}
