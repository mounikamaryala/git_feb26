package Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
			int a=0; int b=1;
			
			System.out.print(a + " " + b + " ");
			
			for(int i=2;i<n;i++) {
			int c=a+b;
			if(c>100) {
				break;
			}
			System.out.print(c+ " ");
			a=b;
			b=c;
			}
			
	}

}
