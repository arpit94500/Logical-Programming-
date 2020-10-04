// Decimal to Binary
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number");
		double n = sc.nextDouble();
		int a = (int)n;
		double b = n-a;
		String res="";
		if(a==0)
			res=res+a;
		while(a>0)
		{
			int t = a%2;
			res = t+ res;
			a=a/2;		
		}
		
		if(b!=0)
		{
			int t=0;
			res=res+".";
			while(t<=3)
			{
				
				b= b*2 -  (int)b*2;
				res= res+ (int)b;
				System.out.println(b);
				t++;
			}
		}
		System.out.println(res);
	}

}
