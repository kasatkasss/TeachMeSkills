import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[]{1, 2, 3, 5};
        for(int i = 0; i < arr.length; i++){
            //arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i] > arr[i-1]){
                count++;
            }    //зашел в тупик, решение неправильное.
        }
        System.out.println(count);
    }
}
