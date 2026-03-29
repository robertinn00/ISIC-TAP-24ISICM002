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
        setTitle("Cambios_02");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.BLUE);
        panelNorte.add(new JLabel("Cabecera"));
        
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.GRAY);
        panelCentro.add(new JLabel("Cuerpo"));
        
        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.GREEN);
        panelSur.add(new JLabel("Pie de pagina"));
        
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
        setVisible(TRUE);

}
    


    public static void main(String[] args) {
        new TAP002();
    }
    
}
