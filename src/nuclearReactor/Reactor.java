package nuclearReactor;

import java.util.Random;

public class Reactor {
    int throughput;
    PowerPlant powerPlant;

    Reactor(int throughput) {
        this.throughput = throughput;
    }

    int methodThroughput() {
        return throughput;
    }

    int increaseThroughput() {

        if (critical(powerPlant.output)) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("the reactor is going critical");
            }
        } else {
            Random r = new Random();
            int low = 1;
            int high = 100;
            throughput = r.nextInt(high - low) + low + throughput;
        }
        return throughput;
    }

    int decreaseThroughput() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        throughput = throughput - r.nextInt(high - low) + low;
        return throughput;
    }

    boolean critical(int out) {
        if (throughput > out) {
            return false;
        } else return true;
    }
}
