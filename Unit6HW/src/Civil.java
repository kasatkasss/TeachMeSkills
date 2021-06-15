public class Civil extends AirTransport{
    int numberofpassengers;
    boolean business;

    Civil(int weight, int maxspeed, Models model, int wingspan, int minrunwaylength,
          int numberofpassengers, boolean business) {
        super(weight, maxspeed, model, wingspan, minrunwaylength);
        this.business = business;
        this.numberofpassengers = numberofpassengers;
    }

    @Override
    void getInformation() {
        super.getInformation();
        System.out.println(numberofpassengers);
        System.out.println(business);
        System.out.println(wingspan);
        System.out.println(minrunwaylength);
    }

    @Override
    double converterToKw(double horsepower) {
        return super.converterToKw(horsepower);
    }
    private void passengerCapacity(int passengers){
        if(numberofpassengers<= passengers){
            System.out.println("Можем взлетать.");
        }
        else{
            System.out.println("Вам нужен самолет побольше.");
        }
    }
}
