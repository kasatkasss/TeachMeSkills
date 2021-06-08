import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Нечетные элементы под главной диагональю: ");
        for(int i = 1; i < n; i++) {
            int j = i - 1;
            if (arr[i][j] % 2 != 0) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
