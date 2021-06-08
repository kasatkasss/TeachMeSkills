import java.text.DecimalFormat;
import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        double arr[] = new double[10];
        double arr1[] = new double[10];
        double arr2[] = new double[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(9);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = random.nextInt(9);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int count = 0;
        DecimalFormat df = new DecimalFormat("#.#");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[i]/arr1[i]; //на ноль делить нельзя )))
            System.out.print(df.format(arr2[i]) + " ");
            if(arr2[i]%1 == 0){
                count++;
            }
        }
        System.out.println();
        System.out.println("Целых числе в третьем массиве: " + count);
    }
}
