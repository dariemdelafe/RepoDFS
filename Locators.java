package com.testPrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        String baseURL= "http://carmelimportaciones.com/";
        String actualresult = "";
        String expectedresult = "TOTAL $ 1800 ";
        String actualresult2 = "";
        String expectedresult2 = "DISPLAY IPHONE 5S C/TOUCH BLANCO";
        String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        //abrir navegador
        driver = new ChromeDriver();
        //navegar a la pag
        driver.get(baseURL);
        driver.manage().window().maximize();

        //@Paso1 Login

        if(driver.findElement(By.xpath("//*[@id='cabezal']/a/img")).isDisplayed()) {
            driver.findElement(By.id("user")).sendKeys("dariemdelafe@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("Macongui56.");
            driver.findElement(By.className("enter")).click();

            assertEquals(driver.getTitle(),"CARMEL Importaciones");
            System.out.println("Pag OK");
        }

        //@Paso2 Buscar Producto
        WebElement searchbox = driver.findElement(By.id("q"));
        searchbox.clear();
        searchbox.sendKeys("Samsung");
        //driver.findElement(By.id("q")).sendKeys("Samsung");
        //searchbox.submit();

        //Otra via mas optima
       // WebElement searchBox = driver.findElement(By.id("q"));
      //WebElement lupaSearch = driver.findElement(By.cssSelector("input.lupa"));
        //searchBox.clear();
       //searchBox.sendKeys("Samsung");
        //lupaSearch.click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        //@Paso3 Limpia textbox y cambia de busqueda
        searchbox.clear();
        searchbox.sendKeys("Iphone");
        searchbox.submit();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Seleccionar Prod
        driver.findElement(By.xpath("//*[@src='fotos/8989.jpg']")).click();

        //mensaje PRODUCTOS DESTACADOS
        actualresult2 = driver.findElement(By.xpath("//*[@id='detalle']/h1")).getText();

        if (actualresult2.contentEquals(expectedresult2)){
            System.out.println("Pag OK, se muestra el msj: "+ expectedresult2);
        }
        else {
            System.out.println("Pag INCORRECTA, no se muestra el msj: " + actualresult2);
        }

        //Más Cantidad
        Select masCant = new Select(driver.findElement(By.id("cant")));
        masCant.selectByValue("3");
        WebElement agregarCarrito = driver.findElement(By.id("imageField"));
        agregarCarrito.click();
        //Más Catidad (otra vía)
        //driver.findElement(By.xpath("//*[@id=\"cant\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"cant\"]")).sendKeys("3");
        //driver.findElement(By.xpath("//*[@id=\"cant\"]")).click();
        //driver.findElement(By.cssSelector("#imageField")).click();

        //Acceder al carrito
        driver.findElement(By.xpath("//*[@id='carro']/a/img")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
        driver.findElement(By.xpath("//*[@alt='Eliminar producto']")).click();

        //Desloguear usuario
        driver.findElement(By.xpath("//*[@id='login']/a[2]/img")).click();

        driver.close();


    }

    private static void assertEquals(String s, String title) {
    }


}