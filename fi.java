package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class fi {
	public static void main(String args[]) throws InterruptedException
	 {
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://docs.google.com/forms/d/1Bj5f1DdkYDLAREqQS7IYkskAEU0EZx-Wm3b5TVOTU6Q/edit");
       Thread.sleep(3000);
       
       dr.get("https://www.amazon.in/");
       
       dr.navigate().back();
		Thread.sleep(3000);
		
		dr.get("https://www.meesho.com/women-kurtis/pl/3j0");
		
		dr.navigate().forward();
		Thread.sleep(3000);
		dr.navigate().refresh();
		
		String title1=dr.getTitle();
		System.out.println(title1);
		
		String URL=dr.getCurrentUrl();
		System.out.println(URL);
		
		String mycode=dr.getPageSource();
		System.out.println(mycode);
		
		dr.close();
		
		
	 }
}
