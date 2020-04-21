package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int v[] = {9,0,15,2,45,67,12};
        boolean ordonat = false;
        int ultimaInterschimbare=0;
        int ultim=v.length;
        while (!ordonat) {
            ordonat = true;
            for (int i = 1; i < ultim; i++) {
                if (v[i] < v[i - 1]) {
                    int aux = v[i - 1];
                    v[i - 1] = v[i];
                    v[i] = aux;
                    ordonat = false;
                    ultimaInterschimbare=i;
                    System.out.println(ultimaInterschimbare+"guhiojo");
                }
            }
            ultim=ultimaInterschimbare;

        }

            for (int i = 0; i < v.length; i++) {
                System.out.println(v[i]);
            }
        }
    }
