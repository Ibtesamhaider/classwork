//duplicate elements of an array
package array;

public class DuplicateElements_array {
	
	public static void main(String args[])
	{
		int []arr=new int[] {1,2,3,4,2,4,5,1};
		System.out.println("Duplicate elements in given array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				System.out.print(" "+arr[j]);
			}
		}
	}
}
