public class Principal {
    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo("C:\\Users\\paulo\\Documents\\traducaogpt.txt");
        System.out.println(leitor.lerArquivo());
    }
}