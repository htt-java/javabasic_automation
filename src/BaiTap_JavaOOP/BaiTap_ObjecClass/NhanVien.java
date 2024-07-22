package BaiTap_JavaOOP.BaiTap_ObjecClass;

public class NhanVien {
    private String name;
    private int age;
    private String phone;
    private String address;
    private String gender;
    private String msnn;
    private String birthday;

    /*public NhanVien(String name, int age, String phone, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }*/

    public NhanVien(String name, int age, String phone, String address, String gender, String msnn, String birthday) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.msnn = msnn;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getMsnn() {
        return msnn;
    }

    public String getBirthday() {
        return birthday;
    }
}
