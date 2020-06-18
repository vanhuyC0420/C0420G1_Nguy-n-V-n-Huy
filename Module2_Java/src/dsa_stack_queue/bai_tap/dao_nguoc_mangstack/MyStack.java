package dsa_stack_queue.bai_tap.dao_nguoc_mangstack;

//import java.util.Stack;

import java.lang.reflect.Array;

public class MyStack {
    public int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public  void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full!!!");
        }
        arr[index] = element;
        index++;
    }
    public boolean isFull(){
        if (index == size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index == 0){
            return true;
        }
        return false;
    }
    public int isLength(){
        return index;
    }
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null!!!");
        }
        return arr[--index];
    }
    public static void main(String[] args) throws Exception {

        MyStack stack = new MyStack(5);
        MyStack stack1 = new MyStack(5);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (int i = 0;i<stack.isLength();i++){
            System.out.println(stack.arr[i]);
        }
        System.out.println("--------");
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        stack1.push(stack.pop());
        for (int i = 0; i < stack1.isLength(); i++) {
            System.out.println(stack1.arr[i]);
        }
    }
}
