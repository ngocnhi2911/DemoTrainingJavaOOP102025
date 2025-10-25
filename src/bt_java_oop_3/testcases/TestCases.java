package bt_java_oop_3.testcases;

import bt_java_oop_3.common.BaseTest;


public class TestCases extends BaseTest {

    private String url = "https://crm.anhtester.com/admin/authentication";
    private String email;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Testcase_Login(){
        createDriver();
        System.out.println("Truy cập vào đường link: " + getUrl());
        System.out.println("Verify đường link URL hiển thị đúng " + getUrl());
        System.out.println("Kiểm tra vào đúng trang header = 'Login' ");
        System.out.println("Nhập email: " + getEmail());
        System.out.println("Nhập password: " + getPassword());
        System.out.println("Click button Login");
        System.out.println("Kiểm tra kết quả");
        System.out.println("Đăng nhập thành công và hiển thị trang Dashboard");
        closeDriver();
    }


    public void Testcase_AddCategory(){
        createDriver();
        System.out.println("Truy cập vào đường link: " + getUrl());
        System.out.println("Verify đường link URL hiển thị đúng " + getUrl());
        System.out.println("Verify vào đúng trang header = 'Login' ");
        System.out.println("Nhập email: " + getEmail());
        System.out.println("Nhập password: " + getPassword());
        System.out.println("Click button Login");
        System.out.println("Kiểm tra kết quả");
        System.out.println("Đăng nhập thành công và hiển thị trang Dashboard");
        System.out.println("Truy cập vào trang Customers");
        System.out.println("Verify vào đúng trang header = Customers Summary");
        System.out.println("Verify vào đúng đường link = 'https://crm.anhtester.com/admin/clients'");
        System.out.println("Nhấn button New Customer");
        System.out.println("Hiển thị đúng trang title Customer Details");
        System.out.println("Verify nhập đúng thông tin hợp lệ và đầy đủ các trường");
        System.out.println("Nhấn button Save");
        System.out.println("Verify đã thêm mới customer thành công và hiển thị thông báo 'Customer add successfully'");
        System.out.println("Verify đã hiển thị đúng bản ghi vừa thêm mới trong trang Customers Summary");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.setEmail("admin@example.com");
        testCases.setPassword("123456");
        testCases.Testcase_Login();

        System.out.println("====================================================");
        testCases.Testcase_AddCategory();
    }


}
