package LR4;

public class task3 {
    public void vuvid() {
        int[] arr = new int[] {2,17,13,6,22,31,45,66,100,18};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сума всіх елементів масиву: " + sum);
    }
}