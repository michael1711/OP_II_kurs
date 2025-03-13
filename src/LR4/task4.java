package LR4;

public class task4 {
    public void vuvid() {
        int[] arr = new int[] {2,17,13,6,-22,31,45,66,100,18};
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0) {
                arr[i] *= -1;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}