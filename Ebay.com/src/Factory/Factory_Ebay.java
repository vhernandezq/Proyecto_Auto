package Factory;


import Actions.Actions_Ebay;
import ElementLocators.ElementLocators_Ebay;
import Funtions.Funtions_Ebay;
import Funtions.Var_Ebay;

public class Factory_Ebay {

	/**
	 * @param args
	 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
		ejecutar();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
}
	
		
public static void ejecutar() throws Exception {
	try {

		Funtions_Ebay.Actualiza_navegador();
		Funtions_Ebay.Abre_Navegador(Var_Ebay.var_Url);
		Thread.sleep(500L);
		
		Actions_Ebay.input(ElementLocators_Ebay.TXT_Buscar, "SHOES");
		Actions_Ebay.click(ElementLocators_Ebay.BTN_Buscar);
		Actions_Ebay.input(ElementLocators_Ebay.TXT_Buscar_Marca, "PUMA");
		Actions_Ebay.chk(ElementLocators_Ebay.CHK_Marca);
		Actions_Ebay.chk(ElementLocators_Ebay.CHK_Talla);
		Actions_Ebay.print(ElementLocators_Ebay.TXT_Resul);
		
		Thread.sleep(2000L);
	//	Funtions_Ebay.Cerrar_Navegador();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		Funtions_Ebay.Cerrar_Navegador();
	}
}
}
