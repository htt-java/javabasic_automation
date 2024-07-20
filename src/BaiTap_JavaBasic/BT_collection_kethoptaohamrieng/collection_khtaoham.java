package BaiTap_JavaBasic.BT_collection_kethoptaohamrieng;

import java.util.ArrayList;

public class collection_khtaoham {
    public static void main(String[] args) {
        ArrayList<String> addthongtin = new ArrayList<>();

        //thêm thông tin tin
        addthongtin.add("Tên");
        addthongtin.add("Tuổi");
        addthongtin.add("Giới Tính");
        addthongtin.add("Nơi cư trú");
        for (int i=0; i<addthongtin.size(); i++){
            System.out.println(addthongtin.get(i));
        }

        //trả về 1 bản sao của mảng
        System.out.println("==============");
        addthongtin.clone();
        for (int i=0; i<addthongtin.size(); i++){
            System.out.println(addthongtin.get(i));
        }

        //clear all các phần tử trong danh sách
        System.out.println("==============");
        addthongtin.clear();
        for (int i=0; i<addthongtin.size(); i++){
            System.out.println(addthongtin.get(i));
        }

    }
}
