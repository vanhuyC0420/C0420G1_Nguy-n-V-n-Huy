package dsa_danh_sach_list.bt_linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student(){
            }
            public Student(int id, String name){
                this.id=id;
                this.name=name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return this.name;
            }
        }
        LinkedList<Student> linkedList = new LinkedList<>();
        Student student1 = new Student(1,"Huy");
        Student student2 = new Student(2,"Trung");
        Student student3 = new Student(3,"Vu");
        Student student4 = new Student(4,"Viet");
        Student student5 = new Student(5,"Nam");

        linkedList.addFirst(student1);
        linkedList.add(0,student2);
//        linkedList.addLast(student3);
//        linkedList.add(3,student4);
//        linkedList.clear();
//        System.out.println(linkedList.getIndex(3).toString());
//        linkedList.remove(3);
        System.out.println("các phần tử trong danh sách: ");
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = (Student) linkedList.get(i);
            System.out.println(student.getName());
        }


//        System.out.println(linkedList.constrains(student3));
//        System.out.println(linkedList.getIndex(1));
//        linkedList.getIndex(1);
//        System.out.println("Kiểm tra đối tượng có nằm trong danh sách không");
//        System.out.println(linkedList.indexOf(student3));

//        LinkedList<Student> clonelinkedList = linkedList.clone();
//        for (int i = 0; i<clonelinkedList.size();i++){
//            Student student = (Student) linkedList.get(i);
//            System.out.println(student.getName());
//        }

    }
}
