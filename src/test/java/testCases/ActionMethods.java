package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.ElementsIdentifier;
import pageObjects.ElementOperations;

import java.time.Duration;

public class ActionMethods {

    ElementsIdentifier elements = new ElementsIdentifier();
    ElementOperations operations = new ElementOperations();
    WebDriverWait wait;

    public void logindata(WebDriver driver, String uName, String Pwd) {
        operations.sendKeyData(driver, elements.userName, uName);
        operations.sendKeyData(driver, elements.passWord, Pwd);
        operations.clickOperation(driver, elements.clickLog);

    }

    public void productsData(WebDriver driver, String pName, String pList, String pCount, String addLineProd,String addLineConsume ) throws InterruptedException {
       // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/a[2]/div[1]"))));
        Thread.sleep(2000);
        operations.clickOperation(driver, elements.inventory);
        operations.clickOperation(driver, elements.productsMenu);
        operations.clickOperation(driver, elements.productsOption);
        operations.clickOperation(driver, elements.prodCreate);
        operations.sendKeyData(driver, elements.enterData, pName);
        operations.clickOperation(driver, elements.updateQantity);
        operations.clickOperation(driver, elements.addQuantity);
        operations.sendKeyData(driver, elements.addUser, "User");
        operations.sendKeyData(driver, elements.prodSelection, pList);
        operations.sendKeyData(driver, elements.prodQuantity, pCount);
        operations.clickOperation(driver, elements.prodSave);


    }

    public void manufactureData(WebDriver driver, String pName, String pList, String pCount, String addLineProd,String addLineConsume) throws InterruptedException {
        operations.clickOperation(driver, elements.appLink);
        operations.clickOperation(driver, elements.manufacturer);
        operations.clickOperation(driver, elements.manuCreate);
        operations.sendKeyData(driver, elements.manuProd, pName);
        operations.clickOperation(driver, elements.manuProd);
        handlingAlert(driver);
        operations.clickOperation(driver, elements.addLine);
        operations.sendKeyData(driver, elements.addLineProd, addLineProd);

        handlingAlert(driver);
        Thread.sleep(2000);
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/input[1]"))));
        operations.clickOperation(driver, elements.addLineProd);
        operations.sendKeyData(driver, elements.addLineConsume, addLineConsume);
        operations.clickOperation(driver, elements.manuSave);
        operations.clickOperation(driver, elements.manuConfirm);
        operations.clickOperation(driver, elements.markDone);
        operations.clickOperation(driver, elements.apply);
        String color = driver.findElement(By.xpath(elements.done)).getCssValue("color");
        String c = Color.fromString(color).asHex();
        Assert.assertEquals("#f6f7fa", c);


    }

    public boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void handlingAlert(WebDriver driver) {
        if (isAlertPresent(driver)) {
            Alert alert = driver.switchTo().alert();
            String alertMessage= driver.switchTo().alert().getText();
            System.out.println(alertMessage);
            alert.accept();

        }

    }
}
