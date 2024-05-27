public class Verificacao {
    public static boolean NumeroValido(int valor) {
        if(valor >= 1 && valor <= 9){
            return true;
        }else{
            return false;
        }
    }

    public static boolean PosicaoValida(int linha, int coluna) {
        if(linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3){
            return true;
        }else{
            return false;
        }
    }
}
