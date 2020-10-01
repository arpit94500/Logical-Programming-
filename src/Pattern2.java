/*
         1
        12A
       123BA
      1234CBA
     12345DCBA
    123456EDCBA
   1234567FEDCBA
  12345678GFEDCBA
 123456789HGFEDCBA
12345678910IHGFEDCBA
 */
public class Pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)//for printing rows
		{
			for(int l=10;l>i;l--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int k=63+i;k>='A';k--)
			{
				System.out.print((char)k);
			}
			System.out.println();
		}

	}

}
