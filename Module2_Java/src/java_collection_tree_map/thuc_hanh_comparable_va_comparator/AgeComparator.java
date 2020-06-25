package java_collection_tree_map.thuc_hanh_comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "Quảng Bình");
        Student student1 = new Student("Nam", 26, "Quảng Nam");
        Student student2 = new Student("Anh", 28, "Quảng Trị" );
        Student student3 = new Student("Tung", 18, "Quảng Ngãi" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        System.out.println("So sánh theo tên: ");
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("\n So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
