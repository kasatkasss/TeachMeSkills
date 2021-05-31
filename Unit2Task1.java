public class Unit2Task1 {
    public static void main(String[] args) {
        double dayWay = 10;

        double finish = 0;
        for(int i = 1; i <= 7; i ++){

            finish = finish + dayWay;
            dayWay = dayWay * 1.1;

        }
        System.out.println(finish);
    }
}
