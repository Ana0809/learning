package pack;

public class Biblioteca {
    Carte[] carte1;

    public void setCarte(Carte[] carte1) {
        this.carte1 = carte1;
    }

    public Carte[] getCarte() {
        return carte1;
    }

    public void afisare2() {
        for (int i = 0; i < carte1.length; i++) {
            if (getCarte()[i] != null) {
                System.out.println(getCarte()[i].getTitlu() + " scrisa de " + getCarte()[i].getAutor());
            }
        }
    }

    public Carte imprumut(Carte carteDeLuat) {
        Carte val = null;
        for (int i = 0; i < carte1.length; i++) {
            if ((carte1[i] != null) && getCarte()[i].getAutor().equals(carteDeLuat.getAutor()) && (getCarte()[i].getTitlu().equals(carteDeLuat.getTitlu()))) {
                val = carte1[i];
                carte1[i] = null;
                break;
            }
        }
        if (val == null) {
            System.out.println("Nu este");

        }
        return val;
    }

    public Carte retur1(Carte carteDeAdus) {
        for (int i = 0; i < carte1.length; i++) {
            if (carte1[i] == null) {
                carte1[i] = carteDeAdus;
                break;
            }
        }
        return carteDeAdus;
    }
    public int nrRamase () {
        int ramase = carte1.length;
        for (int i = 0; i < carte1.length; i++) {
            if (carte1[i] == null) {
                ramase--;
                break;
            }
        }
        return ramase;
    }

    public int nrImprumutate () {
        int impr = 0;
        for (int i = 0; i < carte1.length; i++) {
            if (carte1[i] == null) {
                impr++;
                break;
            }
        }
        return impr;
    }

    public void titluAlfabetic () {
        for (int i = 0; i < carte1.length; i++) {
            for (int j = i + 1; j < carte1.length; j++) {
                if (getCarte()[i].getTitlu().compareTo(getCarte()[j].getTitlu()) > 0) {
                    Carte aux = getCarte()[i];
                    getCarte()[i] = getCarte()[j];
                    getCarte()[j] = aux;
                }
            }
            System.out.print(getCarte()[i].getTitlu() + " ");
        }
    }

    public void autoriAlfabetic () {
        for (int i = 0; i < carte1.length; i++) {
            for (int j = i + 1; j < carte1.length; j++) {
                if (getCarte()[i].getAutor().compareTo(getCarte()[j].getAutor()) > 0) {
                    Carte xau = getCarte()[i];
                    getCarte()[i] = getCarte()[j];
                    getCarte()[j] = xau;
                }
            }
            System.out.print(getCarte()[i].getAutor() + " ");
        }
    }
}