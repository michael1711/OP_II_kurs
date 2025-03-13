package LR4;

public class task2 {
    public void vuvid() {
        int[] arr = new int[] {2,17,13,6,22,31,45,66,100,-18};
        int i = 0;

        System.out.println("перебирання масиву while:");
        while (i < 10) {
            System.out.println(arr[i]);
            i += 1;
        }
        i = 0;

        System.out.println("");

        System.out.println("перебирання масиву for:");
        for(int num : arr) {
            System.out.println(num);
        }

        System.out.println("");

        System.out.println("не парні індекси (while):");
        while (i < 10) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
            i += 1;
        }

        System.out.println("");

        System.out.println("парні індекси (for)");
        for (int a = 0; a < 10; a++) {
            if (a % 2 == 0) {
                System.out.println(arr[a]);
            }
        }

        System.out.println("");

        System.out.println("вивід у звороті:");
        for (int a = 9; a >= 0; a--) {
            System.out.println(arr[a]);
        }
    }
}