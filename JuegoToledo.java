package com.testPrueba;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JuegoToledo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        String baseURL = "http://zzzscore.com/1to50/en/?ts=1586171507985";
        String actualresult = "";
        String expectedresult = "1to50, Your score :";
        String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        //abrir navegador
        driver = new ChromeDriver();
        //navegar a la pag
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try {

            WebElement cuaUno = driver.findElement(By.xpath("//div[text()='1']"));
            cuaUno.click();
            WebElement cua2 = driver.findElement(By.xpath("//div[text()='2']"));
            cua2.click();
            WebElement cua3 = driver.findElement(By.xpath("//div[text()='3']"));
            cua3.click();
            WebElement cua4 = driver.findElement(By.xpath("//div[text()='4']"));
            cua4.click();
            WebElement cua5 = driver.findElement(By.xpath("//div[text()='5']"));
            cua5.click();
            WebElement cua6 = driver.findElement(By.xpath("//div[text()='6']"));
            cua6.click();
            WebElement cua7 = driver.findElement(By.xpath("//div[text()='7']"));
            cua7.click();
            WebElement cua8 = driver.findElement(By.xpath("//div[text()='8']"));
            cua8.click();
            WebElement cua9 = driver.findElement(By.xpath("//div[text()='9']"));
            cua9.click();
            WebElement cua10 = driver.findElement(By.xpath("//div[text()='10']"));
            cua10.click();

            WebElement cua11 = driver.findElement(By.xpath("//div[text()='11']"));
            cua11.click();
            WebElement cua12 = driver.findElement(By.xpath("//div[text()='12']"));
            cua12.click();
            WebElement cua13 = driver.findElement(By.xpath("//div[text()='13']"));
            cua13.click();
            WebElement cua14 = driver.findElement(By.xpath("//div[text()='14']"));
            cua14.click();
            WebElement cua15 = driver.findElement(By.xpath("//div[text()='15']"));
            cua15.click();
            WebElement cua16 = driver.findElement(By.xpath("//div[text()='16']"));
            cua16.click();
            WebElement cua17 = driver.findElement(By.xpath("//div[text()='17']"));
            cua17.click();
            WebElement cua18 = driver.findElement(By.xpath("//div[text()='18']"));
            cua18.click();
            WebElement cua19 = driver.findElement(By.xpath("//div[text()='19']"));
            cua19.click();
            WebElement cua20 = driver.findElement(By.xpath("//div[text()='20']"));
            cua20.click();
            WebElement cua21 = driver.findElement(By.xpath("//div[text()='21']"));
            cua21.click();
            WebElement cua22 = driver.findElement(By.xpath("//div[text()='22']"));
            cua22.click();
            WebElement cua23 = driver.findElement(By.xpath("//div[text()='23']"));
            cua23.click();
            WebElement cua24 = driver.findElement(By.xpath("//div[text()='24']"));
            cua24.click();
            WebElement cua25 = driver.findElement(By.xpath("//div[text()='25']"));
            cua25.click();

            WebElement cua26 = driver.findElement(By.xpath("//div[text()='26']"));
            cua26.click();
            WebElement cua27 = driver.findElement(By.xpath("//div[text()='27']"));
            cua27.click();
            WebElement cua28 = driver.findElement(By.xpath("//div[text()='28']"));
            cua28.click();
            WebElement cua29 = driver.findElement(By.xpath("//div[text()='29']"));
            cua29.click();
            WebElement cua30 = driver.findElement(By.xpath("//div[text()='30']"));
            cua30.click();
            WebElement cua31 = driver.findElement(By.xpath("//div[text()='31']"));
            cua31.click();
            WebElement cua32 = driver.findElement(By.xpath("//div[text()='32']"));
            cua32.click();
            WebElement cua33 = driver.findElement(By.xpath("//div[text()='33']"));
            cua33.click();
            WebElement cua34 = driver.findElement(By.xpath("//div[text()='34']"));
            cua34.click();
            WebElement cua35 = driver.findElement(By.xpath("//div[text()='35']"));
            cua35.click();
            WebElement cua36 = driver.findElement(By.xpath("//div[text()='36']"));
            cua36.click();
            WebElement cua37 = driver.findElement(By.xpath("//div[text()='37']"));
            cua37.click();
            WebElement cua38 = driver.findElement(By.xpath("//div[text()='38']"));
            cua38.click();
            WebElement cua39 = driver.findElement(By.xpath("//div[text()='39']"));
            cua39.click();
            WebElement cua40 = driver.findElement(By.xpath("//div[text()='40']"));
            cua40.click();
            WebElement cua41 = driver.findElement(By.xpath("//div[text()='41']"));
            cua41.click();
            WebElement cua42 = driver.findElement(By.xpath("//div[text()='42']"));
            cua42.click();
            WebElement cua43 = driver.findElement(By.xpath("//div[text()='43']"));
            cua43.click();
            WebElement cua44 = driver.findElement(By.xpath("//div[text()='44']"));
            cua44.click();
            WebElement cua45 = driver.findElement(By.xpath("//div[text()='45']"));
            cua45.click();
            WebElement cua46 = driver.findElement(By.xpath("//div[text()='46']"));
            cua46.click();
            WebElement cua47 = driver.findElement(By.xpath("//div[text()='47']"));
            cua47.click();
            WebElement cua48 = driver.findElement(By.xpath("//div[text()='48']"));
            cua48.click();
            WebElement cua49 = driver.findElement(By.xpath("//div[text()='49']"));
            cua49.click();
            WebElement cua50 = driver.findElement(By.xpath("//div[text()='50']"));
            cua50.click();

            actualresult = driver.findElement(By.xpath("//*[@id=\"result\"]/div[2]/p[1]")).getText();
            String actualresult2 = driver.findElement(By.xpath("//*[@class=\"level\"]")).getText();


            if (actualresult.contentEquals(expectedresult)){
                System.out.println("OK, se muestra el msj: "+ expectedresult + actualresult2);
            }
            else {
                System.out.println("FAIL, no se muestra el msj: " + actualresult);
            }

        } catch (NoSuchElementException ne) {
            System.err.println("El elemento no se encontro " + ne.getMessage());
        } catch (WebDriverException we) {
            System.err.println("Se cerro el browser ");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());

        } finally {
            //driver.close();
        }

    }




}
