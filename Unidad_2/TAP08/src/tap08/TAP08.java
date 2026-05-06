/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap08;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;


public class TAP08 extends JFrame {
    
    public TAP08() {
        setTitle("Ejercicio 8: Control de Sistema");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setLocationRelativeTo(null);

        // 1. JSlider: Selección de rango mediante deslizamiento
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // 2. JProgressBar: Visualización de un estado de carga
        JProgressBar barra = new JProgressBar(0, 100);
        barra.setValue(50);
        barra.setForeground(Color.BLUE);
        barra.setStringPainted(true);

        // Evento: ChangeListener (específico para sliders)
        slider.addChangeListener(e -> {
            int valor = slider.getValue();
            barra.setValue(valor);
            setTitle("Ejercicio 8: Control de Sistema: " + valor + "%");
        });

        // Adición de componentes al frame
        add(new JLabel("Ajuste de Nivel:"));
        add(slider);
        add(barra);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecución en el hilo de despacho de eventos de Swing
            new TAP08();
    }
}