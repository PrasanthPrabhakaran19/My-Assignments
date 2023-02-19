package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Avanze");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanth");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhakaran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prasanth");
		driver.findElement(By.name("departmentName")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("US Title Insurance");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pkprasanth56@gmail.com");
		WebElement parent = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(parent);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Software Testing");
		driver.findElement(By.xpath("(//td/input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
