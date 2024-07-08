import java.io.FileNotFoundException;
/**
 *
 * Classe principal, responsável por criar os objetos LeitorArquivo e Mensagem,
 * definir o caminho do arquivo da base de dados e exibir o conteúdo dos objetos
 * Mensagem criados.
 * */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        LeitorArquivo leitor = new LeitorArquivo("INSIRA O CAMINHO DO ARQUIVO AQUI");
        Mensagem mensagem;
        while ((mensagem = leitor.proximaMensagem()) != null) {
            mensagem.exibirInfo();
        }
    }
}
