/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap004;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TAP004 extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnNegro, btnRosa, btnAmarillo;

    public TAP004() {
        setTitle("Manejo de Fuentes Multiples");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        panelPrincipal = new JPanel();
        panelPrincipal.setPreferredSize(new Dimension(350, 200));
        btnNegro = new JButton("Negro");
        btnRosa = new JButton("Rosa");
        btnAmarillo = new JButton("Amarillo");
        // Agregamos el mismo listener a los tres botones
        ActionListener manejador = e -> {
            Object fuente = e.getSource(); // Identificamos quién fue
            if (fuente == btnNegro) panelPrincipal.setBackground(Color.BLACK);
            if (fuente == btnRosa) panelPrincipal.setBackground(Color.PINK);
            if (fuente == btnAmarillo) panelPrincipal.setBackground(Color.YELLOW);
        };

        btnNegro.addActionListener(manejador);
        btnRosa.addActionListener(manejador);
        btnAmarillo.addActionListener(manejador);

        add(panelPrincipal);
        add(btnNegro);
        add(btnRosa);
        add(btnAmarillo);
        setVisible(true);
    }
        public static void main(String[] args) {
            new TAP004();
        }

}