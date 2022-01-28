package entidades;

public class Martelo extends Arma {
    private final static int ESTRAGO = 19;

    public Martelo() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com seu martelo";
    }

    @Override
    public String toString() {
        return "Martelo";
    }
}
