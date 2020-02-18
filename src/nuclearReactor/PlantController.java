package nuclearReactor;

public class PlantController {
    PowerPlant powerPlant;
    Reactor reactor;


    PlantController(PowerPlant powerPlant, Reactor reactor) {
        this.powerPlant = powerPlant;
        this.reactor = reactor;
    }

    boolean adjustmentMethod() {
        if (Math.abs(powerPlant.desireOutput - reactor.throughput) >= 10) {
            return true;
        } else return false;
    }

    void adjustThroughput() {
        while (true) {
            if (powerPlant.desireOutput - reactor.throughput > 10 &&powerPlant.desireOutput - reactor.throughput >0) {
                reactor.increaseThroughput();
                if(powerPlant.desireOutput - reactor.throughput>=0 && powerPlant.desireOutput - reactor.throughput<=10){
                    System.out.println(reactor.throughput);
                    break;
                }
            }else break;

        }
    }

    void shutdownMethod() {
        while (true) {
            reactor.decreaseThroughput();
            if(reactor.throughput==0){
                break;
            }
        }
        System.out.println("until the throughput is 0 " + reactor.throughput);
    }

    void runSysteMethod() {
        if (adjustmentMethod()) {
            System.out.println("Difference larger than 10");
            adjustThroughput();
        }else System.out.println("Difference smaller than 10");

        if (reactor.critical()) {
            powerPlant.alarm();
            shutdownMethod();
        }

    }
}
