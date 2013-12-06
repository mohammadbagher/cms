/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

import javax.swing.UIManager;

/**
 *
 * @author Bagher
 */
public class OOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch(Exception e) {
  System.out.println("Error setting native LAF: " + e);
}
    }
}
