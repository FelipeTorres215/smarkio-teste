import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testemagazine {
	@Test	
		
		//add produto ao carrinho
		public void teste() {
			
			WebDriver driver = new FirefoxDriver();
			//driver.manage().window().setSize(1200, 765);//
			driver.get("https://www.magazineluiza.com.br");
			System.out.println(driver.getTitle());
			driver.findElement(By.id("inpHeaderSearch")).click();
		    driver.findElement(By.id("inpHeaderSearch")).sendKeys("memoria");
		    driver.findElement(By.id("btnHeaderSearch")).click();
		    driver.findElement(By.id("product_0404162")).click();
		    driver.findElement(By.className("button__buy")).click();
		    System.out.println(driver.findElement(By.className("BasketItemProduct-quantity-dropdown")));
		    driver.quit();
		    
}
}