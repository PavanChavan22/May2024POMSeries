package SeleniumSession;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brutil = new BrowserUtil();
		brutil.initDriver("chrome");
		brutil.launchUrl("https://www.amazon.com");
		String title = brutil.getPageTitle();
		System.out.println(title);
		if (title.contains("Amazon")) {
			System.out.println("Title is Pass");
		} else {
			System.out.println("Title is Fail");
		}
		
		System.out.println(brutil.getPageUrl());
		brutil.quitBrowser();
	}

}
