package com.mycompany.gft2ex4;
public class InvestimentoSemIR extends Investimento {
    public int calcularLucro(int valorInicial){
        if (valorInicial < 1000){
            System.out.println("O valor não pode ser menor que R$ 1.000");}
        return 0;
    }
}