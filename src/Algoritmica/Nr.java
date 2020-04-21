package Algoritmica;

public class Nr {
    public static void main(String[] args) {
        String letter[] = new String[10];
        letter[0] = "a";
        letter[1] = "a";
        letter[2] = "a";
        letter[3] = "b";
        letter[4] = "c";
        letter[5] = "c";
        letter[6] = "d";
        letter[7] = "d";
        letter[8] = "a";
        letter[9] = "b";
//        letter[10] = "b";
//        letter[11]="b";
//        letter[12]="b";

        for (int i = 0; i < letter.length; i++) {
            int count = 1;
            while (i < letter.length - 1 && letter[i].equals(letter[i + 1])) {
                count++;
                i++;
            }
            System.out.print(letter[i]+count);
        }
    }
}

