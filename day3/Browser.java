package week1.day3;

public class Browser {
public String	launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}

void loadUrl()
{
System.out.println("Application url loaded successfully");
}
public static void main(String[] args) {
	
	Browser br=new Browser();
	String browser=br.launchBrowser("chrome" );
	System.out.println("The browser name is :"+browser);
	br.loadUrl();
}
	}


