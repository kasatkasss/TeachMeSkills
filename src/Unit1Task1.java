public class Unit1Task1 {
    public static void main(String[] args) {
        int a = -23;
        if(a > 0) {
            if (a > 0 && a < 10) {
                System.out.println("Это однозначное положительное число");
            } else if (a >= 10 && a < 100) {
                System.out.println("Это двузначное положительное число");
            } else if (a >= 100) {
                System.out.println("Это трехзначное или более положительное число");
            }
        }
        else if(a < 0){
            if(a < 0 && a > -10){
                System.out.println("Это однозначное отрицательное число");
            }
            else if(a <= -10 && a > -100){
                System.out.println("Это двузначное отрицательное число");
            }
            else if(a <= -100){
                System.out.println("Это трехзначное или более отрицательное число");
            }
        }
        else if(a == 0){
            System.out.println("Вы ввели 0");
        }
    }
}
