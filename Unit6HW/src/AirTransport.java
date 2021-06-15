public class AirTransport extends Transport{
    int wingspan;
    int minrunwaylength;

    AirTransport(int weight, int maxspeed, Models model, int wingspan, int minrunwaylength) {
        super(weight, maxspeed, model);
        this.minrunwaylength = minrunwaylength;
        this.wingspan = wingspan;
    }
}
