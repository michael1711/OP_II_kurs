package LR1;

public class task5 {
    public static int rev(int num) {
        int reversed = 0;
        int length = (int) Math.log10(num) + 1; // довжина  

        for (int i = 0; i < length; i++) {
            int digit = (num / (int)Math.pow(10, i)) % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}