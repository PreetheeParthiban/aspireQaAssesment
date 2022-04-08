package pageObjects;

import org.openqa.selenium.By;

public class ElementsIdentifier {

    // Login Page
    public String  userName ="//input[@id='login']";
    public String passWord="//input[@id='password']";
    public String clickLog="//button[@type='submit']";

    //App Page
    public String inventory = "//a[@id='result_app_1']/div[@class='o_app_icon']";
    public String appLink = "//header/nav[1]/a[1]";
    //public String manufacturer = "//a[@id='result_app_1']/div[@class='o_caption']";
    public String manufacturer = "//body/div[1]/div[1]/div[2]/div[1]/a[3]/div[1]";
    //Inventory Page
    public String productsMenu = "//button[@title='Products']";
    public String productsOption="//a[contains(text(),'Products')]";
    public String prodCreate = "//button[@type='button' and @title='Create record']";
    public String enterData = "//input[@placeholder='e.g. Cheese Burger']";
    public String updateQantity = "//button[@type='button' and @name='action_update_quantity_on_hand']";
    public String addQuantity="//button[@type='button' and @class='btn btn-primary o_list_button_add']";
    public String addUser="//tbody/tr[1]/td[9]/div[1]/div[1]/div[1]/input[1]";
    public String prodSelection = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]";
    public String prodQuantity = "//tbody/tr[1]/td[6]/input[1]";
    public String prodSave = "//button[contains(text(),'Save')]";

    //Manufacturing Page
     public String manuCreate = "//button[contains(text(),'Create')]";
     public String manuProd ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/div[1]/input[1]";
     public String addLine = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]";
     public String addLineProd ="//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/input[1]";
     public String addLineConsume ="//tbody/tr[1]/td[3]/input[1]";
     public String manuSave = "//button[contains(text(),'Save')]";
     public String manuConfirm ="//span[contains(text(),'Confirm')]";
     public String markDone="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[3]/span[1]";
     public String done="//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]";

     //pop-up
    public String apply="//span[contains(text(),'Apply')]";






}

