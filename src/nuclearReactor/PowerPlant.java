package nuclearReactor;

public class PowerPlant {
    int desireOutput;

    PowerPlant(int output) {
        this.desireOutput = output;
    }

    void alarm(){
        System.out.println("ALAAAAARMMMM");
    }

    int methodOutput(){
        return desireOutput;
    }
}
