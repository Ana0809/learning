package nuclearReactor;

public class PlantController {
    PowerPlant powerPlant;
    Reactor reactor;

    PlantController(PowerPlant powerPlant, Reactor reactor) {
        this.powerPlant = powerPlant;
        this.reactor = reactor;
    }

    boolean adjustmentMethod(int units ) {
        if (powerPlant.output - reactor.throughput < units) {
            return false;
        } else return true;
    }

    void adjustThroughput(int units) {
        while (reactor.throughput > units) {
            reactor.decreaseThroughput();
            if (reactor.throughput < 0) {
                break;
            }
            System.out.println(reactor.throughput);
        }
    }

    void shutdownMethod() {
        while (reactor.throughput > 0) {
            reactor.decreaseThroughput();
            if (reactor.throughput < 0) {
                break;
            }

        }
        System.out.println("until the throughput is 0 " + reactor.throughput);
    }

    void runSysteMethod() {
        if (reactor.throughput > powerPlant.output) {
            adjustThroughput(10);
            System.out.println("test");
    }
        if (reactor.critical(powerPlant.output)) {
            powerPlant.alarm();
        }
    }
}
