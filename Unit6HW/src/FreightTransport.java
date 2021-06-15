public class FreightTransport extends LandTransport{
    int liftingcapacity;

    FreightTransport(int weight, int maxspeed, Models model, int numberofwheels, double fuelconsumption,
                     int liftingcapacity) {
        super(weight, maxspeed, model, numberofwheels, fuelconsumption);
        this.liftingcapacity = liftingcapacity;
    }

    @Override
    double converterToKw(double horsepower) {
        return super.converterToKw(horsepower);
    }

    @Override
    void getInformation() {
        super.getInformation();
        System.out.println("Lifting capacity:" + liftingcapacity);
        System.out.println("Number of wheels: " + numberofwheels);
        System.out.println("Fuel consumption: " + fuelconsumption);
    }
    private void weightControl(int gruz){
        if(weight + gruz <= liftingcapacity){
            System.out.println("Грузовик загружен.");
        }
        else{
            System.out.println("Вам нужен грузовик побольше.");
        }
    }
}
