public class Unit2Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        for(int i = 0; i <= 8; i++){
            sum += number;
            number *= 2;
        }
        System.out.println(sum);
    }
}
