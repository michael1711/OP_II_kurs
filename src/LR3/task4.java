package LR3;

public class task4 {
    public void vuvid() {
        int min = 0;
        int h = 0;

        for (int sec = 0; h < 3; sec++) {
            System.out.println(h + "h " + min + "min " + sec + "sec");
            if (h == 2 && min == 59 && sec == 59) {
                break;
            }
            if (sec == 59) {
                sec = -1; // при наступній ітерації стане 0
                min += 1;
            }
            if (min == 60) {
                min = 0;
                h += 1;
            }
        }
    }
}