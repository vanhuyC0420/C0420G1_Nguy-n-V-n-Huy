package dsa_danh_sach.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(2);
        listInt.add(4);

        System.out.println("element 1: "+listInt.get(0));
        System.out.println("element 2: "+listInt.get(1));
        System.out.println("element 3: "+listInt.get(2));
/**
 * 2 trường hợp dưới bị lỗi do nằm ngoài phần tử của mảng và báo lỗi
 * Exception và đã viết trình báo lỗi ở hàm get(int i) bên lớp Mylist:
 * **/
//        listInt.get(6);
//        System.out.println("element 6: "+listInt.get(6));
//        listInt.get(-1);
//        System.out.println("element -1: " + listInt.get(-1));
    }
}
