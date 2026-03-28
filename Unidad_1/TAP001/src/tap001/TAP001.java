/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap001;

import static java.lang.Boolean.TRUE;
import javax.swing.JFrame;

/**
 *
 * @author yahir
 */
public class TAP001 extends JFrame {
    public TAP001 () {
        setTitle("Mi primera ventana");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(TRUE);
    }


    public static void main(String[] args) {
        new TAP001();
    }
    
}
