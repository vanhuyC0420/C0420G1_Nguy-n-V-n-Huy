package accessmodifier;

public class TestStatic {
    public static void main(String args[]) {
        testBT.change();//calling change method
//creating objects
        testBT s1 = new testBT(111, "Hoang");
        testBT s2 = new testBT(222, "Khanh");
        testBT s3 = new testBT(333, "Nam");
//calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
