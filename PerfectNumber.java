package Assignments;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Perfect Number= A number that is equal to its sum of its divisors 
			int num=6;
			int sum = 0;
			for ( int i=1;i<5;i++)
			{
				if(num%i==0)
				{
					sum = sum + i;
				}
			}
			if(sum == num)
			{
				System.out.println("Perfect Number");
			}else {
				System.out.println("Not Perfect");
			}
				}
			
			}
