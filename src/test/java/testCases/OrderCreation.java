package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class OrderCreation {
    WebDriver driver;
    ActionMethods callMethods=new ActionMethods();

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void setUp(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /*@AfterSuite(alwaysRun = true)
     public void tearDown(){
         driver.quit();
     }*/
    @Test(dataProvider = "LoginData", dataProviderClass = testData.testDataProvider.class, priority = 1)
    public void loginCase(String userName, String password) {
        callMethods.logindata(driver, userName, password);

    }


    @Test(priority = 2,dataProvider = "ProdData", dataProviderClass = testData.testDataProvider.class)
    public void createProduct(String pName, String pList, String pCount, String addLineProd,String addLineConsume) {

        callMethods.productsData(driver,pName,pList,pCount,addLineProd,addLineConsume);





    }
    @Test(priority = 3,dependsOnMethods = {"createProduct"},dataProvider = "ProdData", dataProviderClass = testData.testDataProvider.class)
    public void createManufacturer(String pName, String pList, String pCount, String addLineProd,String addLineConsume) {
        callMethods.manufactureData(driver,pName,pList,pCount,addLineProd,addLineConsume);
    }

}
