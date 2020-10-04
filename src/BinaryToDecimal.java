//Binary to Decimal
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		int a = (int)d;
		String s = Integer.toString(a);
		int i = s.length();
		double b = d-a;
		int res=0;
		int j=0;
		while(i>0)
		{
			int t= a%10;
			res= (int) (res + t*Math.pow(2,j));
			a=a/10;
			i--;
			j++;
		}
		System.out.println(res);
	}

}
