package entidades;

public class Livro extends Arma {
    private final static int ESTRAGO = 16;

    public Livro() {
        super(ESTRAGO);
    }

    public String ataque() {
        return "absorvendo energia do livro com uma mão e liberando com a outra";
    }

    @Override
    public String toString() {
        return "Livro";
    }
}
