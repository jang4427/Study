import java.util.Scanner;

/**
 * Created by janghuijeong on 2016. 1. 14..
 */
public class Test {
    public static void main(String[] arg) {
        Test m = new Test();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int res = m.fibo2(input);
        System.out.println(res);
    }

    int fibo1(int value) {
        if(value <= 1)
            return value;
        else
            return fibo1(value-1) + fibo1(value-2);
    }

    int fibo2(int value) {
        int left = 0;
        int right = 1;
        int res = 0;
        for(int i=1; i<value; i++) {
            res = left + right;
            left = right;
            right = res;
        }
        return right;
    }
}