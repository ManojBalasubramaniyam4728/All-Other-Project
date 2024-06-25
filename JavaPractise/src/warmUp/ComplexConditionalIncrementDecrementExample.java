package warmUp;

public class ComplexConditionalIncrementDecrementExample {
    public static void main(String[] args) {
        // Initialize variables p and q
        int p = 5;
        int q = 8;

        // Perform the specified operations
        int x = p++;
        int y = --q;

        // Conditional statements
        int result1, result2;

        if ((p++) > (--q)) {
            result1 = p + q;
        } else {
            result1 = p * q;
        }

        if ((++p) <= (q--)) {
            result2 = q - p;
        } else {
            result2 = q / p;
        }

        // Print the results
        System.out.println("1. Post-increment result (x): " + x);
        System.out.println("2. Pre-decrement result (y): " + y);
        System.out.println("3. Result1: " + result1);
        System.out.println("4. Result2: " + result2);
    }
}
