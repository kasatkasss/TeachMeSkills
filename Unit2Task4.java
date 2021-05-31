import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Unit2Task4 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первый множитель: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второй множитель: ");
        int b = Integer.parseInt(reader.readLine());
        int result = 0;
        for(int i = 0; i < a; i++){
            result = result + b;
        }
        System.out.println(result);
    }
}
