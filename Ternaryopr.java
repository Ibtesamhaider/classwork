package basicprogram;
import java.util.*;
public class Ternaryopr {

	public static void main(String[] args) {
		int num1,num2,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1: ");
		num1=sc.nextInt();
		System.out.println("enter the num2: ");
		num2=sc.nextInt();
		max=(num1>num2)?num1:num2;//ternary operator
		System.out.println("greater number is:"+max);
	}

}