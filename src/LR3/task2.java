package LR3;

public class task2 {
    public void vuvid() {
        int h = 0;

        for (int min = 0; min < 61; min++){
            if (min == 60) {
                min = 0;
                h += 1;
            }
            System.out.println(h + "h " + min + "min");
            if (h == 2 && min == 59) {
                break;
            }
        }
    }
}