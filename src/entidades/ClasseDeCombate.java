package entidades;

public abstract class ClasseDeCombate {
  private int ataque;
  private int defesa;
  private Arma[] armasEscolhidas;

  public ClasseDeCombate(int ataque, int defesa, Arma[] armasEscolhidas) {
    this.ataque = ataque;
    this.defesa = defesa;
    this.armasEscolhidas = armasEscolhidas;
  }

  public int getAtaque() {
    return ataque;
  }

  public int getDefesa() {
    return defesa;
  }

  public void setDefesa(int defesa) {
    this.defesa = defesa;
  }

  public Arma[] getArmasEscolhidas() {
    return armasEscolhidas;
  }
}
