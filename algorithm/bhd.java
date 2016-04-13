import java.util.Scanner;
public class Main {
  //1234
    public static void main(String[] argc) {
        long count = 0;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        input = scanner.nextInt();
        long arr[] = new long[input];
        for(int i=0; i<input; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<input; i++) {
            for(int j=i+1; j<input; j++) {
                if(arr[i] > arr[j]) {
                    count++;
                }
                else
                    break;
            }
        }
        System.out.println(count);
    }
}
