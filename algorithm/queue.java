
import java.util.Scanner;

public class Test {
    public static final int QUEUE_SIZE = 5;
    private int mQueue[];
    private int front = 0;
    private int rear = 0;
    private int mQueueSize = 0;

    public void init() {
        mQueue = new int[QUEUE_SIZE];
    }

    public void enQueue(int value) {
        if(mQueueSize == QUEUE_SIZE) {
            System.out.println("full");
        }
        else {
            mQueue[rear++] = value;
            mQueueSize++;
        }
    }

    public int deQueue() {
        int value = 0;
        if(front == rear) {
            System.out.println("empty");
            value = 0;
        }
        else {
            mQueueSize--;
            value = mQueue[front++] = 0;
        }
        return value;
    }

    public void showValues() {
        for(int i=front; i<rear; i++) {
            System.out.println(mQueue[i]);
        }
    }

    public static void main(String[] argc) {
        Test test = new Test();
        test.init();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input Type");
            System.out.println("1 : insert");
            System.out.println("2 : delete");
            System.out.println("3 : show");
            int type = scanner.nextInt();
            if(type == 1) {
                int input = scanner.nextInt();
                test.enQueue(input);
            }
            else if(type == 2) {
                int value = test.deQueue();
                System.out.println(value);
            }
            else if(type == 3) {
                test.showValues();
            }
        }
    }
}
