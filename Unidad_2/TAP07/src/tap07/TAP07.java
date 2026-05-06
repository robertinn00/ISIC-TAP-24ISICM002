/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap07;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;

public class TAP07 extends JFrame {
    public TAP07() {
        setTitle("Ejercicio 7: Manejo de Componentes Graficos");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        String[] opciones = {"Pequeña ($50)", "Mediana ($80)", "Grande ($120)", "Doble Carne ($150)"};
        JComboBox<String> comboTamaño = new JComboBox<>(opciones);

        JCheckBox chkExtra = new JCheckBox("Queso Extra (+$15)");

        JRadioButton rbEfectivo = new JRadioButton("Efectivo", true);
        JRadioButton rbTarjeta = new JRadioButton("Tarjeta");
        ButtonGroup grupoPago = new ButtonGroup();
        grupoPago.add(rbEfectivo);
        grupoPago.add(rbTarjeta);

        JButton btnCalcular = new JButton("Calcular Total");
        
        btnCalcular.addActionListener(e -> {
            int total = 0;
            if(comboTamaño.getSelectedIndex() == 0) total += 50;
            if(comboTamaño.getSelectedIndex() == 1) total += 80;
            if(comboTamaño.getSelectedIndex() == 2) total += 120;
            if(comboTamaño.getSelectedIndex() == 3) total += 150;

            if(chkExtra.isSelected()) total += 15;
            
            String metodo = rbEfectivo.isSelected() ? "Efectivo" : "Tarjeta";
            
             if(rbEfectivo.isSelected()) {
                total = total - (total * 7 / 100);
            }
            
            JOptionPane.showMessageDialog(this, "Total: $" + total + "\nMétodo: " + metodo);
        });

        add(new JLabel(" Seleccione Tamaño:"));
        add(comboTamaño);
        add(chkExtra);
        JPanel pnlPago = new JPanel(); pnlPago.add(rbEfectivo); pnlPago.add(rbTarjeta);
        add(pnlPago);
        add(btnCalcular);

        setVisible(true);
    }


    public static void main(String[] args) {
        new TAP07();
    }
}