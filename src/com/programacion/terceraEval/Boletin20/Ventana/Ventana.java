package Ventana;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana {

    JFrame marco;
    JPanel panel1, panel2;
    JButton bLimpar, bPremer, bBoton;
    JLabel etqNome, etqPassword;
    JTextField lTextNome, lTextPassword;
    JTextArea areaTexto;
    JList textoLista;
    DefaultListModel modeloLista;

    public void programa(){
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        textoLista = new JList();
        modeloLista = new DefaultListModel();
        bLimpar = new JButton("Limpiar");
        bPremer = new JButton("Pulsar");
        bBoton = new JButton("Boton");
        lTextNome = new JTextField();
        lTextPassword = new JTextField();
        areaTexto = new JTextArea();
        etqNome = new JLabel("NOMBRE:");
        etqPassword = new JLabel("CONTRASEÑA:");

        //marco
        marco.setSize(750,750);
        marco.add(panel1);
        marco.add(panel2);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        //panel de arriba
        panel1.setSize(750, 350);
        panel1.setBorder(BorderFactory.createMatteBorder(1, 1, 1,1, Color.black));
        panel1.setLayout(null);
        bPremer.setBounds(200, 270, 100, 50);
        bPremer.setText("Pulsar");
        bPremer.setToolTipText("Copia lo que escribimos en la línea de texto en el área de texto");
        bLimpar.setBackground(Color.green);
        bLimpar.setBounds(500, 270, 100, 50);
        etqPassword.setBounds(50, 75, 100, 200);
        lTextNome.setBounds(300, 75, 300, 50);
        lTextPassword.setBounds(300, 150, 300, 50);
        etqNome.setBounds(50, 25, 100, 150);


        //panel de abajo
        panel2.setSize(750, 400);
        panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1,1, Color.black));
        panel2.setLayout(null);
        bBoton.setBounds(300, 500, 100, 50);
        bBoton.setText("Botón");
        areaTexto.setBounds(450, 400, 200, 250);
        areaTexto.setBackground(Color.blue);
        textoLista.setBounds(50, 400, 200, 250);
        textoLista.setBackground(Color.lightGray);
        modeloLista.addElement("1 Elemento");
        modeloLista.addElement("2 Elemento");
        modeloLista.addElement("3 Elemento");
        textoLista.setModel(modeloLista);


        panel1.add(bLimpar);
        panel1.add(etqNome);
        panel1.add(etqPassword);
        panel1.add(lTextNome);
        panel1.add(lTextPassword);
        panel1.add(bPremer);
        panel2.add(areaTexto);
        panel2.add(bBoton);
        panel2.add(textoLista);
    }
}