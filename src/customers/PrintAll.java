package customers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintAll {
    public void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bine ai venit la magazinul unde tu stabilesti pretul pe care vrei sa il platesti!");
        dateClient();
            while (true) {
                optiuni();
                int optiune = s.nextInt();
                Cart cart = new Cart();
                if (optiune == 1) {
                    boolean b = true;
                    while (b == true) {
                        Scanner k = new Scanner(System.in);
                        System.out.println("alege din produsele noastre introducant id-ul corespunzator:");
                        System.out.println("111:alimente " + "112:electrocasnice " + "113:haine " + "0:ai terminat de adaugat");
                        int id = k.nextInt();
                        try {
                            switch (id) {

                                case 111:
                                    Product p1 = new Product();
                                    p1.setType("alimente");
                                    p1.setId(111);
                                    System.out.println("adaugati in cos alimentul necesar");
                                    Scanner sc = new Scanner(System.in);
                                    String numep = sc.nextLine();
                                    p1.setName(numep);
                                    System.out.println("cat doresti sa platesti pe aliment?");
                                    double pret = k.nextDouble();
                                    p1.setPrice(pret);
                                    cart.addProduct(p1);
                                    break;
                                case 112:
                                    Product p2 = new Product();
                                    p2.setId(112);
                                    p2.setType("electrocasnice");
                                    System.out.println("adaugati electrocasnicul dorit");
                                    Scanner scc = new Scanner(System.in);
                                    String elec = scc.nextLine();
                                    p2.setName(elec);
                                    System.out.println("adaugati culoarea");
                                    String cul = scc.nextLine();
                                    p2.setColor(cul);
                                    System.out.println("cat doresti sa platesti pe electrocasnic?");
                                    double pret2 = k.nextDouble();
                                    p2.setPrice(pret2);
                                    cart.addProduct(p2);
                                    break;
                                case 113:
                                    Product p3 = new Product();
                                    p3.setId(112);
                                    p3.setType("haine");
                                    System.out.println("adaugati haina dorita");
                                    Scanner sccc = new Scanner(System.in);
                                    String haina = sccc.nextLine();
                                    p3.setName(haina);
                                    System.out.println("adaugati culoarea");
                                    String culoarea = sccc.nextLine();
                                    p3.setColor(culoarea);
                                    System.out.println("cat doresti sa platesti pe haina?");
                                    double pret3 = k.nextDouble();
                                    p3.setPrice(pret3);
                                    cart.addProduct(p3);
                                    break;
                                case 0:
                                    System.out.println("S-au daugat produsele in cos");
                                    b = false;
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Date incorecte");
                        }
                    }
                } else if (optiune == 2) {
                    cart.afisareProduse();
                    cart.calculateTotalPrice();
                } else if (optiune == 3) {
                    cart.fixedDiscount();
                    cart.percentageDiscount();
                } else if (optiune == 4) {
                    cart.PrintTheInovice();
                } else if (optiune == 5) {
                    cart.removeProduct();
                } else if (optiune == 6) {
                    cart.listByPrice();
                } else if (optiune == 7) {

                    cart.listByColor();

                }
        }
    }

        private void optiuni() {
        System.out.println("Pentru a adauga produse apasa 1");
        System.out.println("Pentru a vizualiza cosul de cumparaturi apasa 2");
        System.out.println("Pentru a adauga reducerile de black friday apasa 3");
        System.out.println("Pentru a finaliza comanda apasa 4");
        System.out.println("Pentru a sterge un produs apasa 5");
        System.out.println("Pentru a ordona produsele dupa pret apasa 6");
        System.out.println("Pentru a filtra produsele dupa culoare apasati 7");
    }

    private void dateClient() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Introdu numele");
            Customer customer = new Customer();
            String nume = s.nextLine();
            customer.setFirstName(nume);
            System.out.println("Introdu prenumele");
            String prenume = s.nextLine();
            customer.setLastName(prenume);
            System.out.println("Introdu cnp");
            int cnp = s.nextInt();
            customer.setCnp(cnp);
            Address address = new Address();
            Scanner a = new Scanner(System.in);
            address.setCountry("Romania");
            address.setCounty("Iasi");
        System.out.println("Livrarile se fac in orasul " + address.getCounty()+" ,tara "+address.getCountry()+" ,te rugam introdu strada");
            String strada = a.nextLine();
            address.setStreet(strada);
            customer.setAddress(address);
            System.out.println("Produsele se vor livra la strada: " + address.getStreet());
        } catch (InputMismatchException e) {
            System.out.println("trebuie introdus un numar");
        }
    }
}
