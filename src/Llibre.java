
public class Llibre {

    private int idLlibre;
    private String titol;
    private String autor;

    public Llibre(int idLlibre, String titol, String autor) {
        this.idLlibre = idLlibre;
        this.titol = titol;
        this.autor = autor;
    }

    public int getIdLlibre() {
        return idLlibre;
    }

    public void setIdLlibre(int idLlibre) {
        this.idLlibre = idLlibre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
