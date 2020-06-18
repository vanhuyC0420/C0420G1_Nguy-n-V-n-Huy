package dsa_stack_queue.bai_tap.thapphannhiphan;

import java.util.Scanner;

public class Converser {
    private int arr[];
    private int size;
    public int index = 0;

    public Converser(int size) {
        this.size = size;
        arr = new int[10];
    }
    public int isLength(){
        return index;
    }
    public boolean isFull(){
        if (size == index)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if (index < 0)
            return true;
        return false;
    }
    public void push(int element){
        if (isFull())
//            System.out.println("Cảnh báo!!! stack đã đầy");
            throw new StackOverflowError("Stack is full");
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty())
            throw new Exception("Có gì đây mà lấy ra.");
        return arr[index--];
    }


}
