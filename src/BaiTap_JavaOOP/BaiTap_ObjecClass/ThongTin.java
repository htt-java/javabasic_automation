package BaiTap_JavaOOP.BaiTap_ObjecClass;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Thái Hảo",25,"0975754596", "Hà Nội", "Nữ", "125", "11/07/2000");
        System.out.println(nv1.getName());
        System.out.println(nv1.getAge());
        System.out.println(nv1.getPhone());
        System.out.println(nv1.getAddress());
        System.out.println(nv1.getGender());
        System.out.println(nv1.getMsnn());
        System.out.println(nv1.getBirthday());

    }
}
