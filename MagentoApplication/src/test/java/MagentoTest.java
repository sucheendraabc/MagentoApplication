
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void positiveCredential() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAcct();
		Login l = new Login(driver);
		l.typeEmail("sucheendra.abc@gmail.com");
		l.typePass("Welcome123");
		l.clickOnLogin();
		Main m = new Main(driver);
		m.clickOnLogout();
		driver.quit();

	}

}
