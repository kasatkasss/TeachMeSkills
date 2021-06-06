import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(i != 0 && i%2 != 0) {
                array[i] = 0;
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }
}
