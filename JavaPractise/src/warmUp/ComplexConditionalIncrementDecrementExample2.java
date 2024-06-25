package warmUp;

public class ComplexConditionalIncrementDecrementExample2 {
    public static void main(String[] args) {
        // Initialize variables a, b, and c
        int a = 15;
        int b = 8;
        int c = 22;

        // Perform the specified operations
        int x = a--;
        int y = b++;
        int z = ++c;

        // Conditional statements
        int result1, result2;

        if ((a--) < (b++)) {
            result1 = a + b;
        } else {
            result1 = a * b;
        }

        if ((++c) >= (b++)) {
            result2 = c - b;
        } else {
            result2 = c / b;
        }

        // Print the results
        System.out.println("1. Post-decrement result (x): " + x);
        System.out.println("2. Post-increment result (y): " + y);
        System.out.println("3. Pre-increment result (z): " + z);
        System.out.println("4. Result1: " + result1);
        System.out.println("5. Result2: " + result2);
    }
}

