package dsa_stack_queue.bai_tap.dao_nguoc_mangstack;

import java.io.IOException;
//import java.util.Scanner;

public class StringStack {
    private String input;
    private String output;
    public StringStack(String in) {
        input = in;
    }
    public String doReverser() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
    public static void main(String[] args)
            throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine().toString();
        String input = "CodeGym";
        String output;
        StringStack str = new StringStack(input);
        output = str.doReverser();
        System.out.println("Reversed: " + output);
    }
    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
