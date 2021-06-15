import org.w3c.dom.ls.LSOutput;

public class LightTranport extends LandTransport{
    String bodytype;
    int numbersofpassengers;

    LightTranport(int weight, int maxspeed, Models model, int numberofwheels, double fuelconsumption,
                  String bodytype, int numbersofpassengers) {
        super(weight, maxspeed, model, numberofwheels, fuelconsumption);
        this.bodytype = bodytype;
        this.numbersofpassengers = numbersofpassengers;
    }

    @Override
    double converterToKw(double horsepower) {
        return super.converterToKw(horsepower);
    }

    @Override
    void getInformation() {
        super.getInformation();
        System.out.println("Body type: " + bodytype);
        System.out.println("Number of passengers: " + numbersofpassengers);
        System.out.println("Number of wheel: " + numberofwheels);
        System.out.println("Fuel consumption: " + fuelconsumption);
    }

    private void getMaxDistance(int time){
        double distance = time*maxspeed;
        double fuel = fuelconsumption*distance;
        System.out.println("За время " + time + "ч., автомобиль " + model + " двигаясь с максимальной скоростью" +
                 maxspeed + "км.ч проедет " + distance + "км. и израсходует " + fuel + " литров топлива.");
    }

}
