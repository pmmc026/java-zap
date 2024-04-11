/**
 * Classe de ferramentas de programação
 */
public class Ferramentas{
    /**
     * Método para converter string para inteiro sem deixar dar exceção
     * @param valor string a ser convertida
     * @return -1 se a string for nula ou caracter ou o número inteiro correspondente
     */
    public int stringParaInt(String valor){
        try {
            return Integer.parseInt(valor);
        } catch (Exception e) {
            return -1;
        }
    }
}