package wikipedia;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wiki {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = null;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        adaugareDinFisier("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiLinks.txt");
        ArrayList<String> fileListReturnat = adaugareDinFisier("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiLinks.txt");
        adaugareTotTextulInAlDoileaFisier(is, arrayList, fileListReturnat);
        ArrayList<String> linkscuurl = scriereInListaDoarURL(arrayList);
        scriereURLinFisier(linkscuurl, "C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiOutput.txt");
        System.out.println(linkscuurl);
        System.out.println(arrayList);

        adaugareDinFisier("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiOutput.txt");
        ArrayList<String> fileListReturnat2 = adaugareDinFisier("C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiOutput.txt");
        adaugareTotTextulInAlDoileaFisier(is, arrayList1, fileListReturnat2);
        ArrayList<String> linkscuurl2 = scriereInListaDoarURL(arrayList1);
        scriereURLinFisier(linkscuurl2, "C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiOutput2.txt");
        System.out.println(linkscuurl2);
        System.out.println("11111111111111111234567"+arrayList1);
    }

    private static ArrayList<String> adaugareDinFisier(String path) throws FileNotFoundException {
        FileReader file = new FileReader(path);//"holiday.txt"
        Scanner in = new Scanner(file);
        ArrayList<String> fileList = new ArrayList<>();
        while (in.hasNextLine()) {
            fileList.add(in.nextLine().trim());
        }
        System.out.println("url citit din fisier" + fileList);
        return fileList;
    }

    private static ArrayList<String> adaugareTotTextulInAlDoileaFisier(InputStream is, ArrayList<String> arrayList, ArrayList<String> fileList) {
        URL url;
        BufferedReader br;
        String line;
        try {
            for (String i : fileList) {  //  pt fiecare url citit din fisier
                url = new URL(i);
                is = url.openStream();  // throws an IOException
                br = new BufferedReader(new InputStreamReader(is));

                while ((line = br.readLine()) != null) {
                    if (line.contains("href=") && line.contains("https"))
                        arrayList.add(line.trim());  //adauga in lista continutul url ului
                }
            }
            System.out.println(arrayList.size() + "primul size");
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                //exception
            }
        }

        return arrayList;
    }

    private static ArrayList<String> scriereInListaDoarURL(ArrayList<String> arrayList) {
        ArrayList links = new ArrayList();

        String regex = "\\(?\\b(http://|www[.])[-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]";
        for (String i : arrayList) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(i);
            while (m.find()) {
                String urlStr = m.group();
                links.add(urlStr);
            }
        }
        System.out.println("yeeeee " + links.size());
        return links;
    }

    private static void scriereURLinFisier(ArrayList<String> arrayL, String path) throws FileNotFoundException {
        PrintWriter pr = new PrintWriter(path);//"C:\\\\Users\\\\JohnSmith\\\\Documents\\\\wikiOutput.txt"
        for (int i = 0; i < arrayL.size(); i++) {
            pr.println((arrayL.get(i)));
        }
        pr.close();
    }
}

