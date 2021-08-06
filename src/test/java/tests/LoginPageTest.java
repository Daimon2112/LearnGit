package tests;



import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends BaseTest{


    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        loginPage = new LoginPage(driver);
    }

    @Description("Learning ALLURE")
    @TmsLink("number in jiras")
    @Issue("link to bug or task")
    @Feature("groupirovanie test cases")
    @Story("groupirovanie po storiyam")
    @Owner("autor testa")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void checkLogin(){
        loginPage.login("Daimon2112", "21121992Dimon");
        //  loginPage.validateErrorMessage("Incorrect username or password.");
    }




}