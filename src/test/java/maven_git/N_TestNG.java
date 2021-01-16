package maven_git;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class N_TestNG {
		WebDriver driver;

		@BeforeTest
		void test1() { // 
			System.out.println("SetUp browser");
			System.setProperty("webdriver.chrome.driver", "E:\\python\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.toolsqa.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		@Test
		void test2() { //
			System.out.println("Test Something");
			
		}
		@AfterTest
		void test3() { //
			System.out.println("Close browser");
			driver.close();
			
			
		}
	}


