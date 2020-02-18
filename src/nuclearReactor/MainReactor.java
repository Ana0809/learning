package nuclearReactor;

public class MainReactor {
    public static void main(String[] args) {

        PowerPlant powerPlant = new PowerPlant(120);
        Reactor reactor = new Reactor(150);
        System.out.println("Power Plant output: " + powerPlant.methodOutput());
        System.out.println("The throughput level at which the reactor goes critical " + reactor.methodThroughput());

        PlantController plantController = new PlantController(powerPlant, reactor);

        plantController.runSysteMethod();
    }
}
