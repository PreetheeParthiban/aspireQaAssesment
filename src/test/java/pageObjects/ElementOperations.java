package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementOperations {
    WebDriverWait wait;
    public void sendKeyData(WebDriver driver, String locator, String data){

        WebElement senddata= driver.findElement(By.xpath(locator));
        if(senddata.isEnabled()&&senddata.isDisplayed()){
            senddata.sendKeys(data);
        }
    }

    public void clickOperation(WebDriver driver, String locator){
       WebElement data= driver.findElement(By.xpath(locator));
        if(data.isEnabled()) {

            data.click();
        }
    }



}
