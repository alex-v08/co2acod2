package alura.com;

public class Paises {

    private int id=0;
    private String nombre;
    private char urlBandera;
    private Monedas monedaPais;

    // Singleton

    public Paises(String nombre, char urlBandera, Monedas monedaPais) {
        this.id = id++;
        this.nombre = nombre;
        this.urlBandera = urlBandera;
        this.monedaPais = monedaPais;
    }

}
