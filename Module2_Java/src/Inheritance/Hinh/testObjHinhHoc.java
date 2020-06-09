package Inheritance.Hinh;

import Inheritance.Hinh.objectHinhHoc;

public class testObjHinhHoc {
    public static void main(String[] args) {
        objectHinhHoc hinhHoc = new objectHinhHoc();
        System.out.println(hinhHoc);
        hinhHoc = new objectHinhHoc("Red",false);
        System.out.println(hinhHoc);
    }
}
