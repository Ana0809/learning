package week9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WordProcessor {

    int countString() {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        System.out.println("Number of words of the string " + words.length);
        return words.length;
    }

    void countWordsFromFile(String path) throws FileNotFoundException {
        File file = new File(path);//"holiday.txt"
        ArrayList<String> fileList = new ArrayList<>();
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            fileList.add(in.nextLine());
        }
        System.out.println(fileList.size());
        String[] words = null;
        int count = 0;
        for (int i = 0; i < fileList.size(); i++) {
            words = fileList.get(i).split("\\s+");
            count += words.length;
        }
        System.out.println("Number of words of the file " + count);

    }

    void wordWrap(String path) throws IOException {
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;

        while ((line = reader.readLine()) != null) {
            while (line.length() >= 60) {
                System.out.println(line.substring(0, 60)); //rezultat 60
                line = line.substring(60); //retine restul de caractere de la 60
            }
            System.out.println(line);
            // System.out.println(line.length());
        }
    }

    void wordWrap2(String path, String path2) throws IOException {
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        FileWriter writer = new FileWriter(path2);
        BufferedWriter bw = new BufferedWriter(writer);
        String line;
        int max = 60;
        try {
            while ((line = reader.readLine()) != null) {//limita sa fie cea mai lunga linie din text
                while (line.length() > max) {
                    String a = " ";
                    a = line.substring(0, max);//rezultat 60
                    System.out.println(a);
                    bw.write(a + "\n");
                    line = line.substring(max); //retine restul de caractere de la 60
                }
                System.out.println(line);
                bw.write(line + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }

        }

    }

    void wordWrap3(String path, String path2) throws IOException {
        File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        FileWriter writer = new FileWriter(path2);
        BufferedWriter bw = new BufferedWriter(writer);
        String line;
        int max=60;
        try {
            while ((line = reader.readLine()) != null) {
                while (line.length() >= max) {
                    if (line.charAt(max) == ' ') {
                        System.out.println(line.substring(0, max));
                        line = line.substring(max+1);
                    } else {
                        int index = line.substring(0, max).lastIndexOf(" ");
                        System.out.println(line.substring(0, index));
                        line = line.substring(index + 1);
                    }
                }
                System.out.println(line);
                bw.write(line);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }

        }

    }

    String bonusMethod(int n, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(writer);
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz" + " " + " ";

        StringBuilder sb = new StringBuilder(n);
        try {
            for (int i = 0; i < n; i++) {
                int index = (int) (AlphaNumericString.length() * Math.random());

                sb.append(AlphaNumericString.charAt(index));
            }
            bw.write(String.valueOf(sb));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
            return sb.toString();
        }
    }
}


