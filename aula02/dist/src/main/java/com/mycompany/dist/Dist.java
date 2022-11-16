/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dist;

import javax.swing.JOptionPane;

/**
 *
 * @author mariacecilia
 */
public class Dist {

    public static void main(String[] args) {
        String pA, pB;
        
        pA = JOptionPane.showInputDialog("Informe as coordenadas do ponto A: (x, y)");
        pB = JOptionPane.showInputDialog("Informe as coordenadas do ponto B: (x, y)");
        
        int xABegin = pA.indexOf("(");
        int xAEnd = pA.indexOf(",", xABegin+1);
        String xAString = pA.substring(xABegin+1, xAEnd);
        double xA = Double.parseDouble(xAString);
        
        int yABegin = pA.indexOf(" ", xAEnd+1);
        int yAEnd = pA.indexOf(")", yABegin+1);
        String yAString = pA.substring(yABegin+1, yAEnd);
        double yA = Double.parseDouble(yAString);
        
        int xBBegin = pB.indexOf("(");
        int xBEnd = pB.indexOf(",", xBBegin+1);
        String xBString = pB.substring(xBBegin+1, xBEnd);
        double xB = Double.parseDouble(xBString);
        
        int yBBegin = pB.indexOf(" ", xBEnd+1);
        int yBEnd = pB.indexOf(")", yBBegin+1);
        String yBString = pB.substring(yBBegin+1, yBEnd);
        double yB = Double.parseDouble(yBString);
        
        double diffX = Math.abs(xB - xA);
        double diffY = Math.abs(yB - yA);
        
        double powDiffX = Math.pow(diffX, 2);
        double powDiffY = Math.pow(diffY, 2);
        
        double dist = Math.sqrt(powDiffX + powDiffY);
        
        JOptionPane.showMessageDialog(null, "A distancia entre " + pA + " e " + pB + " eh de " + dist);
    }
}
