/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coins;

import java.util.Scanner;

/**
 *
 * @author mariacecilia
 */
public class Coins {

     public static void main(String[] args) {
        int c1, c5, c10, c25, c50, c100, cents;
        Scanner key = new Scanner(System.in);
        
        System.out.println("Digite a quantidade em centavos:");
        cents = key.nextInt();
        
        c100 = cents/100;
        cents %= 100;
        
        c50 = cents/50;
        cents %= 50;
        
        c25 = cents/25;
        cents %= 25;
        
        c10 = cents/10;
        cents %= 10;
        
        c5 = cents/5;
        cents %= 5;
        
        c1 = cents;
        
        System.out.println("Quantidade de moedas:");
        System.out.println(c100+" moedas de 1 real");
        System.out.println(c50+" moedas de 50 centavos");
        System.out.println(c25+" moedas de 25 centavos");
        System.out.println(c10+" moedas de 10 centavos");
        System.out.println(c5+" moedas de 5 centavos");
        System.out.println(c1+" moedas de 1 centavo");
    }
     
}
