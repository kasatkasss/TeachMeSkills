import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        int multiply1 = 1;
        int multiply2 = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            int j = i;
            multiply1 *= arr[i][j];
        }
        System.out.println("Произведение чисел главной диагонали: " + multiply1);
        for(int i = 0; i < n; i++){
            int j = n-1-i;
            multiply2 *= arr[i][j];
        }
        System.out.println("Произведение чисел побочной диагонали: " + multiply2);
        if(multiply1 > multiply2){
            System.out.println("Произведение чисел главной диагонали больше.");
        }
        else if(multiply2 > multiply1){
            System.out.println("Произведение чисел побочной диагонали больше.");
        }
        else{
            System.out.println("Произведение чисел главной и побочной диагоналей равны.");
        }
    }
}
