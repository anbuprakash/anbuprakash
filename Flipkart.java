package sathyaweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\browser\\ChromeDriver.exe");
		SearchFlipkart sf=new SearchFlipkart();
		sf.searchlaptop();

	}

}
class SearchFlipkart {
	      WebDriver d;
	      public void searchlaptop() {
	    	  d=new ChromeDriver();
	    	  d.get("https://www.flipkart.com");
	    	  d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    	  d.findElement(By.name("q")).sendKeys("laptop");
	    	  d.findElement(By.className("L0Z3Pu")).click();
	    	  d.findElement(By.xpath("//div[@title='Core i5']//child::div//div[1]")).click();
	    	  
	      }
}
