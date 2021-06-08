public class Unit3Task1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i <=20; i +=2){
            count++;
        }
        System.out.println(count);
        int arr[] = new int[count];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i*2+2;
            if(arr[i] == 0){
                arr[i] = 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
