//problem 2
public class Main {
    public static void main(String[] argc) {
        String arr[][];
        String outArr[][];
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col = scanner.nextInt();
        arr = new String[row+2][col+2];
        outArr = new String[row+2][col+2];


        for(int rowCnt=0; rowCnt<=row+1; rowCnt++) {
            for(int colCnt=0; colCnt<=col+1; colCnt++) {
                arr[rowCnt][colCnt] = "0";
            }
        }

        for(int rowCnt=1; rowCnt<=row; rowCnt++) {
            for(int colCnt=1; colCnt<=col; colCnt++) {
                arr[rowCnt][colCnt] = scanner.next();
            }
        }

        for(int rowCnt=1; rowCnt<=row; rowCnt++) {
            for(int colCnt=1; colCnt<=col; colCnt++) {
                if(arr[rowCnt][colCnt].equals("*")) {
                    outArr[rowCnt][colCnt] = "*";
                }
                else {
                    int outCount = 0;
                    if(arr[rowCnt-1][colCnt-1].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt-1][colCnt].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt-1][colCnt+1].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt][colCnt-1].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt][colCnt].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt][colCnt+1].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt+1][colCnt-1].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt+1][colCnt].equals("*")) {
                        outCount++;
                    }
                    if(arr[rowCnt+1][colCnt+1].equals("*")) {
                        outCount++;
                    }
                    outArr[rowCnt][colCnt] = String.valueOf(outCount);
                }
            }
        }

        for(int rowCnt=1; rowCnt<=row; rowCnt++) {
            for (int colCnt = 1; colCnt <= col; colCnt++) {
                System.out.print(outArr[rowCnt][colCnt]);
            }
            System.out.println();
        }
    }
}