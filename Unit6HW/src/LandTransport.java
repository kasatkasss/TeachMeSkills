public class LandTransport extends Transport{
    int numberofwheels;
    double fuelconsumption;

    LandTransport(int weight, int maxspeed, Models model, int numberofwheels, double fuelconsumption) {
        super(weight, maxspeed, model);
        this.numberofwheels = numberofwheels;
        this.fuelconsumption = fuelconsumption;

    }

}
