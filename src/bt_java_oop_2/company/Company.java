package bt_java_oop_2.company;

import bt_java_oop_2.person.Person;

public class Company extends Person {

    public Company(String name, int age, String gender){
        super(name,age,gender);
    }

    public static void main(String[] args) {
        Company company = new Company("Nguyễn Ngọc Yến Nhi", 23, "Nữ");
        company.getInfo();

    }
}
