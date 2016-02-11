import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by janghuijeong on 2016. 2. 11..
 */
public class myCode {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        int inputCnt = Integer.parseInt(inputLine);
        for(int cnt=0; cnt<inputCnt; cnt++) {
            inputLine = br.readLine();
            String[] result = inputLine.split(" ");
            for(int innerCnt=0; innerCnt<result.length; innerCnt++) {
                int length = result[innerCnt].length()-1;
                for(int outCnt = length; outCnt >= 0; outCnt--) {
                    System.out.print(result[innerCnt].charAt(outCnt));
                }
                if(innerCnt < result.length-1)
                    System.out.print(" ");
            }
            if(cnt < inputCnt-1)
                System.out.print("\n");
        }
    }
}