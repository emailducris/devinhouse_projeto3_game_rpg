package entidades;

public class Espada extends Arma {
    private final static int ESTRAGO = 15;

    public Espada() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com sua espada";
    }

    @Override
    public String toString() {
        return "Espada";
    }
}
