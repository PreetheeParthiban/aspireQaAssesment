package testData;

import org.testng.annotations.DataProvider;

public class testDataProvider {
    @DataProvider(name = "LoginData")
    public Object[][] toGetData() {
        Object[][] loginData = {{"user@aspireapp.com", "@sp1r3app"}};
        return loginData;
    }

    @DataProvider(name = "ProdData")
    public Object[][] toGetProdData() {
        Object[][] productData = {{"Prodd1", "WH/Stock","12","[12] Pizza","14"}};
        return productData;
    }
}
