package LR3;

public class task1 {
    private final String fraza;

    public task1 (String fraza){
        this.fraza = fraza;
    }

    public void vuvid() {

        for (int i = 0; i <= 50; i++) {
            System.out.println(fraza + " " + i);
        }

        System.out.println("");

        int i = 0;
        while (i < 50) {
            System.out.println(fraza + " " + i);
            i++;
        }
    }
}