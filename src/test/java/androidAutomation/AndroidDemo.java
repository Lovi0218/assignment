package androidAutomation;

import java.io.File;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidDemo {
	public static void main (String [] args) {
		File fil = new File("src/test/java/androidAutomation");
		File fs = new File(fil,"com.finance.emi.calculate_2023-01-05.apk");
		AndroidDriver ad;
		UiAutomator2Options cap = new UiAutomator2Options();
		cap.setDeviceName("android device");
		cap.setApp(fs.getAbsolutePath());
		
		try {
			ad = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	

}
