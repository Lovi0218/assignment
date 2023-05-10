package iPhoneAutomation;

import java.net.URL;
import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class SetCapabilityClass {
	static IOSDriver driver;
	
	public static void main(String [] args) throws MalformedURLException {
		configureApp();
		pickerView();
		gestures("205");
//		buttonClick();
	}
	
	public static void buttonClick() throws MalformedURLException {
		WebElement button = driver.findElement(AppiumBy.xpath("//XCUIElementTypeApplication[@name=\"UIKitCatalog\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		button.click();
	}
	public static void pickerView() throws MalformedURLException {
		WebElement pickerView = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Picker View\"]"));
		pickerView.click();
	}
	

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void gestures(String defaultValue) throws MalformedURLException {
		
		WebElement pickerWheel = driver.findElement(AppiumBy.xpath("//XCUIElementTypePickerWheel[@name=\"Red color component value\"]"));
		do {
		Dimension size = pickerWheel.getSize();
		int startY = (int) (size.height * 0.9);
		int endY = (int) (size.height * 0.2);
		int startX = size.width / 2;
		
		TouchAction action = new TouchAction(driver);
		action.longPress(PointOption.point(startX, startY))
		      .moveTo(PointOption.point(startX, endY))
		      .release()
		      .perform();
		}while(pickerWheel.getText().equals("80"));
		
		WebElement pickerWheel1 = driver.findElement(AppiumBy.xpath("//XCUIElementTypePickerWheel[@name=\"Green color component value\"]"));
		pickerWheel1.sendKeys("220");
	}
	
	public static void configureApp() throws MalformedURLException{
		File fs = new File("/Users/collabera/eclipse-workspace/JenkinsTest/src/test/java/iPhoneAutomation/UIKitCatalog.app");
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
