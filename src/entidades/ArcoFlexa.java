package entidades;

public class ArcoFlexa extends Arma {
    private final static int ESTRAGO = 7;

    public ArcoFlexa() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "com seu arco, a flecha atingiu";
    }

    @Override
    public String toString() {
        return "Arco e Flecha";
    }
}