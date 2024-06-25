package warmUp;

public class ComplexConditionalIncrementDecrementLoopExample {
    public static void main(String[] args) {
        // Initialize variable num
        int num = 7;

        // Loop to post-increment num three times
        for (int i = 0; i < 3; i++) {
            num++;
        }

        // Loop to pre-decrement num four times
        for (int i = 0; i < 4; i++) {
            --num;
        }

        // Conditional statements and loops
        int result1 = 0;
        int result2 = 1;

        // Check if num is even
        if (num % 2 == 0) {
            // Loop to calculate sum of even numbers
            for (int i = 1; i <= num; i += 2) {
                result1 += i;
                System.out.println(result1);
            }
        } else {
            // Loop to calculate product of odd numbers
            for (int i = 2; i <= num; i += 2) {
                result1 *= i;
            }
        }

        // Check if num is prime
        boolean isPrime = isPrimeNumber(num);

        // Loop to calculate sum or product based on prime or non-prime
        for (int i = 1; i <= num; i++) {
            if (isPrime) {
                if (isPrimeNumber(i)) {
                    result2 += i;
                }
            } else {
                if (!isPrimeNumber(i)) {
                    result2 *= i;
                }
            }
        }

        // Print the results
        System.out.println("1. Result1: " + result1);
        System.out.println("2. Result2: " + result2);
    }

    // Function to check if a number is prime
    private static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
