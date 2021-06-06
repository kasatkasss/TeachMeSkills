public class Unit1Task5 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        int c = -15;
        int countPlus = 0;
        int countMinus = 0;

        if(a > 0)
            countPlus++;
        else if(a < 0)
            countMinus++;
        if(b > 0)
            countPlus++;
        else if(b < 0)
            countMinus++;
        if(c > 0)
            countPlus++;
        else if(c < 0)
            countMinus++;
        System.out.println("Количество положительных чисел: " + countPlus);
        System.out.println("Количество отрицательных чисел: " + countMinus);



    }
}
