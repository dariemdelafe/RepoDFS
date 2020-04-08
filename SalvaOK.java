package com.testPrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SalvaOK {
    public static void main(String[] args) {
        WebDriver driver;

        String baseURL= "http://carmelimportaciones.com/";
        String actualresult = "";
        String expectedresult = "TOTAL $ 1800 ";
        String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        //abrir navegador
        driver = new ChromeDriver();
        //navegar a la pag
        driver.get(baseURL);
        driver.manage().window().maximize();

        //@Paso1 Login

        if(driver.findElement(By.xpath("//*[@id=\"cabezal\"]/a/img")).isDisplayed()) {
            driver.findElement(By.id("user")).sendKeys("dariemdelafe@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("Macongui56.");
            driver.findElement(By.className("enter")).click();

            assertEquals(driver.getTitle(),"CARMEL Importaciones");
        }
        //@Paso2 Buscar Producto
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        driver.findElement(By.id("q")).sendKeys("Samsung");
        searchbox.submit();

        //@Paso3 Limpia textbox y cambia de busqueda
        WebElement searchbox1 = driver.findElement(By.name("q"));
        searchbox1.clear();
        driver.findElement(By.id("q")).sendKeys("iphone");
        searchbox1.submit();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // Seleccionar Prod
        driver.findElement(By.xpath("//*[@src=\"fotos/8989.jpg\"]")).click();

        //Más Cantidad
        driver.findElement(By.xpath("//*[@id=\"cant\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"cant\"]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"cant\"]")).click();
        driver.findElement(By.cssSelector("#imageField")).click();

        //Acceder al carrito
        driver.findElement(By.xpath("//*[@id=\"carro\"]/a/img")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        //Obtener resultados
        actualresult = driver.findElement(By.cssSelector("#carroitems > div.fluid.total")).getText();

        //Comprobacion de resultados
        if (actualresult.contentEquals(expectedresult)){
            System.out.println("Prueba OK! el resultado actual es: "+ actualresult + "es igual a: "+ expectedresult);
        }
        else{
            System.out.println("Prueba FALLIDA! el resultado actual es: "+ actualresult + " NO es igual a: "+ expectedresult);
        }

        //Eliminar compra
        driver.findElement(By.xpath("//*[@alt=\"Eliminar producto\"]")).click();

        //Desloguear usuario
        driver.findElement(By.xpath("//*[@id=\"login\"]/a[2]/img")).click();

        driver.close();

    }

    private static void assertEquals(String s, String title) {
    }



}
