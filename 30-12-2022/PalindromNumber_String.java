//@author Ibtesam Haider
//check whether  a string palindrome or not
package string;

import java.util.Scanner;

public class PalindromNumber_String {

	public static void main(String[] args) {
		String str="anna";//string to test
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);//reversing the string
		}
		if(str.equals(rev))
		{
			System.out.println("This is a palindrom");
		}
		else
		{
			System.out.println("This is not a palindrom");
		}
	}

}
