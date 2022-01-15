import java.util.Arrays;

public class ofc {

	/*
	 * void ofc(int a,String s) { System.out.print("Alpha"); System.out.print(a);
	 * System.out.print(s); }
	 */
public static void main(String[] args) {
	
		int arr[]={1,2,4,5,6};
		
		int n=arr.length;
		for(int i=1;i<=n;i++)
		{
			if(arr[i]!=i)
			{
				System.out.print(i);
				break;
			}		
			} }}