public class Unit1Task2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if(((a+b) > c) && ((a + c) > b) && ((b+c) > a))
            System.out.println("Треугольник с такими сторонами существует");
        else
            System.out.println("Треугольника с такими сторонами не существует");

    }
}
