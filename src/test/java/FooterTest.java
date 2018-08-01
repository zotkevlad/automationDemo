import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;


import static com.codeborne.selenide.Selenide.close;
import static utils.MyDriverManager.initChromeDriver;

public class FooterTest {

    @BeforeClass
    public void setUp() {
        WebDriverRunner.setWebDriver(initChromeDriver());
    }

    @Test
    public void checkFooter() {
        new MainPage().openMainPage("https://www.ukad-group.com/")
                .checkFooterVisible();
    }

    @AfterClass
    public void tearDown() {
        close();
    }
}
