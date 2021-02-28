package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a/strong"));

    public static final Target INPUT_USER = Target.the("where do write the user").located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("where do write the password").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to confirm the login").located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"));

}
