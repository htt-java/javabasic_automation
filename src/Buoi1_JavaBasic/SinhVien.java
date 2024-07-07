package Buoi1_JavaBasic;

public class SinhVien {
    public void sinhvien(){
        //biến local
        int a = 40;
        System.out.println("Giá trị của a là: " +a);
    }

    //biến toàn cục
    String name = "Huu";
    int age = 27;

    public void getInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }

    //biến static
    public static String ten = "Thai Hang";
    public static String diachi = "Hồ Chí Minh";
    public static String sdt = "0964663104";

    public static void main(String[] args) {
        //biến cục bộ
        //System.out.println("Giá trị của a là: " +a);
        SinhVien bienLocal = new SinhVien();
        bienLocal.sinhvien();
        String name = "Huu";

        //biến tòan cục
        SinhVien sv = new SinhVien();
        sv.getInfo();

        //biến static
        System.out.println("Tên: " +ten);
        System.out.println("Địa chỉ: " +diachi);
        System.out.println("Số điện thoại: " +sdt);
    }
}
