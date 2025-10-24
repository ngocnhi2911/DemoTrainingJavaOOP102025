package bt_java_opp_1;

public class NhanVien {

    static String congty = "Công ty Nodo Smart Solution";
    String name;
    int tuoi;
    String phone;
    String diaChi;

    public NhanVien(String name, int tuoi, String phone, String diaChi){
        this.name = name;
        this.tuoi = tuoi;
        this.phone = phone;
        this.diaChi = diaChi;
    }

    public void displayInformation() {
        System.out.println("Thông tin nhân viên");
        System.out.println("Họ và tên: " + name);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số điện thoại: " + phone);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Công ty: " + congty);

    }
}
