package tabletAndIphoneAssignment;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.SessionNotCreatedException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AssignmentAndroid {
    static AndroidDriver ad;

    public static void main(String[] args) {
        configureApp();
    }

    public static void configureApp() {

        File fil = new File("/Users/collabera/eclipse-workspace/JenkinsTest/src/test/java/tabletAndIphoneAssignment");
        File fs = new File(fil, "ApiDemos-debug.apk");
        UiAutomator2Options cap = new UiAutomator2Options();

        cap.setDeviceName("Nexus 10");
        cap.setApp(fs.getAbsolutePath());
        cap.setPlatformVersion("13");
        cap.setAutomationName("UiAutomator2");
        cap.setPlatformName("Android");

        try {
            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            System.out.println("Session created successfully.");
        } catch (SessionNotCreatedException e) {
            System.out.println("Session could not be created. Please check the capabilities and device settings.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



//package tabletAndIphoneAssignment;
//import java.io.File;
//import java.net.URL;
//import java.time.Duration;
//
//import org.openqa.selenium.SessionNotCreatedException;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//public class AssignmentAndroid {
//	
//	static AndroidDriver ad;
//	public static void main(String [] args) {
//		configureApp();
//	}
//	
//	public static void configureApp() {
//		
//		File fil = new File("/Users/collabera/eclipse-workspace/MavenProj/src/test/java/tabletAndIphoneAssignment");
//		File fs = new File(fil,"ApiDemos-debug.apk");
//		UiAutomator2Options cap = new UiAutomator2Options();
//		
//		cap.setDeviceName("Nexus 10");
//		cap.setApp(fs.getAbsolutePath());
//		cap.setPlatformVersion("13");
//		cap.setAutomationName("UiAutomator2");
//		cap.setPlatformName("Android");
//		
//		
//		try {
//			ad = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
//			ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		}
//		catch (SessionNotCreatedException e) {
//            System.out.println("Session could not be created. Please check the capabilities and device settings.");
//		
//	}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
