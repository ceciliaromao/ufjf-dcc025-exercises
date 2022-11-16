/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sum;

import javax.swing.JOptionPane;

/**
 *
 * @author mariacecilia
 */
public class Sum {

    public static void main(String[] args) {
        String num1, num2;
        int n1, n2;
        num1 = JOptionPane.showInputDialog("Informe o primeiro valor:");
        num2 = JOptionPane.showInputDialog("Informe o segundo valor:");
        
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        
        JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+(n1+n2));
    }
}
