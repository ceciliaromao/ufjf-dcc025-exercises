/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hello;
import javax.swing.JOptionPane;
/**
 *
 * @author mariacecilia
 */
public class Hello {

    public static void main(String[] args) {
        String username;
        username = JOptionPane.showInputDialog("Informe seu nome:");
        
        JOptionPane.showMessageDialog(null, "Olá, "+username.toUpperCase().replace(" ", "_"));
    }
}
