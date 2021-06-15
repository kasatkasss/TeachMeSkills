public class Military extends AirTransport{
    int numberofmissiles;
    boolean catapult;

    Military(int weight, int maxspeed, Models model, int wingspan, int minrunwaylength,
             int numberofmissiles, boolean catapult) {
        super(weight, maxspeed, model, wingspan, minrunwaylength);
        this.catapult = catapult;
        this.numberofmissiles = numberofmissiles;
    }

    @Override
    double converterToKw(double horsepower) {
        return super.converterToKw(horsepower);
    }

    @Override
    void getInformation() {
        super.getInformation();
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Min runaway length: " + minrunwaylength);
        System.out.println("Number of missiles: " + numberofmissiles);
        System.out.println("Injection system: " + catapult);
    }
    void shoot(){
        if(numberofmissiles > 0){
            System.out.println("Ракета пошла");
            numberofmissiles--;
        }
        else{
            System.out.println("Боеприпасы отсутствуют.");
        }
    }
    void getCatapult(){
        if (catapult==true){
            System.out.println("Катапультирование прпошло успешно.");
        }
        else{
            System.out.println("У вас нет такой системы.");
        }
    }
}
