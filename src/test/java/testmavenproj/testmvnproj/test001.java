package testmavenproj.testmvnproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test001 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub}
	public WebDriver driver ;

	@Test
	public void checkmvntest() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\testmvnproj\\resources\\chromedriver.exe");
				
				driver = new ChromeDriver() ;
				
				driver.get("https://www.imdb.com/");
				
				driver.quit() ;
		
		
		System.out.print("Hiiiiiiiiiiiiiiiiiiiiiiiiiii");
	}













}
