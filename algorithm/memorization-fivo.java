public class Main {
    int arr[] = new int[1000];
    int fibo(int aValue) {
        if(arr[aValue] != 0)
            return arr[aValue];

        if(aValue <= 1)
            return aValue;
        arr[aValue] = fibo(aValue-1) + fibo(aValue-2);
        return arr[aValue];
    }
    public static void main(String[] argc) {
        Main main = new Main();
        int out = main.fibo(10);
        System.out.println(out);
    }
}