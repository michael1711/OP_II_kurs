package LR4;

public class task1 {
    public void vuvid() {
        int[] par = new int[50];
        int[] nePar = new int[50];
        int lich = 0;

        for (int i = 0; i < 100; i++) { //парний
            if (i % 2 == 0) {
                par[lich] = i;
                lich += 1;
            }
        }
        lich = 0;
        for (int i = 0; i < 100; i++) { //не парний
            if (i % 2 != 0) {
                nePar[lich] = i;
                lich += 1;
            }
        }

        for (int num : par) {
            System.out.println(num);
        }
        for (int num : nePar) {
            System.out.println(num);
        }
    }
}