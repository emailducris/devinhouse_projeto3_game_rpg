package entidades;

public class Guerreiro extends ClasseDeCombate {
  private final static int ATAQUE = 26;
  private final static int DEFESA = 50;
  private final static Arma[] ARMAS = { new Espada(), new Machado(), new Martelo() };

  public Guerreiro() {
    super(ATAQUE, DEFESA, ARMAS);
  }

}
