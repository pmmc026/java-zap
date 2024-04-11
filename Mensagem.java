/**
 *
 * Classe responsável por gerar objetos que representem uma mensagem.
 *
 *
 */

public class Mensagem {
    private int dia;
    private int hora;
    private String mes;
    private int mesNumerico;
    private String nome;
    private String dataCompleta;
    private int indice;

    /**
     *
     * Construtor da classe Mensagem.
     * */
    public Mensagem (int indice, int dia, int hora, String mes, String nome, String dataCompleta) {
        this.indice = indice;
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
        this.mesNumerico = converteMes(this.mes);
        this.nome = nome;
        this.dataCompleta = dataCompleta;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMesNumerico() {
        return mesNumerico;
    }

    public void setMesNumerico(int mesNumerico) {
        this.mesNumerico = mesNumerico;
    }

    public String getDataCompleta() {
        return dataCompleta;
    }

    public void setDataCompleta(String dataCompleta) {
        this.dataCompleta = dataCompleta;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }


    /**
     *
     * Classe que converte o valor String de cada mês para o valor númerico correspondente (Exemplo: Maio = 5).
     * @param mes O valor em String do mês.
     * @return retorna o valor numérico.
     */
    public int converteMes(String mes){
        int mesNumerico = 0;
        if(mes.equals("January")){
            mesNumerico = 1;
        }
        if(mes.equals("February")) {
            mesNumerico = 2;
        }
        if(mes.equals("March")) {
            mesNumerico = 3;
        }
        if(mes.equals("April")) {
            mesNumerico = 4;
        }
        if(mes.equals("May")) {
            mesNumerico = 5;
        }
        if(mes.equals("June")) {
            mesNumerico = 6;
        }
        if(mes.equals("July")) {
            mesNumerico = 7;
        }
        if(mes.equals("August")) {
            mesNumerico = 8;
        }
        if(mes.equals("September")) {
            mesNumerico = 9;
        }
        if(mes.equals("October")) {
            mesNumerico = 10;
        }
        if(mes.equals("November")) {
            mesNumerico = 11;
        }
        if(mes.equals("December")) {
            mesNumerico = 12;
        }
        return mesNumerico;
    }

    /**
     *
     *
     * Exibe as informações completas do objeto.
     *
     */
    public void exibirInfo(){
        System.out.print("Dia: " + getDia() + "\n");
        System.out.print("Hora: " + getHora() + "\n");
        System.out.print("Mês: " + getMes() + " - " + getMesNumerico() + "\n");
        System.out.print("Nome: " + getNome() + "\n");
        System.out.print("Data: " + getDataCompleta() + "\n");
        System.out.println();
    }

}
