package entidades;

public class Cajado extends Arma {
    private final static int ESTRAGO = 25;

    public Cajado() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com seu cajado, lançando uma bola de fogo";
    }

    @Override
    public String toString() {
        return "Cajado";
    }
}
