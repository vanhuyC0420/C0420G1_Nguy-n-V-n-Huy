package java_collection_tree_map.thuc_hanh_phanbiet_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20,"Hà Nội");
        Student student2 = new Student("Năm",30,"Hà Nam");
        Student student3 = new Student("Nậm",25,"Hà Tĩnh");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student2);
        for (Map.Entry<Integer,Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println(".....Set");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student2);
        for (Student student : studentSet){
            System.out.println(student.toString());
        }
    }
}
