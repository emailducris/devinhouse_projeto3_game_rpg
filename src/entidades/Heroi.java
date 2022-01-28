package entidades;

import interfaces.TomaEstrago;

public class Heroi implements TomaEstrago {
  public enum Sexo {
    MASCULINO, FEMININO;
  }

  public enum Motivacao {
    VINGANCA, GLORIA;
  }

  private final static int VIDA_MAXIMA = 100;
  private int vidaAtual;
  private ClasseDeCombate classeDeCombate;
  private Arma arma;
  private String nome;
  private Sexo sexo;
  private Motivacao motivacao;

  public Heroi(ClasseDeCombate classeDeCombate, int armaEscolhida, String nome, Sexo sexo, Motivacao motivacao) {
    this.vidaAtual = VIDA_MAXIMA;
    this.classeDeCombate = classeDeCombate;
    this.arma = classeDeCombate.getArmasEscolhidas()[armaEscolhida];
    this.nome = nome;
    this.sexo = sexo;
    this.motivacao = motivacao;

  }

  public static int getVidaMaxima() {
    return VIDA_MAXIMA;
  }

  public int getVidaAtual() {
    return vidaAtual;
  }

  public void setVidaAtual(int vidaAtual) {
    this.vidaAtual = vidaAtual;
  }

  public ClasseDeCombate getClasseDeCombate() {
    return classeDeCombate;
  }

  public Arma getArma() {
    return arma;
  }

  public String getNome() {
    return nome;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public Motivacao getMotivacao() {
    return motivacao;
  }

  public void tomarEstrago(int estrago) {
    this.vidaAtual -= estrago;
  }

}
