import com.hrm.base.TestBase;
import com.hrm.pages.HomePage;
import com.hrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority=1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }


    @Test(priority=2)
    public void loginTest(){
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }



    @AfterMethod
    public void tearDown(){

        driver.quit();
    }


}
