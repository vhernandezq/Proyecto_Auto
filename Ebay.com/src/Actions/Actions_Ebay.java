package Actions;

import org.openqa.selenium.By;

import Funtions.Var_Ebay;

public class Actions_Ebay {

	//************************************************//
	// Esta funcion da clic sobre un objeto tipo boton//
	// u objeto similar con el mismo comportamiento   //
	//************************************************//	
public static void click(By Comando){
	try{
		Var_Ebay.driver.findElement(Comando).click();
		Thread.sleep(1000L);
	}
	catch(Exception e){
		System.out.println("Not able to Click --- " + e.getMessage());
		Var_Ebay.bResult = false;
     	}
	}
 
	//**************************************************//
	// Esta funcion recibe un valor tipo string en una  //
	// variable para ingresarla en un objeto tipo texto //
	//**************************************************//
public static void input(By Comando, String data){
	
	try{
		Var_Ebay.driver.findElement(Comando).sendKeys(new String[]{data});
		Thread.sleep(1000L);
	}
	catch(Exception e){
		 System.out.println("Not able to Enter --- " + e.getMessage());
		 Var_Ebay.bResult = false;
	 	}
	}
 	
	//****************************************************//
	// Esta funcion da clic en un objeto tipo checkbutton //
	// y lo activa 										  //
	//****************************************************//

public static void chk(By Comando){
	
	try{
		Var_Ebay.driver.findElement(Comando).click();
		Thread.sleep(1000L);
	}
	catch(Exception e){
		 System.out.println("Not able to check --- " + e.getMessage());
		 Var_Ebay.bResult = false;
	 	}
	}

	//**********************************************//
	// Esta funcion se encarga de imprimir un valor //
	// capturado de un label						//
	//**********************************************//

public static void print(By Comando){
	
	try{
		String valor =	Var_Ebay.driver.findElement(Comando).getText();
		System.out.println (valor);
		Thread.sleep(1000L);
	}
	catch(Exception e){
		 System.out.println("Not able to get text --- " + e.getMessage());
		 Var_Ebay.bResult = false;
	 	}
	}
	


}
