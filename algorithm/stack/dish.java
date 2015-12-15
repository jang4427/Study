import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = null;
        Scanner scan =new Scanner(System.in);
        ArrayList<String> msg = new ArrayList<String>();
        int[] inputValues;
        int[] stack;
        int lastValue = 97;
        int top = -1;
        input = scan.nextLine();
        int length = input.length();
        boolean isValid = true;

        stack = new int[length];
        inputValues = new int[length];

        for(int cnt=0; cnt<length; cnt++) {
            inputValues[cnt] = input.charAt(cnt);
        }

        for(int cnt=0; cnt<length; cnt++) {
            if(top == -1) {
                for(int innerCnt=lastValue; innerCnt<=inputValues[cnt]; innerCnt++) {
                    stack[++top] = innerCnt;
                    lastValue++;
                    msg.add("push");
                }
            }
            else if(inputValues[cnt]>stack[top]) {
                stack[++top] = inputValues[cnt];
                lastValue++;
                msg.add("push");
            }
            if(stack[top] == inputValues[cnt]) {
                stack[top]=0;
                top--;
                msg.add("pop");
            }
            else {
                System.out.println("impossible");
                isValid = false;
                break;
            }
        }
        if(isValid) {
            for(int cnt=0; cnt<msg.size(); cnt++)
                System.out.println(msg.get(cnt).toString());
        }
    }
}