package com.testPrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsExample {
    //instanciar un objeto WebDriver
   static WebDriver driver;
    public static void main(String[] args){

    //Para poner excepciones a errores previstos se abre con un try{
    try {
        //Variables
        String baseURL= "http://carmelimportaciones.com/";
        String actualresult = "";
        String expectedresult = "CARMEL Importaciones";

        //localizacion del archivo chromedriver.exe
        //System.getProperty("user.dir") = C:\..\..\..\ProyectCarmel
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

        //abrir navegador
        driver = new ChromeDriver();

        //navegar a la pag
        driver.get(baseURL);

        if(driver.findElement(By.xpath("//*[@id=\"cabezal\"]/a/img")).isDisplayed()) {
            driver.findElement(By.id("user")).sendKeys("dariemdelafe@gmail.com");
            driver.findElement(By.id("passS")).sendKeys("Macongui56.");
            driver.findElement(By.className("enter")).click();

            assertEquals(driver.getTitle(),"CARMEL Importaciones");
            System.out.println("Pag OK");
        }     
        
        //tomar el titulo
        actualresult = driver.getTitle();

        //imprimir el resultado (comparacion)
        System.out.println(actualresult.contentEquals(expectedresult)? "Pasó la Prueba " + actualresult : "FALLO la Prueba");

        //Asi se ponen las excepciones, tiene que ser en orden jerarquico
    }catch (NoSuchElementException ne){
        System.err.println("El elemento no se encontro "+ ne.getMessage());
        //la jerarquia de menor a mayor
    }catch (WebDriverException we){
        System.err.println("Se cerro el browser");
    }catch (Exception ex){
        System.err.println(ex.getMessage());
    }

    finally {
        driver.close();
    }
  }

    private static void assertEquals(String title, String carmel_importaciones) {
    }
}