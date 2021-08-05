package tests;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends BaseTest{


    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkLogin(){
        loginPage.login("Daimon2112", "21121992Dimon");
        //  loginPage.validateErrorMessage("Incorrect username or password.");
    }




}