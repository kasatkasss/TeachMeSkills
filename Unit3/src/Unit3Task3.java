import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(99);
            if(array[i]%2 == 0){
                count++;
            }
        }
        System.out.println("Количество четных чисел в массиве равно: " + count);
    }
}
