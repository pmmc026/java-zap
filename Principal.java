import java.io.FileNotFoundException;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        LeitorArquivo leitor = new LeitorArquivo("INSIRA O CAMINHO DO ARQUIVO AQUI");
        while (leitor.proximaMensagem() != null) {
            leitor.proximaMensagem().exibirInfo();
        }
    }
}