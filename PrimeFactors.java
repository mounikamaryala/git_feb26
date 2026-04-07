package Assignments;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 60;
        int num = n;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                System.out.print(i + " ");

                // remove all occurrences of this factor
                while (num % i == 0) {
                    num = num / i;
                }
            }

            // break condition
            if (i > num / 2) {
                break;
            }
        }

        // if remaining number is > 1, it is also a prime factor
        if (num > 1) {
            System.out.print(num);
        }

	}

}
