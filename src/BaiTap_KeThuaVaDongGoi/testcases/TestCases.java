package BaiTap_KeThuaVaDongGoi.testcases;

import BaiTap_KeThuaVaDongGoi.common.BaseTest;

public class TestCases extends BaseTest {
    public void loginCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login ");
        System.out.println("Enter email and pass");
        System.out.println("Click Login Button ");
        System.out.println("Verify the messge succeccfullu is display ");
        closeDriver("Chrome");
    }
    public void addcategoryCMS(){
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login ");
        System.out.println("Enter email and pass");
        System.out.println("Click Login Button ");
        System.out.println("Verify the messge succeccfullu is display ");

        System.out.println("Click on the Products menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click add new category button");
        System.out.println("Enter data for all fields in form add category");
        System.out.println("Click save button");
        System.out.println("Verify  new category service");
        closeDriver("Chrome");
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.loginCMS();
        System.out.println("---------------------------");
        testCases.addcategoryCMS();
    }
}
