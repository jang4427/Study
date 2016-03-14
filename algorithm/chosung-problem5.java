//problem 5
public class Main {
    final static char[] ChoSung   = { 0x3131, 0x3132, 0x3134, 0x3137, 0x3138, 0x3139, 0x3141, 0x3142, 0x3143, 0x3145, 0x3146, 0x3147, 0x3148, 0x3149, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e };
    public static void main(String[] argc) {
        Scanner scanner = new Scanner(System.in);
        final int size = 19;
        String input = scanner.next();
        boolean isChoSung = false;
        for(int i=0; i<input.length(); i++) {
            for(int j=0; j<size; j++) {
                if(input.charAt(i) == ChoSung[j]) {
                    isChoSung = true;
                    break;
                }
                else
                    isChoSung = false;
            }
        }
        if(isChoSung) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}