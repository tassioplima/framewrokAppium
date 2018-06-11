package br.ce.tassio.appium;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.AppiumServer;


public class FormularioTeste  extends AppiumServer {

	private AppiumServer appium ;

	@Before
	public void inicitalServer() {
	
		appium.startServer();

	}

	@Test
	public void desafioCadastro() throws MalformedURLException{

		//getElement("//*[@text='Formulário']").click();

	}

	@After
	public void closeServer() {
		
		appium.stopServer();

	}
}



/*//Capabilities
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "emulator-5554");
    desiredCapabilities.setCapability("automationName", "uiautomator2");
    desiredCapabilities.setCapability(MobileCapabilityType.APP, ".\\resources\\CTAppium-1-1.apk");



    //Appium
    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  //Maps
    MobileElement formulario = driver.findElement(By.xpath("//*[@text='Formulário']"));
    formulario.click();

    MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
    campoNome.sendKeys("Tassio");

    MobileElement console = driver.findElement(MobileBy.AccessibilityId("console"));
    MobileElement xbox = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='XBox One']"));
    MobileElement ps4 = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']"));
    MobileElement nintendo = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Nintendo Switch']"));
    MobileElement checkBox = driver.findElement(By.xpath("//android.widget.CheckBox"));
    MobileElement swith = driver.findElement(By.xpath("//android.widget.Switch"));
    MobileElement retornoNome = driver.findElement(By.xpath("//android.widget.TextView[@index='12']"));
    MobileElement retornoConsole = driver.findElement(By.xpath("//android.widget.TextView[@index='13']"));
    MobileElement valoresConsole = driver.findElement(By.xpath("//android.widget.CheckedTextView[starts-with(@text,'Console:')]"));
    MobileElement retornoSlider = driver.findElement(By.xpath("//android.widget.TextView[@index='14']"));
    MobileElement retornoSwitch = driver.findElement(By.xpath("//android.widget.TextView[@index='15']"));
    MobileElement retornoCheckBox = driver.findElement(By.xpath("//android.widget.TextView[@index='16']"));
    MobileElement data = driver.findElement(By.xpath("//android.widget.TextView[@index='17']"));
    MobileElement hora = driver.findElement(By.xpath("//android.widget.TextView[@index='18']"));
    MobileElement limpar = driver.findElement(By.xpath("//android.widget.TextView[@text='LIMPAR']"));
    MobileElement salvar = driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR']"));


    //Actions
    console.click();
    xbox.click();
    checkBox.click();
    swith.click();
    salvar.click();
    String getNome = retornoNome.getText();
    String getConsole = retornoConsole.getText();
    String getSwitch = retornoSwitch.getText();
    String getCheckbox = retornoCheckBox.getText();


    //Asserts
    assertEquals("Tassio", getNome);
    if(getConsole.equals("xone")) {

    	assertEquals("xone", getConsole);

    }else if (getConsole.equals("ps4")){

    	assertEquals("ps4",getConsole);

    }else if (getConsole.equals("switch")) {

    	assertEquals("switch",getConsole);

    }else  System.out.println("Conteúdo do console não encontrado");;
    assertEquals("On", getSwitch);
    assertEquals("Off", getSwitch);
    assertEquals("Marcado", getCheckbox);
    assertEquals("Desabilitado", getCheckbox);
 */