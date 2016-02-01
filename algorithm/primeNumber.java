import java.util.Scanner;

public class Test {
    public static void main(String[] argc) {
        int input = 0;
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            input = scanner.nextInt();
            boolean res = test.isPrimeNumber(input);
            if(res == true)
                System.out.println("O");
            else
                System.out.println("X");
        }
    }
    public boolean isPrimeNumber(int value) {
        boolean bRes = true;
        for(int i=value-1; i>1; i--) {
            if(value % i == 0) {
                bRes = false;
                break;
            }
            else {
                bRes = true;
            }
        }
        return bRes;
    }
}