package bt_java_oop_3.common;

public class BaseTest {

    //  Tạo class "BaseTest" để tạo hàm createDriver và closeDriver


    public void createDriver(){
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Closed Browser: " + Constants.browser);
    }


}
