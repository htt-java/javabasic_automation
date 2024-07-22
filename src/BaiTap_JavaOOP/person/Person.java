package BaiTap_JavaOOP.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    //hàm xd k tham số
    public Person(){
        name = "Hoàng Quyên";
        age = 25;
        gender = "Nữ";
        address = "Bình Dương";
        phone = "0964663104";
    }

    //hàm xd có tham số
    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    protected void getInfomation(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(phone);
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    protected String getAddress(){
        return address;
    }

    protected String getPhone(){
        return phone;
    }
}
