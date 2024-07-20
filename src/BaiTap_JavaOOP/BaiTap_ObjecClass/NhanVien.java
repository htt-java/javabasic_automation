package BaiTap_JavaOOP.BaiTap_ObjecClass;

public class NhanVien {
    private String name;
    private int age;
    private String phone;
    private String address;

    public NhanVien(){
        name = "Nhuận Hữu";
        age = 27;
        phone = "0964663104";
        address = "Bình Định";
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    public NhanVien(String name, int age, String phone, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
}
