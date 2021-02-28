package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_CYC = Target.the("selecciona Certificaciones").located(By.xpath("//*[@id='certificaciones']/div[1]/a/h4/strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar certificacion").located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("click buscar certificacion").located(By.xpath("//*[@id='coursesearch']/fieldset/button"));

  //public static final Target SELECT_COURSE = Target.the("Seleccionar certificacion").located(By.id("yui_3_17_2_1_1614457852457_299"));
  //public static final Target SELECT_COURSE = Target.the("Seleccionar certificacion").located(By.xpath("//*[@id='yui_3_17_2_1_1614462439342_296']"));
    public static final Target SELECT_COURSE = Target.the("Seleccionar certificacion").located(By.xpath("//*[@id='page-search-index']"));

    public static final Target NAME_COURSE= Target.the("Extraer nombre de la certificacion").located(By.xpath(""));
}
