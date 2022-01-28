package entidades;

public class OrqueArmeiro extends Inimigo {
  private final static int ATAQUE = 45;
  private final static int DEFESA = 30;
  private final static int VIDA = 50;

  public OrqueArmeiro() {
    super(ATAQUE, DEFESA, VIDA);
  }

}
