package demo1;



import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDown {

	public static void main(String[] args) {
		Webdriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.GET("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findelement(By.id("month"));
		Webelement year=driver.findElement(By.id("year"));
		
		
		Select select=new Select(day);
		select.selectByVisibleText("12");
		
		Select select1=new Select(month);
		select.selectByVisibleText("Feb");
		
		Select select2=new select(year);
		select2.selectByVisibleText("1991");
	}

}
