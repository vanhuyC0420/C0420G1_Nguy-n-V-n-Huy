package array_method.xoa_phan_tu_mang;

import java.util.ArrayList;

public class deleteIndex {
    public static void main(String[] args) {
        // Xoá phần tử trong mảng dùng ArrayList
        ArrayList objArray = new ArrayList();
            objArray.clear();
            objArray.add(0,"0th");
            objArray.add(1,"1st");
            objArray.add(2,"2nd");
            System.out.println("Array before removing an element"+objArray);
            objArray.remove(1);
            objArray.remove("0th");
            System.out.println("Array after removing an element:"+objArray);
    }

// Code sai hết
//        int arrayNumber[]={1,2,3,4,5,6};
////        System.out.println(Arrays.toString(arrayNumber));
//        int number = 5;
//        for (int i = 0;i<arrayNumber.length;i++){
//            System.out.print(arrayNumber[i]+", ");
//            if (arrayNumber[i]==number){
//               arrayNumber[i]=arrayNumber[i+1];
//               arrayNumber[arrayNumber.length-1]=0;
//            }
//        }
////        System.out.println("Array àfter delete is : " + A);

}
