/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;

/**
 *
 * @author yahir
 */
import java.awt.*;
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Parcial2 extends JFrame implements ActionListener {

        //etiquetas
    JLabel lblNombre, lblPrecio, lblCantidad;
    
    //texto
    JTextField txtNombre, txtPrecio, txtCantidad;
    
    // botones
    JButton btnAgregar, btnLimpiar, btnSalir;
    public Parcial2 (){
        setTitle("Gestion de inventario-Roberto Yahir Hdz Almazan");
        
        setSize(700, 250);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel pDatos = new JPanel();
        pDatos.setLayout(new GridLayout(4, 2, 5, 5));
        
        lblNombre = new JLabel("Nombre del Producto: ");
        lblPrecio = new JLabel ("Precio: ");
        lblCantidad = new JLabel("Cantidad: ");
        
        txtNombre = new JTextField();
        txtPrecio = new JTextField();
        txtCantidad = new JTextField();
        
        btnAgregar = new JButton("Agregar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Salir");
        
        pDatos.add(lblNombre);
        pDatos.add(txtNombre);

        pDatos.add(lblPrecio);
        pDatos.add(txtPrecio);

        pDatos.add(lblCantidad);
        pDatos.add(txtCantidad);

        pDatos.add(btnAgregar);
        pDatos.add(btnLimpiar);
        pDatos.add(btnSalir);
        
        JTextArea area;

        JScrollPane scroll;
        area = new JTextArea();

        
        scroll = new JScrollPane(area);

        // Panel inferior
        JPanel panelInferior = new JPanel();

        panelInferior.add(btnSalir);
        

        // Agregar al frame
        add(pDatos, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Eventos
        //btnAgregar.addActionListener(this);
        //btnLimpiar.addActionListener(this);
        //btnSalir.addActionListener(this);

        setVisible(true);
        
        btnAgregar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            double precio = Double.parseDouble(txtPrecio.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double total = precio * cantidad;
            
            //System.out.println("Producto: " + nombre + "Precio: " + precio + "Cantidad: " + cantidad + "Total" + total);

    area.append(
        "Producto: " + nombre +
        " | Precio: " + precio +
        " | Cantidad: " + cantidad +
        " | Total: " + total + "\n"
    );

        });
        btnLimpiar.addActionListener(e -> {
            txtNombre.setText("");
            txtPrecio.setText("");
            txtCantidad.setText("");

            area.setText("");

            txtNombre.requestFocus();
        });
        btnSalir.addActionListener(e -> {

            System.exit(0);
        });
        
        
    }
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            new Parcial2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
