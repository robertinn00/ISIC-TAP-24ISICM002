/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg02;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;

public class Practica02 extends JFrame {


     
    public Practica02 () {
        setTitle("Login");
        setSize(350, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Fondo
        getContentPane().setBackground(new Color(45, 45, 45));

        // Título
        JLabel lblTitulo = new JLabel("Inicio de Sesión");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitulo.setBounds(90, 30, 200, 30);
        lblTitulo.setForeground(Color.WHITE);
        add(lblTitulo);

        // Usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 90, 100, 20);
        add(lblUsuario);
        
        Font fuente = new Font("Segoe UI", Font.PLAIN, 14);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 110, 250, 30);
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setFont(fuente);
        add(txtUsuario);

        // Contraseña
        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(50, 160, 100, 20);
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(fuente);
        add(lblPassword);

        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(50, 180, 250, 30);
        add(txtPassword);

        // Botón
        JButton btnLogin = new JButton("Ingresar");
        btnLogin.setBounds(100, 240, 150, 35);
        btnLogin.setBackground(new Color(100, 100, 100));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(fuente);
        btnLogin.setFont(fuente);
        add(btnLogin);
        
        txtUsuario.addActionListener(e -> {
          txtPassword.requestFocus();
        });

        txtPassword.addActionListener(e -> {
           btnLogin.doClick();
        });

        // Icono sencillo
        JLabel icono = new JLabel();
        ImageIcon icon = new ImageIcon("src/user.png");
        Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono.setIcon(new ImageIcon(img));
        icono.setBounds(150, 300, 50, 50);
        add(icono);

        // Evento botón
        btnLogin.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String password = new String(txtPassword.getPassword());

            if (usuario.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        });
    }

    public static void main(String[] args) {
        new Practica02().setVisible(true);
    }

}