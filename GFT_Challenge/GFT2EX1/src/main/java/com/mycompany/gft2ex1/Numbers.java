package com.mycompany.gft2ex1;

import java.util.Scanner;

public class Numbers {
    public void countPar(int number){
        Scanner object = new Scanner(System.in);
        System.out.println("Insira um número de quatro dígitos: ");
        int n = Integer.parseInt(object.nextLine());
        int numPar = 0;
        while (n >= 1000 && n <= 9999){
            int rem = n % 10;
            if (rem % 2 == 0){numPar++;
            System.out.println ( "Dígitos Pares : " + numPar);
            break;
            }
        }
    }   
}