package br.com.veiculo;

public class Onibus   extends  Veiculo{
    private  int assentos;

    public Onibus(String placa, int assentos) {
        super(placa);
        this.assentos = assentos;
    }

    public Onibus(int ano, int assentos) {
        super(ano);
        this.assentos = assentos;
    }

    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}