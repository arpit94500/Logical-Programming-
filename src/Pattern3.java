/*
          1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
12345678910987654321
 12345678987654321
  123456787654321
   1234567654321
    12345654321
     123454321
      1234321
       12321
        121
         1
 */
public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)//for printing rows
		{ 
			if(i<=10)
		{
			for(int l=10;l>i;l--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			else
			{
				for(int l=11;l<i;l++)
					System.out.print(" ");
				for(int j=1;j<=20-i;j++)
				{
					System.out.print(j);
				}
				for(int k=20-i-1;k>=1;k--)
				{
					System.out.print(k);
				}
				System.out.println();
			}
		}
		
	}

}
