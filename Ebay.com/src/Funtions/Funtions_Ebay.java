package Funtions;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Funtions_Ebay {


	
	//***********************************************//
	// Esta funcion se encarga de abrir el navergador//
	//***********************************************//
	
 public static void Abre_Navegador(String Url) throws Exception
    {
	try{
	
		System.out.print("llego a abrir navegador");

		System.out.println("Abre Chrome");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("something", true);
		Var_Ebay.driver = new ChromeDriver();
		System.out.println("Abre Navegador");
		
		Var_Ebay.driver.get(Url);
		Thread.sleep(2000L);			
		Var_Ebay.driver.manage().window().maximize();
	}
	catch (Exception e){
	e.printStackTrace();
	System.out.println("Error presentado Durante la apertura del navegador:  ------ "  + e.getMessage());
	}
}
	 
	//********************************************//
	// Esta funcion se encarga de cargar el driver//
	//********************************************//
 
 public static void  Actualiza_navegador() throws Exception{
	 try{

		System.setProperty("webdriver.chrome.driver", Var_Ebay.var_Chrome);
		System.out.println("Cargo driver de Navegador ");

	 }
	catch (Exception e){
		e.printStackTrace();
		System.out.println("Error presentado Durante la apertura del navegador: ------ "  + e.getMessage());
		}
}
	 
	//************************************************//
	// Esta funcion se encarga de cerrar el navergador//
	//************************************************//
 
 public static void Cerrar_Navegador() throws Exception
    {
	 try {
	 Thread.sleep(2000L);	
	 if(Var_Ebay.driver!=null)
    	{
    		Var_Ebay.driver.quit();
    	}
    	else
    	{
				Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
    	}
	 }
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Error presentado cerrando el navegador:  "+ e.getMessage());
	}
}	
	   
}
