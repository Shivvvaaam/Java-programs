package stack;

public class Stack1 {
    int[] stack = new int[5];
        int top = 0;
    public void push(int data) {
        
        stack[top] = data;
        top++;
    }

    public int pop(){
        top--;
        int data;
        data = stack[top];
        stack[top] = 0;
        return data;

    }
    public void show() {
        for(int n : stack){
            System.out.print(n+" ");
        }
        System.out.println();

    }
    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(5);
        s.push(10);
        s.push(13);
        s.show();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.show();

    }
}
