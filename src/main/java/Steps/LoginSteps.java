package Steps;

import Pages.LoginPageObject;
import Properties.ConfigProperties;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    String login;
    String password;
    String jiraUrl;

    public void LoginToJira() {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        ConfigProperties config = new ConfigProperties();
        jiraUrl = config.DataFromPropertiesFile("jiraUrl");
        login = config.DataFromPropertiesFile("login");
        password = config.DataFromPropertiesFile("password");
        open(jiraUrl);
        LoginPageObject loginPage = new LoginPageObject();
        loginPage.LoginToJira(login, password);
    }

}
