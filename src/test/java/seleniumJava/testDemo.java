package seleniumJava;

public class testDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//Google//Chrome//Application//chrome.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.get("http://www.javatpoint.com/");
	   String url=driver.getTitle();
	   System.out.print(url);
	    
	driver.close();
		
	}

} 
