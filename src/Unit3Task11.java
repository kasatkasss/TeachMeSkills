public class Unit3Task11 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 6, 8, 9, 20};
        int multiply = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%3 == 0){
                multiply = arr[i]* multiply;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if(multiply ==1){
            System.out.println("Чисел кратных 3 в массиве нет");
        }
        else {
            System.out.println("Сумма чисел в массиве крантых трем равна: " + multiply);
        }

    }
}
