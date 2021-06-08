import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            int j = i;
            if(arr[i][j]%2 == 0){
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма четных числе главной диагонали равна " + sum);
    }
}
