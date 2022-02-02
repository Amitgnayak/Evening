package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_screenshot 
{
	public static void getPhoto(WebDriver driver)
	{
		String photo="./photos/";
		 Date d=new Date();
		 String d1 = d.toString();
		 String d2 = d1.replaceAll(":", "-");
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File(photo+d2+".jpeg");
		
	
	}
	
}
