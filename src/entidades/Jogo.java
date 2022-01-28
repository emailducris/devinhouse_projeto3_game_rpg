package entidades;

import java.util.Random;
import java.util.Scanner;

import entidades.Heroi.Motivacao;
import entidades.Heroi.Sexo;

public class Jogo {
  public enum Dificuldade {
    FACIL, NORMAL, DIFICIL;
  }

  private static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_PURPLE_BOLD = "\033[1;35m";
  public static final String ANSI_PURPLE_BOLD_BRIGHT = "\033[1;95m";
  public static final String ANSI_PURPLE_BRIGHT = "\033[0;95m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_RED = "\033[0;31m";

  public void testarCombate() {
    Dificuldade dificuldade = Dificuldade.NORMAL;
    Heroi heroi = new Heroi(new Guerreiro(), 0, "John", Sexo.MASCULINO, Motivacao.GLORIA);
    Inimigo inimigo = new OrqueLider();
    Combate combate = new Combate(dificuldade, heroi, inimigo);
    boolean ehHeroiVencedor = combate.iniciarLuta(true);
    if (ehHeroiVencedor) {
      System.out.println(ANSI_PURPLE + "\nHerói venceu o combate!\n" + ANSI_RESET);
    } else {
      System.out.println(ANSI_PURPLE + "\nHerói foi derrotado!\n " + ANSI_RESET);
    }
  }

  public void jogar() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println(ANSI_PURPLE_BOLD_BRIGHT + "\nSeja bem vindo(a) à BATALHA FINAL!\n" + ANSI_RESET);
    System.out.println(ANSI_PURPLE_BOLD + "\nEscolha o nível de dificuldade:\n" + ANSI_RESET);
    int opcao = 0;
    Dificuldade dificuldade = null;
    do {
      System.out.println(ANSI_YELLOW + "[1] Fácil" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Normal" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[3] Dificil\n" + ANSI_RESET);

      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        dificuldade = Dificuldade.FACIL;
        break;
      case 2:
        dificuldade = Dificuldade.NORMAL;
        break;
      case 3:
        dificuldade = Dificuldade.DIFICIL;
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }

    } while (opcao == 0);

    System.out.println(ANSI_PURPLE_BRIGHT + "\nDigite seu nome:\n" + ANSI_RESET);
    String nome = scanner.next();
    System.out.println(ANSI_PURPLE_BRIGHT + "\nEscolha seu sexo:\n" + ANSI_RESET);
    Sexo sexo = null;
    do {
      System.out.println(ANSI_YELLOW + "[1] Masculino" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Feminino\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        sexo = Sexo.MASCULINO;
        break;
      case 2:
        sexo = Sexo.FEMININO;
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }

    } while (opcao == 0);
    System.out.println(ANSI_PURPLE_BRIGHT + "\nEscolha uma classe de combate:\n" + ANSI_RESET);
    ClasseDeCombate classeDeCombate = null;
    do {
      switch (sexo) {
      case MASCULINO:
        System.out.println(ANSI_YELLOW + "[1] Guerreiro" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "[2] Atirador" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "[3] Mago\n" + ANSI_RESET);
        break;
      case FEMININO:
        System.out.println(ANSI_YELLOW + "[1] Guerreira" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "[2] Atiradora" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "[3] Feiticeira\n" + ANSI_RESET);
        break;
      }
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        classeDeCombate = new Guerreiro();
        break;
      case 2:
        classeDeCombate = new Atirador();
        break;
      case 3:
        classeDeCombate = new Mago();
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);
    System.out.println(ANSI_PURPLE_BRIGHT + "\nEscolha sua arma:\n" + ANSI_RESET);
    int armaEscolhida = -1;
    do {
      for (int i = 0; i < classeDeCombate.getArmasEscolhidas().length; i++) {
        System.out.printf(ANSI_YELLOW + "[%d] %s %n", i + 1, classeDeCombate.getArmasEscolhidas()[i] + ANSI_RESET);
      }
      opcao = scanner.nextInt();
      if (opcao > 0 && opcao <= classeDeCombate.getArmasEscolhidas().length) {
        armaEscolhida = opcao - 1;
      } else {
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);

      }
    } while (armaEscolhida == -1);
    System.out.println(ANSI_PURPLE
        + "\nA noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nMemórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nBuscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n" + ANSI_RESET);
    System.out.println(
        ANSI_PURPLE_BRIGHT + "\nEscolha sua motivação para invadir a caverna do inimigo e derrotá-lo:\n" + ANSI_RESET);
    Motivacao motivacao = null;
    do {
      System.out.println(ANSI_YELLOW + "[1] Vingança" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Glória\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        motivacao = Motivacao.VINGANCA;
        break;
      case 2:
        motivacao = Motivacao.GLORIA;
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);

    Heroi heroi = new Heroi(classeDeCombate, armaEscolhida, nome, sexo, motivacao);

    System.out.println(ANSI_PURPLE
        + "\nInspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nA escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.\n"
        + ANSI_RESET);

    System.out.println(ANSI_PURPLE_BRIGHT + "\nSeguir em frente ou desistir:\n" + ANSI_RESET);

    do {
      System.out.println(ANSI_YELLOW + "[1] Seguir" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Desistir\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        System.out.println(ANSI_PURPLE
            + "\nVocê caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.\n"
            + ANSI_RESET);
        break;
      case 2:
        System.out.println(ANSI_PURPLE
            + "\nO medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.\n"
            + ANSI_RESET);
        System.exit(0);
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);
    System.out.println(ANSI_PURPLE
        + "\nVocê se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE_BRIGHT + "\nAndando cuidadosamente, correndo, saltando:\n" + ANSI_RESET);
    do {
      System.out.println(ANSI_YELLOW + "[1] Saltando" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Andando" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[3] Correndo\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        System.out.println(ANSI_PURPLE
            + "\nVocê se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.\n"
            + ANSI_RESET);
        break;
      case 2:
        Random aleatorio = new Random();
        System.out.println(ANSI_PURPLE
            + "\nVocê toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.\n"
            + ANSI_RESET);
        heroi.tomarEstrago(aleatorio.nextInt(10) + 1);
        break;
      case 3:
        System.out.println(ANSI_PURPLE
            + "\nVocê respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\n"
            + ANSI_RESET);
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);

    System.out.println(ANSI_PURPLE
        + "\nVocê se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "\nVocê se dirige para a porta à direita.\n" + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nPORTA DIREITA: Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nEnquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.\n"
        + ANSI_RESET);
    // Entra no loop de combate
    Inimigo orqueArmeiro = new OrqueArmeiro();
    Combate combate = new Combate(dificuldade, heroi, orqueArmeiro);
    boolean ehHeroiVencedor = combate.iniciarLuta(true);
    if (!ehHeroiVencedor) {
      System.exit(0);
    }

    System.out.println(ANSI_PURPLE
        + "\nApós derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE_BRIGHT + "\nJogador escolhe pegar ou não as armaduras novas:\n" + ANSI_RESET);
    do {
      System.out.println(ANSI_YELLOW + "[1] Pegar armadura" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Não pegar armadura\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        System.out.println(ANSI_PURPLE
            + "\nVocê resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.\n"
            + ANSI_RESET);
        heroi.getClasseDeCombate().setDefesa(heroi.getClasseDeCombate().getDefesa() + 5);
        break;
      case 2:
        System.out.println(
            ANSI_PURPLE + "\nVocê decide que não precisa utilizar nada que venha das mãos do inimigo.\n" + ANSI_RESET);
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);

    System.out.println(ANSI_PURPLE
        + "\nEm uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nPORTA ESQUERDA: Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nNo fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.\n"
        + ANSI_RESET);

    // Entra no loop de combate
    Inimigo orqueAlquimista = new OrqueAlquimista();
    combate = new Combate(dificuldade, heroi, orqueAlquimista);
    ehHeroiVencedor = combate.iniciarLuta(true);
    if (!ehHeroiVencedor) {
      System.exit(0);
    }
    System.out.println(ANSI_PURPLE_BRIGHT
        + "\nApós derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.\n"
        + ANSI_RESET);

    do {
      System.out.println(ANSI_YELLOW + "[1] Beber poção" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Não beber poção\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        System.out.println(ANSI_PURPLE + "\nVocê se sente revigorado para seguir adiante!\n" + ANSI_RESET);
        heroi.setVidaAtual(Heroi.getVidaMaxima());
        break;
      case 2:
        System.out.println(ANSI_PURPLE + "\nVocê fica receoso de beber algo produzido pelo inimigo\n" + ANSI_RESET);
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);
    System.out.println(ANSI_PURPLE
        + "\nAo lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nDe volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.\n"
        + ANSI_RESET);
    System.out.println(ANSI_PURPLE
        + "\nLá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.\n");
    System.out.println(ANSI_PURPLE
        + "\nEle percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.\n"
        + ANSI_RESET);

    // Entra no loop de combate
    Inimigo orqueLider = new OrqueLider();
    combate = new Combate(dificuldade, heroi, orqueLider);

    do {

      System.out.println(ANSI_YELLOW + "[1] Atacar" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "[2] Esperar\n" + ANSI_RESET);
      opcao = scanner.nextInt();
      switch (opcao) {
      case 1:
        ehHeroiVencedor = combate.iniciarLuta(true);
        break;
      case 2:
        ehHeroiVencedor = combate.iniciarLuta(false);
        break;
      default:
        System.out.println(ANSI_RED + "\nOpção inválida, digite novamente\n" + ANSI_RESET);
        opcao = 0;
        break;
      }
    } while (opcao == 0);
    // Se o inimigo ganhar sai do jogo
    if (!ehHeroiVencedor) {
      System.exit(0);

    } else {
      System.out.println(ANSI_PURPLE_BRIGHT + "\nVocê conseguiu!\n" + ANSI_RESET);
      switch (heroi.getMotivacao()) {
      case VINGANCA:
        System.out.println(ANSI_PURPLE
            + "\nVocê obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.\n"
            + ANSI_RESET);
        break;
      case GLORIA:
        System.out.println(ANSI_PURPLE
            + "\nO êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.\n"
            + ANSI_RESET);
        break;
      }
      System.out.println(ANSI_PURPLE
          + "\nVocê se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.\n"
          + ANSI_RESET);
    }
    System.exit(0);
  }
}
