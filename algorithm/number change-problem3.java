//problem 3
public class Main { 
    public static void main(String[] argc) {
        int arr[];
        int outArr[];
        int input = 0;
        int left = 0;
        int right = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        arr = new int[input];
        outArr = new int[input];
        right = (left+input)/2;
        for(int cnt=0; cnt<input; cnt++) {
            arr[cnt] = scanner.nextInt();
        }

        while(count < input) {
            outArr[count++] = arr[left++];
            outArr[count++] = arr[right++];
        }
        for(int cnt=0; cnt<input; cnt++) {
            System.out.print(outArr[cnt]);
            if(cnt != input-1)
                System.out.print(" ");
        }
    }
}
