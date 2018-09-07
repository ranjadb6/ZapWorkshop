import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import static com.sun.tools.javac.util.Assert.error;

public class SeleniumExample {

	@Test
	public void seleniumTests() throws InterruptedException, ClientApiException, IOException {
		System.setProperty("webdriver.gecko.driver", "./geckodriver");

		WebDriver driver;

		// Selenium running the script
		driver.get("http://192.168.56.180/");
		driver.get("http://192.168.56.180/mutillidae/index.php?page=add-to-your-blog.php");
		Thread.sleep(1000);
		driver.quit();


	}

}
