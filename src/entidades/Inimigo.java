package entidades;

import interfaces.TomaEstrago;

public abstract class Inimigo implements TomaEstrago {
  private int ataque;
  private int defesa;
  private int vida;

  public Inimigo(int ataque, int defesa, int vida) {
    this.ataque = ataque;
    this.defesa = defesa;
    this.vida = vida;

  }

  public int getAtaque() {
    return ataque;
  }

  public int getDefesa() {
    return defesa;
  }

  public int getVida() {
    return vida;
  }

  public void tomarEstrago(int estrago) {
    this.vida -= estrago;

  }

}
