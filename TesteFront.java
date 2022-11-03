package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteCursoSenai {
	
	private WebDriver driver;
	
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	
	
	@Test
	public void TesteNavegabilidade () {
		
		
		
		WebElement login = driver.findElement(By.class("Box"));
		WebElement Email = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("password"));
		
		try {
		driver.get("https://localhost:4200/");
		Thread.sleep(3000);
		menuServicos.click();
		Thread.sleep(2000);
		Email.clear();
		Thread.sleep(2000);
		Email.sendKeys("vnlima@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("best");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-container\"]/form/input[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	//@After
	public void Fim () {
		driver.quit();
	}
}