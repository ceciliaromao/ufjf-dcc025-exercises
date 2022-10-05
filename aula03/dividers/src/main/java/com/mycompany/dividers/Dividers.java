/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dividers;

import java.util.Scanner;

/**
 *
 * @author mariacecilia
 */
public class Dividers {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String option;
        
        do {
            System.out.println("Insira um valor inteiro");
            int div = 0;
            int value = key.nextInt();
            
            if (value < 0) value *= (-1);
            
            String list = "1";
            
            for(int i = 2; i <= value/2; i++) {
                if(value % i == 0){
                    div++;
                    list += (", "+i);
                }
            }
            list += (", "+value);
            
            if(div > 0){
                System.out.println(value+" não é primo");
                System.out.println("Dividores: "+list);
            } else {
                System.out.println(value+" é primo");
            }
            System.out.println("Deseja continuar? (S/N)");
            option = key.next();
            
        } while(option.toUpperCase().equals("S"));
        System.out.println("---App encerrado---");
    }
}
