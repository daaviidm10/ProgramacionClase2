package Ventana;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dmama
 */
public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton bLimpar, bPremer;
    JLabel etqNome, etqPassword;
    JTextField lTextNome, lTextPassword;
    JTextArea areaTexto;

    public void programa(){
        marco = new JFrame();
        panel = new JPanel();
        bLimpar = new JButton("Limpiar");
        bPremer = new JButton("Pulsar");
        lTextNome = new JTextField();
        lTextPassword = new JTextField();
        etqNome = new JLabel("NOMBRE:");
        etqPassword = new JLabel("CONTRASEÑA:");
        areaTexto = new JTextArea();

        //tipografía de nuestro recuardro
        marco.setSize(750,600);
        panel.setSize(750, 750);
        panel.setLayout(null); //anulamos el layout del panel
        bLimpar.setBackground(Color.green);
        bLimpar.setBounds(500, 400, 100, 50);
        bPremer.setBounds(200, 400, 100, 50);
        bPremer.setText("Pulsar");
        bPremer.setToolTipText("Copia lo que escribimos en la línea de texto en el área de texto");
        lTextNome.setBounds(300, 75, 300, 50);
        lTextPassword.setBounds(300, 150, 300, 50);
        areaTexto.setBounds(150, 250, 450, 100);
        areaTexto.setBackground(Color.blue);
        etqNome.setBounds(50, 25, 100, 150);
        etqPassword.setBounds(50, 75, 100, 200);

        panel.add(lTextNome);
        panel.add(lTextPassword);
        panel.add(areaTexto);
        panel.add(bPremer);
        panel.add(bLimpar);
        panel.add(etqNome);
        panel.add(etqPassword);

        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}


