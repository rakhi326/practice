
public class fibonacci {

	public static void main(String[] args) {
		int n=11,a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
		}
		
	}

}
