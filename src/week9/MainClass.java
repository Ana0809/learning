package week9;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        WordProcessor wordProcessor=new WordProcessor();
//        System.out.println("Input your string");
//        wordProcessor.countString();
      //  wordProcessor.countWordsFromFile("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\aa.txt ");
   //     wordProcessor.wordWrap("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\aa.txt");
       // wordProcessor.wordWrap2("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\aa.txt","C:\\\\Users\\\\JohnSmith\\\\Documents\\\\bb.txt");
      wordProcessor.wordWrap3("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\aa.txt","C:\\\\Users\\\\JohnSmith\\\\Documents\\\\cc.txt");
        System.out.println(wordProcessor.bonusMethod(1000,"C:\\\\Users\\\\JohnSmith\\\\Documents\\\\cc.txt"));
    }
}
