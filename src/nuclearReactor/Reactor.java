package nuclearReactor;

import java.util.Random;

public class Reactor {
    int throughput=0;
    int criticPoint;

    Reactor(int criticPoint) {
       this.criticPoint=criticPoint;
    }

    int methodThroughput() {
        return throughput;
    }

    void increaseThroughput() {
        if (critical()) {
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
    }

    void decreaseThroughput() {
        Random r = new Random();
        int low = 1;
        int high = 100;
        throughput = throughput - r.nextInt(high - low) + low;
    }

    boolean critical() {
        if (throughput >= criticPoint) {
            System.out.println("is critical");
            return true;
        } else return false;
    }
}
