package com.mycompany.gft2ex4;
public class Investimento {
    int valorInicial;
    private int jurosMensais;
    private int meses;

    public int getValorInicial() {
        return valorInicial;
    }

    public int getMeses() {
        return meses;
    }

    public Investimento(int valorInicial, int jurosMensais, int meses) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
        this.meses = meses;
    }
    
    public int calcularLucro(int meses, int valorInicial, int jurosMensais){
        int a = 1 + jurosMensais;
        double retorno = (valorInicial * Math.pow(a, meses)) - valorInicial;
        return (int) retorno;
    }
}