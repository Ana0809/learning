package nuclearReactor;

public class MainReactor {
    public static void main(String[] args) {

        PowerPlant powerPlant = new PowerPlant(120);
        Reactor reactor = new Reactor(150);
        System.out.println("Power Plant output: " + powerPlant.methodOutput());
        System.out.println("The throughput level at which the reactor goes critical " + reactor.methodThroughput());
//        int a = reactor.increaseThroughput();                   //goes critical
//        System.out.println("Increase the throughput with " + a);
        int b = reactor.decreaseThroughput();
        System.out.println("Decrease the throughput with " + b);

        PlantController plantController = new PlantController(powerPlant, reactor);

        if (plantController.adjustmentMethod(10)) {
            System.out.println("Difference larger than 10");
        }else System.out.println("Difference smaller than 10");

        plantController.adjustThroughput(10);
        plantController.shutdownMethod();
        plantController.runSysteMethod();
    }
}
