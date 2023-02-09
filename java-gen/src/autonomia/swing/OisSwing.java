package autonomia.swing;

import javax.swing.*;

public class OisSwing extends JFrame {
    private JButton btnClick;
    private JLabel lblMensagem;

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {
        lblMensagem.setText("Olá, Mundo! :)");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OisSwing().setVisible(true);
            }
        });
    }

}
