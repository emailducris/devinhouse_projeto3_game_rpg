package entidades;

import java.util.Random;
import java.util.Scanner;

import entidades.Jogo.Dificuldade;

public class Combate {
  private final static double PORCENTAGEM_FACIL = 0.8;
  private final static double PORCENTAGEM_DIFICIL = 0.9;
  private final static int VALOR_MAXIMO_DADO = 20;
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_PURPLE_BRIGHT = "\033[0;95m";
  private static final String ANSI_RED = "\033[0;31m";
  private Dificuldade dificuldade;
  private Heroi heroi;
  private Inimigo inimigo;

  public Combate(Dificuldade dificuldade, Heroi heroi, Inimigo inimigo) {
    this.dificuldade = dificuldade;
    this.heroi = heroi;
    this.inimigo = inimigo;

  }

  public Dificuldade getDificuldade() {
    return dificuldade;
  }

  public Heroi getHeroi() {
    return heroi;
  }

  public Inimigo getInimigo() {
    return inimigo;
  }

  public boolean iniciarLuta(boolean heroiComecaAtacando) {
    Scanner entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    boolean ehTurnoDoHeroi = heroiComecaAtacando;
    while (heroi.getVidaAtual() > 0 && inimigo.getVida() > 0) {
      if (ehTurnoDoHeroi) {
        int opcao = 0;
        do {
          System.out.println(ANSI_PURPLE_BRIGHT + "\nÉ sua vez!\n" + ANSI_RESET);
          System.out.println(ANSI_YELLOW + "Digite 1 para atacar\n" + ANSI_RESET);
          System.out.println(ANSI_YELLOW + "Digite 2 para fugir do combate\n" + ANSI_RESET);
          opcao = entrada.nextInt();
          switch (opcao) {
          case 1:
            break;
          case 2:
            System.out.println(ANSI_PURPLE
                + "\nVocê não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.\n"
                + ANSI_RESET + ANSI_RESET);
            return false;

          default:
            System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
            opcao = 0;
            break;
          }
        } while (opcao == 0);
        this.heroiAtaca(aleatorio.nextInt(VALOR_MAXIMO_DADO) + 1);
        ehTurnoDoHeroi = false;
      } else {
        this.inimigoAtaca(aleatorio.nextInt(VALOR_MAXIMO_DADO) + 1);
        ehTurnoDoHeroi = true;
      }
    }
    if (inimigo.getVida() <= 0) {
      System.out.println(
          ANSI_PURPLE + "\nO inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.\n" + ANSI_RESET);
      return true;
    }
    System.out.println(ANSI_PURPLE + "\nVocê não estava preparado para a força do inimigo.\n" + ANSI_RESET);
    switch (heroi.getMotivacao()) {
    case VINGANCA:
      System.out.println(
          ANSI_PURPLE + "\nNão foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.\n"
              + ANSI_RESET);
      break;
    case GLORIA:
      switch (heroi.getSexo()) {
      case MASCULINO:
        System.out.println(ANSI_PURPLE
            + "\nA glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.\n" + ANSI_RESET);
        break;
      case FEMININO:
        System.out.println(ANSI_PURPLE
            + "\nA glória que buscavas não será sua, e a cidade aguarda por sua próxima heróina.\n" + ANSI_RESET);
        break;
      }
    }
    return false;
  }

  public void heroiAtaca(int rolamentoDado) {
    if (rolamentoDado == 1) {
      System.out.println(ANSI_PURPLE + "\nVocê errou o ataque! O inimigo não sofreu dano.\n" + ANSI_RESET);
    } else if (rolamentoDado == VALOR_MAXIMO_DADO) {
      int estrago = dificuldade == Dificuldade.DIFICIL
          ? (int) ((heroi.getClasseDeCombate().getAtaque() + heroi.getArma().getEstrago() + rolamentoDado)
              * PORCENTAGEM_DIFICIL)
          : heroi.getClasseDeCombate().getAtaque() + heroi.getArma().getEstrago() + rolamentoDado;
      if (estrago < 0) {
        estrago = 0;
      }
      inimigo.tomarEstrago(estrago);
      System.out.printf(ANSI_PURPLE
          + "\nVocê acertou um ataque crítico %s! O inimigo sofreu %d de dano e agora possui %d pontos de vida.%n.\n"
          + ANSI_RESET, heroi.getArma().ataque(), estrago, inimigo.getVida());
    } else {
      int estrago = dificuldade == Dificuldade.DIFICIL
          ? (int) ((heroi.getClasseDeCombate().getAtaque() + heroi.getArma().getEstrago() + rolamentoDado
              - inimigo.getDefesa()) * PORCENTAGEM_DIFICIL)
          : heroi.getClasseDeCombate().getAtaque() + heroi.getArma().getEstrago() + rolamentoDado - inimigo.getDefesa();
      if (estrago < 0) {
        estrago = 0;
      }
      inimigo.tomarEstrago(estrago);
      System.out.printf(ANSI_PURPLE
          + "\nVocê atacou %s! O inimigo sofreu %d de dano e agora possui %d pontos de vida.%n\n" + ANSI_RESET,
          heroi.getArma().ataque(), estrago, inimigo.getVida());
    }
  }

  public void inimigoAtaca(int rolamentoDado) {
    if (rolamentoDado == 1) {
      System.out.println(ANSI_PURPLE + "\nO inimigo errou o ataque! Você não sofreu dano.\n" + ANSI_RESET);
    } else if (rolamentoDado == VALOR_MAXIMO_DADO) {
      int estrago = dificuldade == Dificuldade.FACIL ? (int) ((inimigo.getAtaque() + rolamentoDado) * PORCENTAGEM_FACIL)
          : inimigo.getAtaque() + rolamentoDado;
      if (estrago < 0) {
        estrago = 0;
      }
      heroi.tomarEstrago(estrago);
      System.out.printf(ANSI_PURPLE
          + "\nO inimigo acertou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.%n\n"
          + ANSI_RESET, estrago, heroi.getVidaAtual());
    } else {
      int estrago = dificuldade == Dificuldade.FACIL
          ? (int) ((inimigo.getAtaque() + rolamentoDado - heroi.getClasseDeCombate().getDefesa()) * PORCENTAGEM_FACIL)
          : inimigo.getAtaque() + rolamentoDado - heroi.getClasseDeCombate().getDefesa();
      if (estrago < 0) {
        estrago = 0;
      }
      heroi.tomarEstrago(estrago);
      System.out.printf(
          ANSI_PURPLE + "\nO inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.%n\n" + ANSI_RESET,
          estrago, heroi.getVidaAtual());
    }
  }
}
