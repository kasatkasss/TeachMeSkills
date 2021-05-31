public class Unit2Task2 {
    public static void main(String[] args) {
        int ameba = 1;
        int time = 0;
        for(int i = 0; i <8; i++){
            time +=3;
            ameba *=2;
            System.out.println("Прошло " + time + " часа, у нас " + ameba + " особей.");
        }
        System.out.println("Итого: " + ameba + " особей.");
    }
}
