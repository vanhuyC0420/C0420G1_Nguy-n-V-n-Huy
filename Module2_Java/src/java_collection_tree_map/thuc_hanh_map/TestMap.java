package java_collection_tree_map.thuc_hanh_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        /**Tạo HashMmap để luu danh sách học viên. */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hoạt", 16);
        hashMap.put("Huy", 30);
        hashMap.put("Việt", 30);
        hashMap.put("Vũ", 18);
        hashMap.put("Trung", 17);
        System.out.println("Display entries in HashMap:");
        System.out.println(hashMap + "\n");

        /**Tạo Treemap để lưu key theo thứ tự giảm dần*/
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        /**Tạo LinkedHashMap lưu danh sách sinh viên và hiển thị dữ liệu*/
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("hiếu",19);
        linkedHashMap.put("thịnh",18);
        linkedHashMap.put("tường",20);
        linkedHashMap.put("cook",29);
        System.out.println("\nThe age for "+"Hiếu is "+linkedHashMap.get("Hiếu"));
        System.out.println(linkedHashMap);
    }
}
