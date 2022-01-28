package entidades;

public class Mago extends ClasseDeCombate {
  private final static int ATAQUE = 46;
  private final static int DEFESA = 30;
  private final static Arma[] ARMAS = { new Cajado(), new Livro() };

  public Mago() {
    super(ATAQUE, DEFESA, ARMAS);
  }

}
