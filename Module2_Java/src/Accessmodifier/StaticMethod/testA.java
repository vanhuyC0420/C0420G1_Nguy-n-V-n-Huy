package Accessmodifier.StaticMethod;

import Accessmodifier.A;

public class testA extends A {
    public static void main(String[] args) {
        testA obj = new testA();//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
