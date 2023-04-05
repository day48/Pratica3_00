package br.com.carnaval;

public class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }
    public  String  imprimeIngresso () {
        return  "Ingresso Normal: " + getValor ();
    }

}