package com.mycompany.gft2ex2;
public class Diferenca {
    Hospedagem hu;
    HospedagemVIP vip;
    public float printDiferenca(){
        float diferenca = vip.valorFinal - hu.valorHumilde;
        System.out.println("A diferença de preço entre as diárias é de: " + diferenca);
        return diferenca;
    }
}