//Prime Numbers Are Natural Numebers Greater Than One (Natural Number > 1)
// And Which Has Only Two Factors Only One And Itself.
// (For ex- 19 Is Prime Number Because 19 Is Greater Than 1 And It Has Only 2 Factors 
//  1 and 19 (Itself)...
// Smallest Prime Number = 2

package JavaDSA;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();   
		int count =0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
		       System.out.println(num+ " Is A Prime Number.");
			}
			else
			{
				System.out.println(num+ " Is Not A Prime Number.");
			}
		}
		else
		{
			System.out.println(num+ " Is Not A Prime Number.");
		}
		
	}

}
