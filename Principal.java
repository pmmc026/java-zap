public class Principal {
    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo("INSIRA O CAMINHO DO ARQUIVO AQUI");
        System.out.println(leitor.lerArquivo());
    }
}