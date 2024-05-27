public class Jogador {
    private String nome;
    private int[][] quadrado;

    public Jogador(String nome) {
        this.nome = nome;
        this.quadrado = new int[3][3];
    }

    public String getNome() {
        return nome;
    }

    public int[][] getQuadrado() {
        return quadrado;
    }

    public void setValor(int linha, int coluna, int valor) {
        this.quadrado[linha][coluna] = valor;
    }
}
