import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Interface i = new Interface();
        
        i.TelaInicial();

        System.out.println("\nDigite o nome do Jogador 1:");
        String nome1 = sc.nextLine();

        System.out.println("Digite o nome do Jogador 2:");
        String nome2 = sc.nextLine();

        Jogo jogo = new Jogo(nome1, nome2);
        jogo.jogar();
    }
}
