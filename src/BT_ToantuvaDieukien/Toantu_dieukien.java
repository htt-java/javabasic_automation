package BT_ToantuvaDieukien;

public class Toantu_dieukien {
    public static void main(String[] args) {
        int number = 100;
        int n = 97;
        //th1 n==number
        if(n==number)
            System.out.println("Giá trị bằng nhau");
        else
            System.out.println("Giá trị không bằng nhau");

        //th2 n<number
        if(n<number)
        System.out.println("Giá trị n bé hơn number");
        else
        System.out.println("Giá trị so sánh không đúng");

        //th3 n>number
        if(n>number)
            System.out.println("Giá trị n không lớn hơn number");
        else
            System.out.println("Giá trị so sánh không đúng");
    }
}
