
import java.util.Scanner;

public class Test {
    private int mStack[];
    private int top = -1;
    public void init(int value) {
        mStack = new int[value];
    }
    public void pop() {
        mStack[top--] = 0;
    }
    public void push(int value) {
        mStack[++top] = value;
    }
    public int peek() {
        return mStack[top--];
    }
    public static void main(String[] argc) {
        Test test = new Test();
        test.init(5);
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            int value = scanner.nextInt();
            test.push(value);
        }
        for(int i=0; i<5; i++) {
            System.out.println(test.peek());
        }
    }
}
