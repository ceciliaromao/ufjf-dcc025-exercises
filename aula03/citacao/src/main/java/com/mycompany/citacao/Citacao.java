/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.citacao;

import java.util.Scanner;

/**
 *
 * @author mariacecilia
 */
public class Citacao {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String iniciais = "";
        
        System.out.println("Entre com um nome completo: ");
        String nome = key.nextLine().trim();
        
        int inicio = 0;
        int fim = nome.indexOf(" ", inicio);
        
        while(fim != -1) {
            iniciais += nome.substring(inicio, inicio+1) + ". ";
            inicio = fim+1;
            fim = nome.indexOf(" ", inicio);
        }
        
        String sobrenome = nome.substring(inicio).toUpperCase();
        System.out.println(sobrenome+", "+iniciais.toUpperCase().trim());
    }
}
