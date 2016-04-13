/**
 * Created by janghuijeong on 2016. 1. 14..
 */
public class Test {
  //abcd
    int arr[] = {1, 2, 9, 5, 7, 3};

    public static void main(String[] arg) {
        Test m = new Test();
        m.bublle();
    }

    void bublle() {
        int temp = 0;
        System.out.println("Before");

        for(int cnt=0; cnt<6; cnt++) {
            System.out.print(arr[cnt]);
        }

        System.out.println();

        for(int i=0; i<6; i++) {
            for(int j=0;j<(6-i)-1; j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After");
        for(int cnt=0; cnt<6; cnt++) {
            System.out.print(arr[cnt]);
        }
    }
}
