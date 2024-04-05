import java.io.*;

public class LeitorArquivo {

    private String diretorioArquivo;
    private Ferramentas ferramentas;
    BufferedReader entradaDeDados;

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

    public Mensagem proximaMensagem() {
        String[] linhaFatiada = fatiarLinha();
        if (linhaFatiada == null) {
            return null;
        }
        return new Mensagem(ferramentas.stringParaInt(linhaFatiada[0]), ferramentas.stringParaInt(linhaFatiada[1]), ferramentas.stringParaInt(linhaFatiada[2]), linhaFatiada[3], linhaFatiada[4], linhaFatiada[5]);
    }
}
