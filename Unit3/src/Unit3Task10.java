import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 3: ");
        int n = scanner.nextInt();
        while (n<=3){
            System.out.print("Введите число большее 3: ");
            n = scanner.nextInt();
        }
        Random random = new Random();
        int arr[] = new int[n];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(n);
            if(arr[i] %2 == 0){
                count++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("Количество четных исел в массиве: " + count);
        int arr1[] = new int[count];
        for(int i = 0; i < arr1.length; i++){
            if(arr[i]%2 == 0){
                arr1[i] = arr[i];
            }
            System.out.print(arr1[i] + " ");
        }  //не доделал...
    }
}
