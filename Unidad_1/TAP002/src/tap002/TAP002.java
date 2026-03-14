/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap002;

/**
 *
 * @author yahir
 */

import javax.swing.*;
import java.awt.*;
import static java.lang.Boolean.TRUE;

public class TAP002 extends JFrame{
    public TAP002 (){
        setTitle("Mi primera ventana");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.red);
        panelNorte.add(new JLabel("akdsjsdvn  osid vjwoid jcs oaijck  sodnviosnvjsd sodnvoisdjcioadn jsn siovnsion iosn sdionvioasjdqwiudcnasdkjc osidn iosj ios nsoinvsdiosncv sjf niosdnviosnjv iodn "));
        
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.white);
        panelCentro.add(new JLabel("Panel sur(cuerpo)"));
        
        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.blue);
        panelSur.add(new JLabel("Panel norte(encabezado)"));
        
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
        setVisible(TRUE);

}
    


    public static void main(String[] args) {
        new TAP002();
    }
    
}
