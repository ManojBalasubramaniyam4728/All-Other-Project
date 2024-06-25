package warmUp;

import java.util.Scanner;

public class TwoDArray_Complex {
public static void main(String[] args) {
	System.err.println("Write a Java program that rotates the elements in a square 2D array (matrix) to the right by a given number of rotations.\r\n"
			+ "\r\n"
			+ "The program should do the following:\r\n"
			+ "\r\n"
			+ "Accept a square 2D array and the number of rotations as input.\r\n"
			+ "Rotate the elements in the array to the right by the specified number of rotations.\r\n"
			+ "Print the rotated array.\r\n"
			+ "Example:\r\n"
			+ "\r\n"
			+ "For a 3x3 array and 2 rotations:\r\n"
			+ "Input:\r\n"
			+ "\r\n"
			+ "Copy code\r\n"
			+ "1 2 3\r\n"
			+ "4 5 6\r\n"
			+ "7 8 9\r\n"
			+ "Output:\r\n"
			+ "\r\n"
			+ "Copy code\r\n"
			+ "7 4 1\r\n"
			+ "8 5 2\r\n"
			+ "9 6 3");
	System.out.println();
	
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the square array
	        System.out.print("Enter the size of the square array: ");
	        int size = scanner.nextInt();

	        // Input the elements of the square array
	        System.out.println("Enter the elements of the square array:");
	        int[][] array = new int[size][size];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }

	        // Input the number of rotations
	        System.out.print("Enter the number of rotations: ");
	        int rotations = scanner.nextInt();

	        // Rotate the array to the right
	        rotateArray(array, size, rotations);

	        // Print the rotated array
	        System.out.println("Rotated Array:");
	        printArray(array);

	        // Close the scanner
	        scanner.close();
	    }

	    private static void rotateArray(int[][] array, int size, int rotations) {
	        for (int r = 0; r < rotations; r++) {
	            // Perform one rotation
	            int[][] tempArray = new int[size][size];
	            for (int i = 0; i < size; i++) {
	                for (int j = 0; j < size; j++) {
	                    tempArray[j][size - 1 - i] = array[i][j];
	                }
	            
	            array = tempArray;
	            }
	        }
	    }

	    private static void printArray(int[][] array) {
	        for (int[] row : array) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
	}

