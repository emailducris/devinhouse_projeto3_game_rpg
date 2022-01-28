package entidades;

public class Machado extends Arma {
    private final static int ESTRAGO = 24;

    public Machado() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com seu machado";
    }

    @Override
    public String toString() {
        return "Machado";
    }

}
