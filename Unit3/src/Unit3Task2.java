public class Unit3Task2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <=99; i+=2){
            count++;
        }
        System.out.println(count);
        int []arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (i*2)+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j]<arr[j+1]){
                    int value = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = value;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
