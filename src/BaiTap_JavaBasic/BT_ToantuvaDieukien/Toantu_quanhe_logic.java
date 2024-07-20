package BaiTap_JavaBasic.BT_ToantuvaDieukien;

public class Toantu_quanhe_logic {
    public static void main(String[] args) {
        //toán tử quan hệ
        int a1 = 7;
        int b1 = 9;
        System.out.println(a1==b1);
        System.out.println(a1!=b1);
        System.out.println(a1>b1);
        System.out.println(a1<b1);
        System.out.println(a1>=b1);
        System.out.println(a1<=b1);

        //toán tử logic
        int x=4;
        //int y=8;
        //ktra giá trị x>y và x<y hay không
        System.out.println(x>0 && x<0);

        //ktra x>y hoặc x<y
        System.out.println(x>0 || x<-2);

        //ktra phủ định
        System.out.println(!(x>8 || x<-6));


    }

}
