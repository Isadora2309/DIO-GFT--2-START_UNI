package com.mycompany.gft2ex3;

import java.util.Scanner;

public class Function extends Info {
    Info i;
    public int verifyDate(){
        if (i.getDayDate() > 31 || i.getDayDate() <= 0){
            System.out.println("Opa! Esse dia não é válido!");
        } else {
            System.out.println("Dia: " + i.getDayDate());
        }
        return i.getDayDate();
    }
    public int verifyMonth(){
        if (i.getMonthDate() > 13 || i.getMonthDate() <= 0){
            System.out.println("Opa! Esse mês não é válido!");
        } else {
            System.out.println("Mês: " + i.getMonthDate());
        }
        return i.getMonthDate();
    }
    public int verifyYear(){
        if (i.getYearDate() > 2020 || i.getYearDate() <= 0){
            System.out.println("Opa! Esse ano não é válido!");
        } else {
            System.out.println("Ano: " + i.getYearDate());
        }
        return i.getYearDate();
    }
    public static Info getInfo(){
        Scanner object = new Scanner(System.in);
        System.out.println("Insira o dia do seu nascimento: ");
        int dayDate = Integer.parseInt(object.nextLine());
        System.out.println("Insira o mês do seu nascimento: ");
        int monthDate = Integer.parseInt(object.nextLine());
        System.out.println("Insira o ano do seu nascimento: ");
        int yearDate = Integer.parseInt(object.nextLine());
        
        Info infoCatch = new Info(dayDate, monthDate, yearDate);
        
        return infoCatch;
    }
}