package Selenium_For_PE;

public class Start_Time {
	public static void main(String[] args) throws InterruptedException {
		// Get the start time in milliseconds
		long startTime = System.currentTimeMillis();

		// Perform the task or operation here
		Thread.sleep(6000);

		// Get the end time in milliseconds
		long endTime = System.currentTimeMillis();

		// Calculate the elapsed time in seconds
		long elapsedTimeSeconds = (endTime - startTime) / 1000;

		// Print the start time
		System.out.println("Start Time (in milliseconds): " + elapsedTimeSeconds);

	}

}
