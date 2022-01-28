package entidades;

public abstract class Arma {
  private int estrago;

  public Arma(int estrago) {
    this.estrago = estrago;

  }

  public abstract String ataque();

  public int getEstrago() {
    return estrago;
  }
}
