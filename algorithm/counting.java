/* package whatever; // don't place package name! */

import java.io.*;
import java.util.Scanner;

class myCode
{
    int[] arr;
    public static void main (String[] args) throws java.lang.Exception
    {
        new myCode().input();
    }
    void input() {
        Scanner scanner = new Scanner(System.in);
        int inputN = scanner.nextInt();
        int inputK = scanner.nextInt();
        arr = new int[inputN];
        for(int cnt=0; cnt<inputN; cnt++) {
            arr[cnt] = scanner.nextInt();
        }
        getResValue(inputK, inputN);
    }
    void getResValue(int aInputK, int length) {
        int temp = 0;
        int minIdx = 0;
        for(int i=0; i<length-1; i++) {
            minIdx = i;
            for(int j=i; j<length; j++) {
                if(arr[minIdx] < arr[j]) {
                    minIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(arr[aInputK-1]);
    }
}