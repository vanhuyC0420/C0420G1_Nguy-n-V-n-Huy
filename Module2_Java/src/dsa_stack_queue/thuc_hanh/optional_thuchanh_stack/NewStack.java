package dsa_stack_queue.thuc_hanh.optional_thuchanh_stack;

public class NewStack {
    private String arr[];
    private int size;
    private int index = 0;

    public NewStack(int size) {
        this.size = size;
        arr = new String[size];
    }

    public int Size(){
        return index;
    }

    public boolean isFull(){
        if (index == size)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if (index == 0)
            return true;
        return false;
    }

    public String pop() throws Exception{
        if (isEmpty())
            throw new StackOverflowError("Stack is full.");
        return arr[--index];
    }

    public void push(String element){
        if (isFull()){
            throw new StackOverflowError("Stack is full!!!");
        }
        arr[index] = element;
        index++;
    }
//    public String toString(){
//        return arr[size];
//    }

    public static void main(String[] args) {
        NewStack stack = new NewStack(5);
        stack.push("One");
        stack.push("two");
        stack.push("three");

    }
}
