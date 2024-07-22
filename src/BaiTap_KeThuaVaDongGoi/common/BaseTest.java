package BaiTap_KeThuaVaDongGoi.common;

public class BaseTest extends Constants{
    public void createDriver(){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver(String browser){
        System.out.println("Closed browser: " + browser);
    }
}
