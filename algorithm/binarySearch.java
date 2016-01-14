import java.util.Scanner;

/**
 * Created by janghuijeong on 2016. 1. 14..
 */
public class Test {
    int arr[] = {1, 2, 3, 5, 7, 10};
    int lIndex = 0;
    int rIndex = 5;
    int mid = 0;

    public static void main(String[] arg) {
        Test m = new Test();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        m.search(input);
    }

    void search(int value) {
        while(lIndex<=rIndex) {
            mid = (lIndex+rIndex)/2;
            if(arr[mid] == value) {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid] < value)
                lIndex = mid+1;
            else {
                rIndex = mid-1;
            }
        }
    }
}
