/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap001;

/**
 *
 * @author yahir
 */


import java.awt.Color;
import javax.swing.JFrame;

public class TAP001 extends JFrame {
    public TAP001() {
        // 1. Define el texto que aparece en la barra superior
        setTitle("Actividad 2"); 
        
        // 2. Define el ancho y alto inicial en píxeles
        setSize(800, 600); 
        
        // 3. Indica que la aplicación debe cerrarse al presionar la 'X'
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        getContentPane().setBackground(Color.BLUE);
        
        // 4. Si el parámetro es 'null', la ventana aparece centrada en la pantalla
        setLocationRelativeTo(null); 
        
        // 5. Por defecto las ventanas nacen invisibles. Este paso es obligatorio.
        setVisible(true); 
    }

    public static void main(String[] args) {
        new TAP001();
    }
}