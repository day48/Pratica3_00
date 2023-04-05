package br.com.carnaval;

public class Vip  extends  Ingresso {
    private double valorAdicioanal;

    public Vip(double valorIngresso, double valorAdicioanal) {
        super(valorIngresso);
        this.valorAdicioanal = valorAdicioanal;
    }

    public double getValorAdicioanal() {
        return valorAdicioanal;

    }

    public String imprimeIngresso() {
        return "Ingresso vip : " + (getvalorIngresso() + getValorAdicioanal());
    }

    private String getvalorIngresso() {


        return null;
    }
}