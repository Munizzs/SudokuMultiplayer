public class Interface {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public void TelaInicial(){
        System.out.println("\n Bem-vindo ao  \n ");

        System.out.println("|||Sudoku Multiplayer|||");

        System.out.println("\nCriado por : Matheus e Camila  \n ");
    }

    public static void mostrarTabuleiro(int[][] tabuleiroJogador1, boolean[][] fixosJogador1, int[][] tabuleiroJogador2, boolean[][] fixosJogador2) {
        System.out.println("---------------");
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 3; j++) {               
                if (fixosJogador1[i][j]) {
                    System.out.print(ANSI_RED + tabuleiroJogador1[i][j] + ANSI_RESET + " ");
                } else if (tabuleiroJogador1[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(tabuleiroJogador1[i][j] + " ");
                }
            }
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {               
                if (fixosJogador2[i][j]) {
                    System.out.print(ANSI_RED + tabuleiroJogador2[i][j] + ANSI_RESET + " ");
                } else if (tabuleiroJogador2[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(tabuleiroJogador2[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
