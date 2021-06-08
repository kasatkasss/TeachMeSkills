import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Unit1Task8 {
    public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите первое число: ");
            int firstNumber = Integer.parseInt(reader.readLine());
            System.out.println("Введите второе число: ");
            int secondNumber = Integer.parseInt(reader.readLine());
            if(firstNumber > secondNumber)
                System.out.println("Большее число " + firstNumber);
            else
                System.out.println("Большее число " + secondNumber);
        }
    }


