package Test_Emulator;
import java.io.IOException;

public class AppiumServerExample {

public static void stratserver() throws IOException, InterruptedException{
Runtime.getRuntime().exec("cmd /c start cmd.exe /K D:\\Appium\\appiumStart.bat");
Thread.sleep(8000);
    }
public static void main(String[] args) throws IOException, InterruptedException {
	AppiumServerExample.stratserver();
}
}
