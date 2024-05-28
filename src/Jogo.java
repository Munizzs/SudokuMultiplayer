
import java.util.Scanner;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Tabuleiro tabuleiro;

    public Jogo(String nome1, String nome2) {
        jogador1 = new Jogador(nome1);
        jogador2 = new Jogador(nome2);
        tabuleiro = new Tabuleiro();
    }

    public void jogar() {
        Scanner sc = new Scanner(System.in);
        Jogador jogadorAtual = jogador1;
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            Interface.mostrarTabuleiro(tabuleiro.getTabuleiroJogador1(), tabuleiro.getFixosJogador1(), tabuleiro.getTabuleiroJogador2(), tabuleiro.getFixosJogador2());            
            System.out.println("Vez de " + jogadorAtual.getNome());
            System.out.println("Informe a linha (0-2) e coluna (0-2) e o valor (1-9):");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();
            int valor = sc.nextInt();

            if (!Verificacao.NumeroValido(valor) || !Verificacao.PosicaoValida(linha, coluna)) {
                System.out.println("Entrada inválida, tente novamente.");
                continue;
            }

            if (jogadorAtual == jogador1) {
                if (!tabuleiro.PosicaoValidaJogador1(linha, coluna, valor)) {
                    System.out.println("Movimento inválido, tente novamente.");
                    continue;
                }
                tabuleiro.ValorJogador1(linha, coluna, valor);
            } else {
                if (!tabuleiro.PosicaoValidaJogador2(linha, coluna, valor)) {
                    System.out.println("Movimento inválido, tente novamente.");
                    continue;
                }
                tabuleiro.ValorJogador2(linha, coluna, valor);
            }

            // Trocar de jogador
            jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;

            // Verificar se o jogo terminou
            jogoEmAndamento = !verificarFimDeJogo();
        }

        System.out.println("Jogo terminou!");
    }

    private boolean verificarFimDeJogo() {
        int[][] tab1 = tabuleiro.getTabuleiroJogador1();
        int[][] tab2 = tabuleiro.getTabuleiroJogador2();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab1[i][j] == 0 || tab2[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
