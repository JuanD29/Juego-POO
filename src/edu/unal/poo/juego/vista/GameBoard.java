/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.juego.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import edu.unal.poo.juego.modelo.ArchivoJuegoPOO;
import edu.unal.poo.juego.modelo.LecturaArchivo;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan David Correa
 */
public class GameBoard extends JPanel implements ActionListener,MouseListener {

    private Timer timer;
    private int x;
    private int y;
    private int[][] mapa;

    public GameBoard() {
        ArchivoJuegoPOO archivo = new LecturaArchivo();
        mapa = archivo.cargar("Nivel3.txt");
        this.timer = new Timer(1, this);
        this.x = 0;
        setFocusable(true);
        this.timer.start();
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color (255,255,255));
        
        ImageIcon ii = new ImageIcon("fondoNivel1.jpg");
        Image imagen = ii.getImage();
        g.drawImage(imagen, 0, 0, null);
        g.setColor(Color.RED);
        g.fillOval(285, 600, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(285, 600, 30, 30);
        
        int conti = 1;
        int contj = 1;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 0) {                   
                } else if (mapa[i][j] == 1) {
                    g.setColor(Color.ORANGE);
                    g.fillRect(j * 40, conti * 40, 30, 30); 
                    g.setColor(Color.BLACK);
                    g.drawRect(j * 40, conti * 40, 30, 30);
                } else if (mapa[i][j] == 2) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(j * 40, conti * 40, 30, 30);
                    g.setColor(Color.BLACK);
                    g.drawRect(j * 40, conti * 40, 30, 30);
                } else if (mapa[i][j] == 3){
                    g.setColor(Color.BLUE);
                    g.fillRect(j * 40, conti * 40, 30, 30); 
                    g.setColor(Color.BLACK);
                    g.drawRect(j * 40, conti * 40, 30, 30);
                } else if (mapa[i][j] == 4){
                    g.setColor(Color.RED);
                    g.fillRect(j * 40, conti * 40, 30, 30);
                    g.setColor(Color.BLACK);
                    g.drawRect(j * 40, conti * 40, 30, 30);
                } else if (mapa[i][j] == 5){
                    g.setColor(Color.GRAY);
                    g.fillRect(j * 40, conti * 40, 30, 30);
                    g.setColor(Color.BLACK);
                    g.drawRect(j * 40, conti * 40, 30, 30);
                }
                
                
            }
            conti++;
            
        }
        //contadorj++;

        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
