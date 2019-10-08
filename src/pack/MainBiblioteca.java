package pack;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Carte c1 = new Carte("Mate", "Pitagora");
        Carte c2 = new Carte("Romana", "Eminescu");
        Carte c3 = new Carte("Info", "Prof x");
        Carte c4 = new Carte("Engleza", "Ciubotaru");

        Carte[] carti = {c1, c2, c3, c4};
        biblioteca.setCarte(carti);

        System.out.println("Afisarea cartilor din biblioteca: ");
        biblioteca.afisare2();
        System.out.println();

        System.out.println("Titlurile sortate in ordine alfabetica: ");
        biblioteca.titluAlfabetic();
        System.out.println();

        System.out.println("Autorii sortati in ordine alfabetica:");
        biblioteca.autoriAlfabetic();
        System.out.println();
        Carte imprumut1 = new Carte("Romana", "Eminescu");
        Carte imprumut2 = new Carte("Mate", "Euclid");
        biblioteca.imprumut(imprumut1);
        biblioteca.imprumut(imprumut2);
        System.out.println();

        System.out.println("Cartea imprumutata este " + imprumut1.getTitlu() + " " + imprumut2.getTitlu());
        System.out.println();
        System.out.println("Cartile ramase dupa imprumut sunt: ");
        biblioteca.afisare2();
        Carte adus = new Carte("Romana", "Eminescu");
        biblioteca.retur1(adus);
        System.out.println();

        System.out.println("Cartea adusa este de: " + adus.getTitlu());
        System.out.println();

        System.out.println("Cartile dupa retur sunt: ");
        biblioteca.afisare2();
        System.out.println();

        System.out.print("Numarul de carti ramase este: ");
        int r = biblioteca.nrRamase();
        System.out.println(r);

        System.out.print("Numaru de carti imprumutate este: ");
        int n = biblioteca.nrImprumutate();
        System.out.println(n);

    }
}

