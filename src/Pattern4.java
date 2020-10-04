
/*
pattern if noOfRows entered is 10:
1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
          1 2 3 4 5 4 3 2 1
            1 2 3 4 3 2 1
              1 2 3 2 1
                1 2 1
                  1
*/
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {


	

		Scanner sc = new Scanner(System.in);

        //Taking noOfRows value from the user

        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        //Initializing rowCount with noOfRows

        int rowCount = noOfRows;

        System.out.println("Here Is Your Pyramid");

        //Implementing the logic

        for (int i = 0; i < noOfRows; i++)
        {
            //Printing i*2 spaces at the beginning of each row

            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }

            //Printing j where j value will be from 1 to rowCount

            for (int j = 1; j <= rowCount; j++)          
            {
                System.out.print(j+" ");
            }

            //Printing j where j value will be from rowCount-1 to 1

            for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }

            System.out.println();

            //Decrementing the rowCount

            rowCount--;
        }
    }
}