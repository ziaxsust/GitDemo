package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]"));
		
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		String beforexpath_contact = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath_contact = "]/td[2]";
		
		for(int i=2; i<=7; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			String companyName = driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(companyName);
		
			String actualxpath_contact = beforexpath_contact + i + afterxpath_contact;
			String companyName_contact = driver.findElement(By.xpath(actualxpath_contact)).getText();
			System.out.println(companyName_contact);
			
		}
		
		driver.close();
	}

}
