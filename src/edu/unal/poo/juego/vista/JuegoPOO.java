/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.juego.vista;

import javax.swing.JFrame;
import edu.unal.poo.juego.modelo.LecturaArchivo;

/**
 *
 * @author Juan David Correa
 */
public class JuegoPOO extends JFrame{

    public JuegoPOO(){
        initUI();
    }
    
    public void initUI(){
        add(new GameBoard());
        setSize(600,700);
        setTitle("Nivel 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        JuegoPOO ex = new JuegoPOO();
        ex.setVisible(true);
        
    }
    
}
