/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tao09;

/**
 *
 * @author yahir
 */
import javax.swing.*;
import java.awt.*;

public class TAO09 extends JFrame {
    
    public TAO09() {
        setTitle("Lista de Tareas");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // El JList necesita un 'Model' para poder añadir/quitar elementos en tiempo real
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.addElement("Estudiar TAP");
        modelo.addElement("Hacer commit en GitHub");
        modelo.addElement("Revisar rúbricas");
        
        JList<String> lista = new JList<>(modelo);
        //  JList no tiene scroll por sí solo así que lo envolvemos en un JScrollPane
        add(new JScrollPane(lista), BorderLayout.CENTER); 

        JPanel pnlAcciones = new JPanel();
        JTextField txtTarea = new JTextField(12);
        JButton btnAdd = new JButton("+");
        JButton btnDel = new JButton("-");

        // Tooltips para mejorar la experiencia de usuario (UX)
        btnAdd.setToolTipText("Agregar tarea");
        btnDel.setToolTipText("Eliminar tarea seleccionada");

        // Acción para agregar elementos
        btnAdd.addActionListener(e -> {
            String nuevaTarea = txtTarea.getText().trim();
            if(!nuevaTarea.isEmpty()) {
                modelo.addElement(nuevaTarea);
                txtTarea.setText("");
                txtTarea.requestFocus();
                setTitle("Lista de Tareas (" + modelo.size() + " tareas)");

    }
});
        
        txtTarea.addActionListener(e -> {
            String nuevaTarea = txtTarea.getText().trim();
            if(!nuevaTarea.isEmpty()) {
                modelo.addElement(nuevaTarea);
                txtTarea.setText(""); // Limpiar campo después de agregar
                txtTarea.requestFocus();
                setTitle("Lista de Tareas (" + modelo.size() + " tareas)");

            }
        });

        // Acción para eliminar elementos seleccionados
        btnDel.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if(index != -1) {
                modelo.remove(index);
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona un elemento para borrar");
            }
        });

        pnlAcciones.add(txtTarea); 
        pnlAcciones.add(btnAdd); 
        pnlAcciones.add(btnDel);
        
        add(pnlAcciones, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TAO09().setVisible(true);
        });
    }
}