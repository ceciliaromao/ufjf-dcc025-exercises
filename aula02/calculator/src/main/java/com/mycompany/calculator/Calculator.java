/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author mariacecilia
 */
public class Calculator {

    public static void main(String[] args) {
        double memory = 0;
        String[] options = {"+", "-", "*", "/"};

        String num1 = JOptionPane.showInputDialog("Informe o primeiro valor:");
        int operation = JOptionPane.showOptionDialog(null, "Escolha a operação desejada", "Operação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String num2 = JOptionPane.showInputDialog("Informe o segundo valor:");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        switch (operation) {
            case 0 ->
                memory = n1 + n2;
            case 1 ->
                memory = n1 - n2;
            case 2 ->
                memory = n1 * n2;
            case 3 ->
                memory = n1 / n2;
            default ->
                throw new AssertionError();
        }

        JOptionPane.showMessageDialog(null, memory);

        int continueApp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

        while (continueApp == 0) {
            operation = JOptionPane.showOptionDialog(null, "Escolha a próxima operação", "Operação", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            String num3 = JOptionPane.showInputDialog("Informe o próximo valor:");

            double n3 = Double.parseDouble(num3);
            
            switch (operation) {
                case 0 ->
                    memory += n3;
                case 1 ->
                    memory -= n3;
                case 2 ->
                    memory *= n3;
                case 3 ->
                    memory /= n3;
                default ->
                    throw new AssertionError();
            }
            
            JOptionPane.showMessageDialog(null, memory);
            continueApp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        }
    }
}
