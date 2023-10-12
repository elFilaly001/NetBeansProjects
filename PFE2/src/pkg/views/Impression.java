/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.views;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Impression extends JFrame{

    public Impression() {
        setTitle("Impression du Contrat");
        setVisible(true);
        setBounds(250, 50, 800, 600);
    }
    
    public static void main(String args[]) {
        new Impression();
    }
    
}
