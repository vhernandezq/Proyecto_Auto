package Factory;


import Actions.Actions_Ebay;
import ElementLocators.ElementLocators_Ebay;
import Funtions.Funtions_Ebay;
import Funtions.Var_Ebay;

public class Factory_Ebay {

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
		Actions_Ebay.click(ElementLocators_Ebay.BTN_Ordenar);
		Actions_Ebay.click(ElementLocators_Ebay.BTN_Ordenar);
		Thread.sleep(2000L);
		Actions_Ebay.click(ElementLocators_Ebay.SEL_Precio_asc);
		
		System.out.println("Imprimir los 5 primeros registros");
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_1);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_2);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_3);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_4);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_5);
		
		System.out.println("Por precio de manera descendente");
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_5);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_4);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_3);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_2);
		Actions_Ebay.print(ElementLocators_Ebay.SEL_Produc_1);
		
		
		Thread.sleep(2000L);
		Funtions_Ebay.Cerrar_Navegador();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		Funtions_Ebay.Cerrar_Navegador();
	}
}
}
