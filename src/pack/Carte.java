package pack;

public class Carte {
    private String titlu;
    private String autor;

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }
}


