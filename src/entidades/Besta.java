package entidades;

public class Besta extends Arma {
    private final static int ESTRAGO = 23;

    public Besta() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com sua besta, o virote atingiu";
    }

    @Override
    public String toString() {
        return "Besta e Virote";
    }
}