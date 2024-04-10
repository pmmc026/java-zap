import java.io.*;
/**
 * Classe que trata as informações da base de dados.
 * 
 */
public class LeitorArquivo {

    private String diretorioArquivo;
    private Ferramentas ferramentas;
    BufferedReader entradaDeDados;
    /**
     * Método para ler o arquivo da base de dados.
     * @param diretorioArquivo String contendo o arquivo a ser lido.
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
     * Método que fatia as informações da base de dados através da vírgula e as coloca num vetor de tamanho 6.
     * @return retorna o vetor.
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
     * Chama o método fatiarlinha() para obter as informações fatiadas.
     * @return Se não há mais informações para ler o método retorna null. Se houver, ele cria uma instância da classe Mensagem.
     */
    public Mensagem proximaMensagem() {
        String[] linhaFatiada = fatiarLinha();
        if (linhaFatiada == null) {
            return null;
        }
        return new Mensagem(ferramentas.stringParaInt(linhaFatiada[0]), ferramentas.stringParaInt(linhaFatiada[1]), ferramentas.stringParaInt(linhaFatiada[2]), linhaFatiada[3], linhaFatiada[4], linhaFatiada[5]);
    }
}
