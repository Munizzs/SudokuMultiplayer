public class Tabuleiro {
    private int[][] tabuleiroJogador1;
    private int[][] tabuleiroJogador2;
    private boolean[][] fixosJogador1;
    private boolean[][] fixosJogador2;

    public Tabuleiro() {
        this.tabuleiroJogador1 = new int[3][3];
        this.tabuleiroJogador2 = new int[3][3];
        this.fixosJogador1 = new boolean[3][3];
        this.fixosJogador2 = new boolean[3][3];
        preencherTabuleiro();
    }

    private void preencherTabuleiro() {
        // Jogador 1
        tabuleiroJogador1[0][0] = 5; fixosJogador1[0][0] = true;
        tabuleiroJogador1[1][1] = 3; fixosJogador1[1][1] = true;
        tabuleiroJogador1[2][2] = 8; fixosJogador1[2][2] = true;

        // Jogador 2
        tabuleiroJogador2[0][0] = 2; fixosJogador2[0][0] = true;
        tabuleiroJogador2[1][1] = 5; fixosJogador2[1][1] = true;
        tabuleiroJogador2[2][2] = 8; fixosJogador2[2][2] = true;
    }

    public int[][] getTabuleiroJogador1() {
        return tabuleiroJogador1;
    }

    public int[][] getTabuleiroJogador2() {
        return tabuleiroJogador2;
    }

    public boolean PosicaoValidaJogador1(int linha, int coluna, int valor) {
        return !fixosJogador1[linha][coluna] && PosicaoValida(tabuleiroJogador1, linha, coluna, valor);
    }

    public boolean PosicaoValidaJogador2(int linha, int coluna, int valor) {
        return !fixosJogador2[linha][coluna] && PosicaoValida(tabuleiroJogador2, linha, coluna, valor);
    }

    private boolean PosicaoValida(int[][] tabuleiro, int linha, int coluna, int valor) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[linha][i] == valor || tabuleiro[i][coluna] == valor) {
                return false;
            }
        }

        int linhaQuadrado = linha / 3 * 3;
        int colunaQuadrado = coluna / 3 * 3;
        for (int i = linhaQuadrado; i < linhaQuadrado + 3; i++) {
            for (int j = colunaQuadrado; j < colunaQuadrado + 3; j++) {
                if (tabuleiro[i][j] == valor) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean PosicaoFixaJogador1(int linha, int coluna) {
        return fixosJogador1[linha][coluna];
    }

    public boolean PosicaoFixaJogador2(int linha, int coluna) {
        return fixosJogador2[linha][coluna];
    }

    public void ValorJogador1(int linha, int coluna, int valor) {
        tabuleiroJogador1[linha][coluna] = valor;
    }

    public void ValorJogador2(int linha, int coluna, int valor) {
        tabuleiroJogador2[linha][coluna] = valor;
    }

    public boolean[][] getFixosJogador1() {
        return fixosJogador1;
    }

    public boolean[][] getFixosJogador2() {
        return fixosJogador2;
    }
}
