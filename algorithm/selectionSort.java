public class Test {

    int arr[] = {1, 2, 9, 5, 7, 3};

    public static void main(String[] arg) {
        Test m = new Test();
        m.selectionSort();
    }

    void selectionSort() {
        int temp = 0;
        int minIdx = 0;
        System.out.println("Before");

        for(int cnt=0; cnt<6; cnt++) {
            System.out.print(arr[cnt]);
        }

        System.out.println();

        //최소값을 찾아 순차적으로 값을 넣어 준다.
        for(int i=0; i<6-1; i++) {
            minIdx = i;
            for(int j=i; j<6; j++) {
                if(arr[minIdx] < arr[j]) {
                    minIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println("After");
        for(int cnt=0; cnt<6; cnt++) {
            System.out.print(arr[cnt]);
        }
    }
}
