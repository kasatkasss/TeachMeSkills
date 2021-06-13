public class Unit5HW {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.getProcessor();
        computer.getRam();
        computer.getStorage();
        computer.turnOn();
        computer.turnOff();
        computer.turnOn();
        computer.turnOn();
        computer.turnOff();
        computer.turnOff();
        computer.turnOn();
        computer.turnOn();
        computer.turnOff();
        computer.turnOn();
    }
    static class Computer{
        String storage = "SSD Samsung EVO 860 500gb";
        String procesor = "Intel i7";
        String ram = "Crucial DDR4 2x16gb";
        int resource = 3;
        boolean turnoncomp = false;
        boolean turnoffcomp = true;
        boolean comprip = false;
        void getStorage(){
            System.out.println(storage);
        }
        void getProcessor(){
            System.out.println(procesor);
        }
        void getRam(){
            System.out.println(ram);
        }
        void turnOn(){
            if(resource > 0 ){
                System.out.println("У вас осталось " + resource + " попытки включить компьютер.");
            }
            else if(turnoncomp == false){
                System.out.println("Ресур включения компьютера истек, купите новый компьютер всего за $1999, с любовью, Apple.");
                System.out.println("и колёсики к нему за $399.");
                comprip = true;
            }
            if (turnoffcomp == true && comprip == false){
                System.out.println("Компьютер включается...*музыка из windows xp*");
                resource--;
                turnoncomp = true;
            }
            else if (turnoncomp == true && comprip == false){
                System.out.println("Компьютер уже включен, подергайте мышкой или включите монитор.");
            }

            turnoffcomp = false;
        }
        void turnOff(){
            if(turnoncomp == true && turnoffcomp == false){
                System.out.println("Компьютер выключается...");
                turnoffcomp = true;
                turnoncomp = false;
            }
            else{
                System.out.println("Компьютер уже выключен.");
            }
        }
    }
}
