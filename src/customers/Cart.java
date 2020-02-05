package customers;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart extends Discount {
    public static ArrayList<Product> productsList = new ArrayList<>();

    double calculateTotalPrice() {
        double suma = 0;
        for (int i = 0; i < productsList.size(); i++) {
            suma = suma + productsList.get(i).getPrice();
        }
        System.out.println("Valoare totala a cosului este: " + suma);
        return suma;
    }

    void PrintTheInovice() {
        double suma = 0;
        double total = 0;
        System.out.println("Produsele sunt: ");
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i).getName());
            suma = suma + productsList.get(i).getPrice();
            total = suma - (0.05 * suma) - 100;
        }
        System.out.println("Pretul final este: " + total);

    }

    void addProduct(Product p) {
        productsList.add(p);
    }

    void listByPrice() {
        for (int i = 0; i < productsList.size(); i++) {
            for (int j = i; j < productsList.size(); j++) {
                if (productsList.get(i).getPrice() > productsList.get(j).getPrice()) {
                    Product pret;
                    pret = productsList.get(i);
                    productsList.set(i, productsList.get(j));
                    productsList.set(j, pret);
                }
            }
        }
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i).getName() + " " + productsList.get(i).getPrice());
        }
    }

    void listByColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu culoarea");
        String culoarea = sc.nextLine();
        boolean b = true;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getColor().equals(culoarea)) {
                System.out.println(productsList.get(i).getName() + " " + productsList.get(i).getColor());
            } else {
                b = false;
            }
    }
        if(b==false){
            System.out.println("Nu exista produse cu aceasta culoare");
        }

}

    void removeProduct() {
        Scanner k = new Scanner(System.in);
        System.out.println("Introdu produsul pe care vrei sa il stergi din cos");
        boolean b = true;
        String nume = k.next();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().equals(nume)) {
                System.out.println("produsul " + productsList.get(i).getName() + " a fost sters");
                productsList.remove(productsList.get(i));
            }else{
                b=false;
            }
        }if(b==false){
            System.out.println("Nu exista produsul");
        }
    }


    void afisareProduse() {
        System.out.println("Produsele din cos sunt:");
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i).getName() + " " + productsList.get(i).getPrice());
        }
    }

    @Override
    public double percentageDiscount() {
        double percentageDiscount = 0.0;
        double suma = 0;
        for (int i = 0; i < productsList.size(); i++) {
            suma = productsList.get(i).getPrice() + suma;
            percentageDiscount = suma - (0.05 * suma);
        }
        System.out.println("Dupa un discount de 5% valoare cosului este: " + percentageDiscount);
        return percentageDiscount;
    }

    @Override
    public double fixedDiscount() {
        double fixedDiscount = 0.0;
        double suma = 0;
        for (int i = 0; i < productsList.size(); i++) {
            suma = productsList.get(i).getPrice() + suma;
            fixedDiscount = suma - 100;
        }
        System.out.println("Dupa un discount de 100 RON valoarea cosului este " + fixedDiscount);
        return fixedDiscount;
    }

}