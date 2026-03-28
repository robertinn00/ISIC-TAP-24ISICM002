/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap001.pkg3;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;
import static java.lang.Boolean.TRUE;

public class TAP0013 extends JFrame{
    public TAP0013 (){
        setTitle("Cambios_03");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.red);
        panelNorte.add(new JLabel("Cabecera"));
        
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(Color.white);
        panelCentro.add(new JLabel("Cuerpo"));
        
        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.blue);
        panelSur.add(new JLabel("Pie de pagina"));
        
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
        setVisible(TRUE);

}
    


    public static void main(String[] args) {
        new TAP0013();
    }
    
}
