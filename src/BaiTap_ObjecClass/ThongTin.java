package BaiTap_ObjecClass;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        System.out.println(nv1.getName());
        System.out.println(nv1.getAge());
        System.out.println(nv1.getPhone());
        System.out.println(nv1.getAddress());

        System.out.println("=================");

        NhanVien nv2 = new NhanVien("Thái Huệ", 28, "0964663104", "Hồ Chí Minh");
        System.out.println(nv2.getName());
        System.out.println(nv2.getAge());
        System.out.println(nv2.getPhone());
        System.out.println(nv2.getAddress());
    }
}
