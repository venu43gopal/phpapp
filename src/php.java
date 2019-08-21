import org.openqa.selenium.chrome.ChromeDriver;

public class php {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.68.154.135/content/about-us.php");
        //driver.findElement(By.xpath("//a[@href='http://34.68.154.135/content/about-us.php']")).click();
        
        if(driver.getPageSource().contains("Lorem Ipsum Dipsum"))
        {
        	System.out.println("Text Present");
        }
        else{
        System.out.println("Text not Present");
	}
	}
}