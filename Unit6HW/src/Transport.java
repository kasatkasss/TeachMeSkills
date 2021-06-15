public class Transport {
    enum Models{
        BMW,
        Mercedes,
        Scania,
        DAF,
        Boeing,
        Airbus,
        SU56,
        IL76
    }

    double horsepower;
    int weight;
    int maxspeed;
    Models model;

    double converterToKw(double horsepower){
        return horsepower*0.74;
    }

    void getInformation(){
        System.out.println("Weight: " + weight);
        System.out.println("Max speed: " + maxspeed);
        System.out.println("Model: " + model);
    }

    Transport(int weight, int maxspeed, Models model){
        this.model = model;
        this.maxspeed = maxspeed;
        this.weight = weight;
    }
}
