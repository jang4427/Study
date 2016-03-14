//problem 1
class Node { 
    public int data;
    public int res;
    public int oprator;
}
public class Main {
    private int arr[];
    private int arraySize;
    private Node[] node;
    private int resIndex[];
    private int resCount = 0;
    private int mAnswer = 0;
    private int mNumberCount = 0;

    void divideString(String aInput) {
        String[] result = aInput.split(" ");
        int count;
        for(count=0; count<result.length; count++) { }
        mNumberCount = count-1;
        mAnswer = Integer.parseInt(result[mNumberCount]);
        String lastValue[] = result[mNumberCount-1].split(",");
        arr = new int[mNumberCount];
        for(int i=0; i<mNumberCount-1; i++) {
            arr[i] = Integer.parseInt(result[i]);
        }
        arr[mNumberCount-1] = Integer.parseInt(lastValue[0]);
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        divideString(input);

        arraySize = (int)Math.pow(2,mNumberCount);
        node = new Node[arraySize];
        resIndex = new int[mNumberCount-1];
        for(int i=0; i<arraySize; i++) {
            node[i] = new Node();
        }
        int count = 1;
        for(int i=0; i<mNumberCount; i++) {
            double pow = Math.pow(2, i);
            for(int j=0; j<pow; j++) {
                node[count++].data = arr[i];
            }
        }
    }
    void printValues() {
        int resCnt = mNumberCount-2;
        for(int i=0; i<mNumberCount; i++) {
            System.out.print(arr[i]);
            if(resCnt >= 0) {
                if(resIndex[resCnt] == 1) {
                    System.out.print(" + ");
                } else if(resIndex[resCnt] == 2) {
                    System.out.print(" - ");
                }
                resCnt--;
            }
        }
        System.out.print(" = "+mAnswer);
    }
    void calculate(int value, int before) {
        if (value > 0 && value < arraySize) {
            if(value % 2 == 0 || before == 0) {
                node[value].res = before + node[value].data;
                node[value].oprator = 1;
            }
            else if(value % 2 != 0 || before == 0) {
                node[value].res = before - node[value].data;
                node[value].oprator = 2;
            }
            if(node[value].res == mAnswer) {
                int temp = value;
                while(temp > 1) {
                    resIndex[resCount++] = node[temp].oprator;
                    temp = temp/2;
                }
            }
            calculate(2*value, node[value].res);
            calculate(2*value+1, node[value].res);
        }
    }

    public static void main(String[] argc) {
        Main main = new Main();
        main.input();
        main.calculate(1, 0);
        main.printValues();
    }
}