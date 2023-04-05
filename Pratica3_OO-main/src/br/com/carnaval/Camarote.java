package br.com.carnaval;

public class Camarote extends Ingresso {
    private String localização;
    private double valorAdicional;
    public Camarote(double valorIngresso,String localização,double valorAdicional) {
        super(valorIngresso);
        this.localização= localização ;
        this.valorAdicional = valorAdicional ;
    }

    public  String  getLocalização () {
        return  localização ;
    }

    public  void  setLocalização ( String  localização ) {
        this.localização = localização ;
    }

    public  double  getValorAdicional () {
        return  valorAdicional ;
    }

    public  void  setValorAdicional ( double  valorAdicional ) {
        this. valorAdicional = valorAdicional ;
    }

    public  String  imprimeIngresso ()
    {
        return  "Ingresso Camarote: " + ( getValor () + getValorAdicional ()) + "\n" + getLocalização ();
    }

}