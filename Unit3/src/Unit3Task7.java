import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[12];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                System.out.println("Индекс максимального числа в массиве: " + i);
            }
        }
        System.out.println("Максимальное число в массиве: " + max);

    }
}
