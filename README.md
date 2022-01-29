# O Jogo!

## Introdução
Trata-se de um game de RPG que foi desenvolvido durante o curso DevInHouse de formação Full Stack do Senai, utilizando apenas a linguagem de programação Java, possui características do que a indústria de software se refere como back-end, o desafio principal foi construir um sistema 100% funcional, sem depender de nenhuma outra tecnologia para exibição. Seguindo as especificações definidas que estão detalhadas logo abaixo.

## Requisitos da Aplicação
A aplicação que deverá ser realizada individualmente, deve contemplar os seguintes requisitos conforme o roteiro do jogo:
O desenvolvimento das mensagens de saída do jogo, esperando pela ação do usuário; 
Captura da interação do usuário via entrada padrão;
Criação do sistema automático de combate;
Criação da customização do personagem, incluindo seu nome, equipamentos e demais informações

## Critérios de Avaliação
A tabela abaixo apresenta os critérios que serão avaliados durante a correção do projeto. O mesmo possui variação de nota de 0 (zero) a 10 (dez) como nota mínima e máxima, e possui peso de 50% sobre a avaliação do módulo 1.
Serão desconsiderados e atribuída a nota 0 (zero) os projetos que apresentarem plágio de soluções encontradas na internet ou de outros colegas. Lembre-se: Você está livre para utilizar outras soluções como base, mas não é permitida a cópia.

## Plano de Projeto
Ao construir o jogo, o aluno estará colocando em prática os aprendizados em:
POO: conceitos fundamentais da programação orientada a objetos, tais como classes, herança e polimorfismo.
Java: familiarização com a sintaxe da linguagem, representação de entidades e entrada/saída de informações via terminal.

## Roteiro do Jogo
Jogador inicia jogo

Introdução: 
Seja bem vindo(a) à BATALHA FINAL!
[escolha do nível de dificuldade]
[escolha nome e sexo]
[escolha uma classe de combate]
[escolha uma arma, dentre as disponíveis para sua classe]

A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.

Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.

Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.
[Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: VINGANÇA, GLÓRIA]

(dependendo da motivação, exibir um dos textos a seguir)

VINGANÇA: Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).

GLÓRIA: Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.

Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.

A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.

[seguir em frente ou desistir]

DESISTIR: o medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.

SEGUIR: você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.

Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.

[andando cuidadosamente, correndo, saltando]

SALTANDO: Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.

ANDANDO: Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna. [toma dano utilizando mecanismo de ataque descrito abaixo, porém o rolamento de dados é só de 1-10]

CORRENDO: Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.

Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.

Você se dirige para a porta à direita.

PORTA DIREITA: Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.

Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.

[entra no loop de combate]

Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.
[jogador escolhe pegar ou não as armaduras novas.
Se escolher pegar, o jogo deve exibir a mensagem: “Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.” O jogo deve acrescentar +5 pontos de defesa para o jogador.
Se escolher não pegar, o jogo deve exibir a mensagem: “Você decide que não precisa utilizar nada que venha das mãos do inimigo.”]

Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.

PORTA ESQUERDA: Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região.
No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.

[entra no loop de combate]

Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.

[jogador escolhe entre beber ou não. Se beber, o jogo exibe a mensagem: “Você se sente revigorado para seguir adiante!” e recupera 100% dos pontos de vida do jogador. Se não beber, o jogo exibe a mensagem: “Você fica receoso de beber algo produzido pelo inimigo”.]

Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.

De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.

Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.

Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.

[jogador deve decidir se ataca ou espera]
[entra no loop de combate]

Você conseguiu!
{MENSAGEM DE VITÓRIA DE ACORDO COM A MOTIVAÇÃO}
VINGANÇA: Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.
GLÓRIA: O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.

Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.

O jogo encerra.

### 1.1 Combate:

Num combate, cada adversário possui um turno. Quem toma a iniciativa do início do combate possui a vantagem do primeiro turno. O inimigo sempre atacará, e o jogador pode escolher entre atacar e fugir (encerrando o jogo).

Cada ataque leva em consideração os pontos de ataque do personagem + ataque da arma + “rolamento de dado” (valor entre 1-20) para definir o tanto de dano que o atacante irá desferir no defensor. Essa quantidade de dano é subtraída pelos pontos de defesa do defensor. Se o rolamento de dados do atacante for 1, ele erra, e o defensor não sofre nenhum dano. Se o rolamento de dados do atacante for 20, ele conseguirá um acerto crítico, e o seu ataque ignora a defesa do adversário (ou seja, o dano que ele desfere é 100%, sem subtrair pelos pontos de defesa do defensor).

Quando o inimigo ataca, é realizado o cálculo do ataque e o jogo deve atualizar os pontos de vida do jogador, e exibir a mensagem: “O inimigo atacou! Você sofreu X de dano e agora possui Y pontos de vida.” substituindo X pela quantidade de dano do ataque e Y pela quantidade de pontos de vida atual do jogador. Se o inimigo errar, a mensagem exibida deve ser “O inimigo errou o ataque! Você não sofreu dano.”. Se o inimigo acertar um ataque crítico, a mensagem deve ser: "O inimigo acertou um ataque crítico! Você sofreu X de dano e agora possui Y pontos de vida.". Caso o ataque do inimigo te leve a 0 pontos de vida, você morre, e a mensagem exibida deve ser “Você não estava preparado para a força do inimigo. {COMPLEMENTO DE ACORDO COM A MOTIVAÇÃO}”, substituindo o conteúdo entre chaves de acordo com a motivação do personagem selecionada no início do jogo. VINGANÇA: “Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.” GLÓRIA: “A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).” (o gênero deve ser alterado para refletir o sexo do personagem escolhido pelo jogador no início do jogo). O jogo encerra quando o jogador morre.

Quando é a vez do jogador fazer uma ação, deve ser perguntado a ele se ele deseja atacar ou fugir. Se escolher fugir, o jogo deve exibir a mensagem “Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.”.
Se escolher atacar, o jogo deve realizar o cálculo do ataque e atualizar os pontos de vida do inimigo. O jogo deve exibir a mensagem “Você atacou {COMPLEMENTO DA ARMA} e causou X de dano no inimigo!”, substituindo o conteúdo entre chaves de acordo com a arma do personagem. Espada, machado, martelo ou clava: “com sua/seu {ARMA}”. Arco+flecha ou besta+virote: “com seu/sua {ARMA}, a/o {MUNIÇÃO} atingiu”. Cajado: “com seu cajado, lançando uma bola de fogo”. Livro: “absorvendo energia do livro com uma mão e liberando com a outra”.
Se o jogador errar, a mensagem exibida deve ser “Você errou seu ataque! O inimigo não sofreu dano algum.”. Se o jogador acertar um ataque crítico, a mensagem deve ser: "Você acertou um ataque crítico! {COMPLEMENTO}” substituindo o conteúdo entre chaves pela mensagem de ataque normal.
Caso o inimigo morra com o seu ataque, o jogo deve exibir “O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.”]

### 2.2 Níveis de dificuldade:

O jogo foi pensado com três níveis de dificuldade: fácil, normal e difícil. No nível fácil, todos os inimigos causam 20% a menos de dano no personagem; enquanto no nível difícil o personagem causa 10% a menos de dano nos inimigos. No nível normal não há nenhum modificador sobre o ataque de personagens ou inimigos.

## Imagens do jogo
![image](https://user-images.githubusercontent.com/90730383/151638328-536f7ebe-6441-4344-a3cd-aabb1d214f8d.png)

