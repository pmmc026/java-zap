public class Mensagem {
    private int dia;
    private int hora;
    private String mes;
    private int mesNumerico;
    private String nome;
    private String dataCompleta;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private int indice;

    public Mensagem (int indice, int dia, int hora, String mes, int mesNumerico, String nome, String dataCompleta ){
        this.indice = indice;
        this.dia = dia;
        this.hora = hora;
        this.mes = mes;
        this.mesNumerico = mesNumerico;
        this.nome = nome;
        this.dataCompleta = dataCompleta;

    }
    public void converteMes(){
        if(mes.equals("January")){
            int mesNumerico = 1;
        }
        if(mes.equals("February")) {
            int mesNumerico = 2;
        }
        if(mes.equals("March")) {
            int mesNumerico = 3;
        }
        if(mes.equals("April")) {
            int mesNumerico = 4;
        }
        if(mes.equals("May")) {
            int mesNumerico = 5;
        }
        if(mes.equals("June")) {
            int mesNumerico = 6;
        }
        if(mes.equals("July")) {
            int mesNumerico = 7;
        }
        if(mes.equals("August")) {
            int mesNumerico = 8;
        }
        if(mes.equals("September")) {
            int mesNumerico = 9;
        }
        if(mes.equals("October")) {
            int mesNumerico = 10;
        }
        if(mes.equals("November")) {
            int mesNumerico = 11;
        }
        if(mes.equals("December")) {
            int mesNumerico = 12;
        }
    }
    public void exibirMensagem(){
        System.out.print("Dia: " + getDia() + "\n");
        System.out.print("Hora: " + getHora() + "\n");
        System.out.print("Mes: " + getMes() + "\n");
        System.out.print("Nome " + getNome() + "\n");
        System.out.print("Data " + getDataCompleta() + "\n");
    }
    public int getHora() {
        return hora;
    }

    public Mensagem(int dia) {
        this.dia = dia;
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
    public String getDataCompleta() {
        return dataCompleta;
    }

    public void setDataCompleta(String dataCompleta) {
        this.dataCompleta = dataCompleta;
    }
}
