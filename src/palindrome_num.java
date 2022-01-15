
public class palindrome_num {
	public static void main(String[] args) {
		int n=435;
		int sum=0,r,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
					}
		
		if(sum==temp) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("Not a palindrome");
		}

	}}
