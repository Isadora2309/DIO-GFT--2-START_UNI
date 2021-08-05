package com.mycompany.gft2ex2;
public class Main {
    public static void main(String[] args) {
        Hospedagem h = new Hospedagem();
        HospedagemVIP v = new HospedagemVIP();
        Diferenca d = new Diferenca();
        System.out.println(h.printValor());
        System.out.println(v.printValor());
        //System.out.println(d.printDiferenca());
    }
}