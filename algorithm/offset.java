import java.util.Scanner;

/**
 * Created by janghuijeong on 2016. 3. 4..
 */

public class Main {
    public int arr[][] = new int[7][7];
    public String outArr[][] = new String[7][7];
    public void input() {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                arr[i][j] = 10;
            }
        }
        for(int i=1; i<6; i++) {
            for(int j=1; j<6; j++) {
                arr[i][j] = scanner.nextInt();
                outArr[i][j] = String.valueOf(arr[i][j]);
            }
        }
    }
    public void draw() {
        for(int i=1; i<6; i++) {
            for(int j=1; j<6; j++) {
                int cur = arr[i][j];
                int leftValue = arr[i-1][j];
                int rightValue = arr[i][j-1];
                int topValue = arr[i][j+1];
                int bottomValue = arr[i+1][j];
                boolean leftCheck = cur < leftValue;
                boolean rightCheck = cur < rightValue;
                boolean topCheck = cur < topValue;
                boolean bottomCheck = cur < bottomValue;
                if(leftCheck && rightCheck && topCheck && bottomCheck) {
                    outArr[i][j] = "*";
                }
            }
        }
        for(int i=1; i<6; i++) {
            for(int j=1; j<6; j++) {
                System.out.print(outArr[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] argc) {
        Main main = new Main();
        main.input();
        main.draw();
    }
}
