package com.mycompany.gft2ex4;
public class InvestimentoComIR extends Investimento{
    public int calcularLucro(int meses){
        if(meses < 6){
            int a = (int) (1 + 0.225);
            double retorno = (valorInicial * Math.pow(a, meses)) - valorInicial;
            return (int) retorno;
        } else if (meses >= 6 && meses <12){
            int a = (int) (1 + 0.20);
            double retorno = (valorInicial * Math.pow(a, meses)) - valorInicial;
        } else if (meses >= 12 && meses < 24){
            int a = (int) (1 + 0.175);
            double retorno = (valorInicial * Math.pow(a, meses)) - valorInicial;
        } else if (meses >= 24){
            int a = (int) (1 + 0.15);
            double retorno = (valorInicial * Math.pow(a, meses)) - valorInicial;
        }
        return meses;
    }
}