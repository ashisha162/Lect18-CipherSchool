import java.util.*;

public class Lec18ArrayInput
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Please enter "+ (i+1) +"  element:  ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		sc.close();
	}
}
		