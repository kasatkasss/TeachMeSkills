import java.util.Random;

public class Unit3Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[7];
        int multiply = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(20);
            if(arr[i]%3 == 0){
                multiply = arr[i] * multiply;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if(multiply == 1){
            System.out.println("В массиве чисел кратных 3 нет.");
        }
        else{
            System.out.println("Сумма чисел в массиве кратных 3 равна: " + multiply);
        }
    }
}
