package Accessmodifier;

//public class Test {
//}
public class A{
    int data=40;
    protected void msg(){System.out.println("Hello java");}
}

class Simple{
    public static void main(String args[]){
        A obj=new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}
