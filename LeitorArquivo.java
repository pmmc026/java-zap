import java.io.*;
/**
 * Classe que trata as informações da base de dados para gerar objetos Mensagem.
 *
 * 
 */
public class LeitorArquivo {

    private String diretorioArquivo;
    private Ferramentas ferramentas;
    BufferedReader entradaDeDados;

    /**
     * Construtor da classe LeitorArquivo.
     * @param diretorioArquivo String contendo o diretório do arquivo da base de dados.
     * 
     */
    public LeitorArquivo(String diretorioArquivo) throws FileNotFoundException {

        this.diretorioArquivo = diretorioArquivo;
        this.entradaDeDados = new BufferedReader(new FileReader(diretorioArquivo));
        this.ferramentas = new Ferramentas();

    }

    public String getDiretorioArquivo() {
        return diretorioArquivo;
    }

    public void setDiretorioArquivo(String diretorioArquivo) {
        this.diretorioArquivo = diretorioArquivo;
    }
    /**
     * Método que fatia as informações de uma linha da base de dados entre vírgulas e as coloca num vetor.
     * @return retorna o vetor do tipo String, ou null caso a linha esteja vazia.
     */
    public String[] fatiarLinha() {
        String[] linhaFatiada = new String[6];
        try {
            String linha = entradaDeDados.readLine();
            if (linha != null) {
                linhaFatiada = linha.split(",");
            } else {
                linhaFatiada = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linhaFatiada;
    }
    /**
     * Chama o método fatiarlinha() para obter o vetor com as informações separadas e cria um objeto Mensagem com elas.
     * @return Uma instância da classe Mensagem, ou null caso o vetor também esteja vazio.
     */
    public Mensagem proximaMensagem() {
        String[] linhaFatiada = fatiarLinha();
        if (linhaFatiada == null) {
            return null;
        }
        return new Mensagem(ferramentas.stringParaInt(linhaFatiada[0]), ferramentas.stringParaInt(linhaFatiada[1]), ferramentas.stringParaInt(linhaFatiada[2]), linhaFatiada[3], linhaFatiada[4], linhaFatiada[5]);
    }
}
