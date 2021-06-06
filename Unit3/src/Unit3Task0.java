import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(20);
            System.out.print(arr[i] + " ");
        }

    }
}
