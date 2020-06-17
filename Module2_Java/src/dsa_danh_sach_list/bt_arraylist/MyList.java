package dsa_danh_sach_list.bt_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    /**Hàm tạo không đối số**/
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    /**Hàm tạo có đối số, tham số truyền vào là độ dài của danh sách**/
    public MyList(int capacity){
        if (capacity>=0){
            elements = new Object[capacity];
        }else{
            throw new IndexOutOfBoundsException("capacity: "+capacity);
        }
    }
    /**
     * Phương thức thêm phần tử vào vị trí index*/
    public void add(int index, E element){
        if (index>elements.length){
            throw new IndexOutOfBoundsException("Index: "+index);
        }else if (elements.length == size){
            this.ensureCapacity(4);
        }
        if (elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for (int i = size+1;i<=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
    /**
     * Lấy về độ dài của danh sách*/
    private int getSize(){
        return this.size;
    }
    /**Xoá toàn bộ phần tử của danh sách, gán tất cả = null*/
    public void clear(){
        size = 0;
        for (int i =0;i<elements.length;i++){
            elements[i]=null;
        }
    }
    /**Thêm phần tử vào cuối danh sách Mylist*/
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(4);
        }
        elements[size] = element;
        size++;
        return true;
    }
    /**
     * Hàm mở rộng danh sách*/
    public void ensureCapacity(int minCapa){
        if (minCapa >= 0){
            int newSize = this.elements.length+minCapa;
            elements= Arrays.copyOf(elements, newSize);
        }else {
            throw new IndexOutOfBoundsException("Mincapa: "+minCapa);
        }
    }
    public E get(int i){
        if (i>= size || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+",size: "+i);
        }
        return (E) elements[i];
    }

}
