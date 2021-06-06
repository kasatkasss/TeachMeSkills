import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int array1[] = new int[5];
        int array2[] = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(15);
            sum1 = sum1 + array1[i];
        }
        double result1 = sum1/ array1.length;
        for(int i = 0; i < array2.length; i++){
            array2[i] = random.nextInt(15);
            sum2 = sum2 + array2[i];
        }
        double result2 = sum2/ array2.length;
        if(result1 > result2){
            System.out.println("Среднее арифметическое первого массива больше");
        }
        else if(result2 > result1){
            System.out.println("Среднее арифметическое второго массива больше");
        }
        else{
            System.out.println("Средние арифметические массивов равны");
        }
    }
}
