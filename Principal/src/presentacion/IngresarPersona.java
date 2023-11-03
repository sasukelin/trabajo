package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends  JFrame {
    private JPanel pnlPrincipal;
    private JLabel IblCodigo;
    private JTextField txtCódigo;
    private JLabel IblNombre;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel Apellido;
    private JLabel lblIdioma;
    private JComboBox comboBox1;

    public IngresarPersona(){
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);

        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigo = txtCódigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String mensaje = "Tus datos son: \n" +
                        "Codigo" + codigo  + "\n" +
                        "Nombre" + nombre  + "\n" +
                        "Apellido" + apellido;


                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
