package tabletAndIphoneAssignment;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class AssignmentIphone {
	static IOSDriver driver;
	
	public static void main (String []args) throws MalformedURLException {
	File fs = new File("/Users/collabera/eclipse-workspace/JenkinsTest/src/test/java/tabletAndIphoneAssignment/UIKitCatalog.app");	
	XCUITestOptions cap = new XCUITestOptions();	
	cap.setDeviceName("iPhone 14 Pro");
	cap.setApp(fs.getAbsolutePath());
	cap.setPlatformVersion("16.4");
	cap.setAutomationName("XCUITest");
	cap.setUdid("E9FD3D2C-EAEC-4E60-9665-67CBDE3308CF");
	
	driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
}