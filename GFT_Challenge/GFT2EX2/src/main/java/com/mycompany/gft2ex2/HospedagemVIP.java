package com.mycompany.gft2ex2;
public class HospedagemVIP extends Hospedagem{
    private float valorVIP = (float) 149.99;
    float valorFinal = valorHumilde + valorVIP;
    @Override
    public float printValor(){System.out.println("O valor da hospedagem VIP é: " + valorFinal);return valorFinal;}
}
