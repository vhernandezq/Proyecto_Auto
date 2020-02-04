package ElementLocators;

import org.openqa.selenium.By;

public class ElementLocators_Ebay {
	// declaracion de toda la lista de identificadores de objetos
	public static By TXT_Buscar= By.id("gh-ac");
	public static By BTN_Buscar= By.id("gh-btn");
	public static By TXT_Buscar_Marca= By.id("w4-w2-0[0]");
	public static By CHK_Marca= By.xpath("//*[@id='w4-w2']/ul/li[7]/div/a/div/input");
	public static By CHK_Talla= By.xpath("//*[@id='x-refine__group_1__3']/ul/li[5]/div/a");
	public static By TXT_Resul= By.xpath("//*[@id='mainContent']/div[1]/div/div[2]/div/div[1]/h1");
	public static By BTN_Ordenar= By.id("w9");
	public static By SEL_Precio_asc= By.xpath("//*[@id='w9']/div/div/ul/li[4]/a");
	
	public static By SEL_Produc_1= By.xpath("//*[@id='srp-river-results-listing1']/div/div[2]");
	public static By SEL_Produc_2= By.xpath("//*[@id='srp-river-results-listing2']/div/div[2]");
	public static By SEL_Produc_3= By.xpath("//*[@id='srp-river-results-listing3']/div/div[2]");
	public static By SEL_Produc_4= By.xpath("//*[@id='srp-river-results-listing4']/div/div[2]");
	public static By SEL_Produc_5= By.xpath("//*[@id='srp-river-results-listing5']/div/div[2]");
	
	
}
