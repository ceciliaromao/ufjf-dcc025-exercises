/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atribuicoes;

/**
 *
 * @author mariacecilia
 */
public class Atribuicoes {

    public static void main(String[] args) {
        float x = 1.0f;
        float y = 2.0f;
        float z = 3.0f;
        
        x = -x;
        y = y - 1;
        z = z + x;
        z = z + x - y;
        System.out.println("x = "+x+", y = "+y+", z = "+z);
    }
}
