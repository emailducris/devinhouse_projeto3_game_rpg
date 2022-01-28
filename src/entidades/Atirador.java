package entidades;

public class Atirador extends ClasseDeCombate {
  private final static int ATAQUE = 35;
  private final static int DEFESA = 35;
  private final static Arma[] ARMAS = { new ArcoFlexa(), new Besta() };

  public Atirador() {
    super(ATAQUE, DEFESA, ARMAS);
  }

}
