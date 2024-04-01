import java.io.File;
import java.io.FileInputStream;

public class LeitorArquivo {

    private String diretorioArquivo;

    public LeitorArquivo(String diretorioArquivo) {

        this.diretorioArquivo = diretorioArquivo;

    }

    public String getDiretorioArquivo() {
        return diretorioArquivo;
    }

    public void setDiretorioArquivo(String diretorioArquivo) {
        this.diretorioArquivo = diretorioArquivo;
    }

    public StringBuilder lerArquivo() {
        StringBuilder textoDoArquivo = new StringBuilder();
        try {
            FileInputStream entradaDeDados = new FileInputStream(diretorioArquivo);
            int leitura = entradaDeDados.read();
            while(leitura != -1) {
                textoDoArquivo.append((char) leitura);
                leitura = entradaDeDados.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return textoDoArquivo;
    }


}
