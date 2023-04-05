package br.com.veiculo;

public class Caminhao  extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int eixos) {
        super(placa);
        this.eixos = eixos;
    }

    public Caminhao(int ano, int eixos) {
        super(ano);
        this.eixos = eixos;
    }

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados() {
        super.exibirDados();
    }
}
