package ranners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.CriarContaPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/lupa.feature",
		glue = "br.steps",
		tags = {"~@ignore"},
		plugin = "pretty", 
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)

public class RunnerTest {
	
@BeforeClass	
public static void reset () {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\chrome_driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	LupaPage page = new LupaPage(driver);
	driver.get("https://blogdoagi.com.br/");
	driver.quit();
	}
}
