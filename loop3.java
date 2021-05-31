import java.io.BufferedReader;
import java.io.InputStreamReader;

public class loop3 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
