/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg01;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Practica01 extends JFrame {

    // Campos de texto
    JTextField txtRadio, txtBase, txtAltura;

    public Practica01() {
        setTitle("Calculadora de Áreas");
        setSize(450, 550);
        getContentPane().setBackground(new Color(30, 30, 30));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Etiquetas
        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 50, 100, 30);
        add(lblRadio);

        txtRadio = new JTextField();
        txtRadio.setBounds(200, 50, 200, 30);
        lblRadio.setForeground(Color.WHITE);
        add(txtRadio);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 100, 100, 30);
        add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(200, 100, 200, 30);
        lblBase.setForeground(Color.WHITE);
        add(txtBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 150, 100, 30);
        lblAltura.setForeground(Color.WHITE);
        add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(200, 150, 200, 30);
        add(txtAltura);

        // Botones
        JButton btnCirculo = new JButton("Área Círculo");
        btnCirculo.setBounds(150, 220, 200, 40);
        btnCirculo.setBackground(new Color(70, 130, 180));
        btnCirculo.setForeground(Color.WHITE); 
        add(btnCirculo);

        JButton btnTriangulo = new JButton("Área Triángulo");
        btnTriangulo.setBounds(150, 280, 200, 40);
        btnTriangulo.setBackground(new Color(70, 130, 180));
        btnTriangulo.setForeground(Color.WHITE); 
        add(btnTriangulo);

        JButton btnRectangulo = new JButton("Área Rectángulo");
        btnRectangulo.setBounds(150, 340, 200, 40);
        btnRectangulo.setBackground(new Color(70, 130, 180));
        btnRectangulo.setForeground(Color.WHITE); 
        add(btnRectangulo);

        // EVENTOS

        // CÍRCULO
        btnCirculo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double radio = Double.parseDouble(txtRadio.getText());
                    double area = Math.PI * radio * radio;

                    JOptionPane.showMessageDialog(null, "Área del círculo: " + area);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido en radio");
                }
            }
        });

        // TRIÁNGULO
        btnTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(txtBase.getText());
                    double altura = Double.parseDouble(txtAltura.getText());
                    double area = (base * altura) / 2;

                    JOptionPane.showMessageDialog(null, "Área del triángulo: " + area);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa números válidos en base y altura");
                }
            }
        });

        // RECTÁNGULO
        btnRectangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(txtBase.getText());
                    double altura = Double.parseDouble(txtAltura.getText());
                    double area = base * altura;

                    JOptionPane.showMessageDialog(null, "Área del rectángulo: " + area);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingresa números válidos en base y altura");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Practica01().setVisible(true);
    }
}