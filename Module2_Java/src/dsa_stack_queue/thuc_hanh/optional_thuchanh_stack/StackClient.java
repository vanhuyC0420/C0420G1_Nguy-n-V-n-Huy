package dsa_stack_queue.thuc_hanh.optional_thuchanh_stack;

public class StackClient {
    public static void main(String[] as) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());
//        System.out.printf("2. Pop elements from stack : ");

//        while (!stack.isEmpty()) {
//            System.out.printf("Pop elements from stack %d: \n", stack.pop());
//            System.out.printf("\n Size of stack after pop operations %d: \n",stack.size());
//        }

//        System.out.printf("\n3. Size of stack after pop operations %d: ",stack.size());
    }
}
