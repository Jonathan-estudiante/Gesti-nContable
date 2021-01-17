package com.istloja.vistas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class gestionpersona extends JFrame {

    private JPanel panel = new JPanel();
    SpringLayout layout = new SpringLayout();

    public gestionpersona() {

        this.show();
        this.setSize(1500, 800);
        this.setTitle("V E N T A N A " + " 1");
        panel.setBackground(Color.CYAN);
        panel.setLayout(layout);
        JLabel label1 = new JLabel("VENTANA DE REGISTRO DE PERSONAS");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel.add(label1);
        JLabel label2 = new JLabel(" CÉDULA: ");
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label2);
        JLabel label3 = new JLabel(" NOMBRES: ");
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label3);
        JLabel label4 = new JLabel(" APELLIDOS: ");
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label4);
        JLabel label5 = new JLabel(" DIRECCIÓN: ");
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label5);
        JLabel label6 = new JLabel(" CORREO: ");
        label6.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label6);
        JLabel label7 = new JLabel(" TELÉFONO: ");
        label7.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(label7);

        JTextField data1 = new JTextField("", 30);
        data1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data1);
        JTextField data2 = new JTextField("", 30);
        data2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data2);
        JTextField data3 = new JTextField("", 30);
        data3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data3);
        JTextField data4 = new JTextField("", 30);
        data4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data4);
        JTextField data5 = new JTextField("", 30);
        data5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data5);
        JTextField data6 = new JTextField("", 30);
        data6.setFont(new Font("Serif", Font.PLAIN, 20));
        panel.add(data6);

        JButton button1 = new JButton("Registrar Clientes");
        button1.setFont(new Font("Serif", Font.PLAIN, 23));
        panel.add(button1);
        JButton button2 = new JButton("Actualizar Clientes");
        button2.setFont(new Font("Serif", Font.PLAIN, 23));
        panel.add(button2);
        JButton button3 = new JButton("Eliminar Clientes");
        button3.setFont(new Font("Serif", Font.PLAIN, 23));
        panel.add(button3);

        //título 
        layout.putConstraint(SpringLayout.WEST, label1, 810, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label1, 55, SpringLayout.NORTH, panel);

        //etiqueta cedula
        layout.putConstraint(SpringLayout.WEST, label2, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label2, 150, SpringLayout.NORTH, panel);
        //etiqueta nombres
        layout.putConstraint(SpringLayout.WEST, label3, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label3, 200, SpringLayout.NORTH, panel);
        //etiqueta de apellidos
        layout.putConstraint(SpringLayout.WEST, label4, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label4, 250, SpringLayout.NORTH, panel);
        //etiqueta de direccion
        layout.putConstraint(SpringLayout.WEST, label5, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label5, 300, SpringLayout.NORTH, panel);
        //etiqueta de correo
        layout.putConstraint(SpringLayout.WEST, label6, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label6, 340, SpringLayout.NORTH, panel);
        //etiqueta de telefono
        layout.putConstraint(SpringLayout.WEST, label7, 780, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label7, 400, SpringLayout.NORTH, panel);

        //campo de texto de cedula
        layout.putConstraint(SpringLayout.WEST, data1, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data1, 150, SpringLayout.NORTH, panel);
        //campo de texto de nombres
        layout.putConstraint(SpringLayout.WEST, data2, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data2, 200, SpringLayout.NORTH, panel);
        //campo de texto de apellidos
        layout.putConstraint(SpringLayout.WEST, data3, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data3,250, SpringLayout.NORTH, panel);
        //campo de texto de direccion
        layout.putConstraint(SpringLayout.WEST, data4, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data4, 300, SpringLayout.NORTH, panel);
        //campo de texto de correo
        layout.putConstraint(SpringLayout.WEST, data5, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data5, 350, SpringLayout.NORTH, panel);
        //campo de texto de telefono
        layout.putConstraint(SpringLayout.WEST, data6, 150, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data6, 400, SpringLayout.NORTH, panel);

        //boton registrar clientes
        layout.putConstraint(SpringLayout.SOUTH, button1, 650, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button1, 600, SpringLayout.WEST, panel);
        //boton actualizar clientes
        layout.putConstraint(SpringLayout.SOUTH, button2, 650, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button2, 960, SpringLayout.WEST, panel);
        //boton eliminar clientes
        layout.putConstraint(SpringLayout.SOUTH, button3, 650, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button3, 1300, SpringLayout.WEST, panel);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
