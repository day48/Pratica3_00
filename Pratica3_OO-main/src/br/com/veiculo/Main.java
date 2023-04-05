package br.com.veiculo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        String opcao = JOptionPane.showInputDialog("Digite a quantidade de assentos");
        onibus.setAssentos(Integer.parseInt(opcao));




    }
}
