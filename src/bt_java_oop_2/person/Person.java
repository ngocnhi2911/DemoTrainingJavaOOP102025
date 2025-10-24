package bt_java_oop_2.person;

public class Person {

    String name;
    int age;
    String gender;
    String address;
    String phone;

    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void displayInformation() {
        System.out.println("Thông tin nhân viên");
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phone);

    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getInfo(){
        System.out.println("Thông tin nhân viên");
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
    }


}
