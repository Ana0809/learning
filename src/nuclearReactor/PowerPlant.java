package nuclearReactor;

public class PowerPlant {
    int output;

    PowerPlant(int output) {
        this.output = output;
    }

    void alarm(){
        System.out.println("ALAAAAARMMMM");
    }

    int methodOutput(){
        return output;
    }
}
