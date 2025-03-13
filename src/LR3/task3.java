package LR3;

public class task3 {
    public void vuvid() {
        int min = 0;
        int h = 0;

        while(h < 3) {
            System.out.println(h + "h " + min + "min");
            if(h == 2 && min == 59) {
                break;
            }
            min += 1;
            if(min == 60) {
                h += 1;
                min = 0;
            }
        }
    }
}