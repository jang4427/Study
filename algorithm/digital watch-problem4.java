//problem 4
public class Main { 
    public static void main(String[] argc) {
        int minute = 60;
        int hour = 24;
        int minuteCount = 0;
        int hourCount = 0;
        int res = 0;
        for(int i=1; i<=minute; i++) {
            if(String.valueOf(i).contains("3")) {
                minuteCount++;
            }
        }
        for(int i=1; i<=hour; i++) {
            if(String.valueOf(i).contains("3")) {
                hourCount++;
            }
        }
        //1분에 15번이니까 x 60에 시간이 3시간동안 되니까 24말고 21곱함
        //시간이 갈땐 초를 안재도 되니까
        res = minuteCount * minute * 21 + 3600 * hourCount;
        System.out.println(res);
    }
}
