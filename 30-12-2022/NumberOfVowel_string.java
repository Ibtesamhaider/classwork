//@author Ibtesam Haider
//count number of vowel within a string
package string;

import java.util.Scanner;

class Vowel{
	public void vowel() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a="";
		a=sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++) {    // check if char[i] is vowel
			if(a.charAt(i) == 'a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||
					a.charAt(i)=='o'||a.charAt(i)=='u') {
				count++;   // count increments if there is vowel in the string
			}
		}
		System.out.println("Vowel is: "+count);
	}
}
public class NumberOfVowel_String {

	public static void main(String[] args) {
		
		Vowel vw=new Vowel();//method calling
		new Vowel().vowel(); //Anonymous Object
	}
}
