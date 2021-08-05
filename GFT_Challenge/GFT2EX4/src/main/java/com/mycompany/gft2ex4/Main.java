package com.mycompany.gft2ex4;
public class Main {
    public static void main(String[] args) {
        InvestimentoComIR novoIR = new InvestimentoComIR();
        novoIR.calcularLucro(17, 4000, (int) 1.2);
        InvestimentoSemIR velhoIR = new InvestimentoSemIR();
        velhoIR.calcularLucro(10, 2000, (int) 0.7);
    }
}