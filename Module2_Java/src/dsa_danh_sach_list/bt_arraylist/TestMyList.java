package dsa_danh_sach_list.bt_arraylist;

import java.util.ArrayList;

public class TestMyList {
    public static class Animal {
        private int leg;
        private String name;

        public Animal() {
        }

        public Animal(int leg, String name) {
            this.leg = leg;
            this.name = name;
        }

        public int getLeg() {
            return leg;
        }

        public void setLeg(int leg) {
            this.leg = leg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Animal animal = new Animal(4,"Mèo");
        Animal animal1 = new Animal(4,"Chó");
        Animal animal2 = new Animal(2,"Gà");
        Animal animal3 = new Animal(0,"Rắn");
        ArrayList<Animal> arrayList = new ArrayList<>(5);
        arrayList.add(0,animal);
        arrayList.add(1,animal1);
        arrayList.add(animal2);
        arrayList.add(3,animal3);
        for (int i = 0;i< arrayList.size();i++) {

            System.out.println(arrayList.get(i).getName());
        }
    }
}
