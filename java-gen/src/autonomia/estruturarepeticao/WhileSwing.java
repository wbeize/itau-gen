package autonomia.estruturarepeticao;

import javax.swing.*;

public class WhileSwing {
    public static void main(String[] args) {
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html><em>0 interrompe.</em><br>Sabendo disso, informe um número:</html>"));
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null,
                "<html>A soma de todos os números é:<br><br><hr> = " + s + "</html>");
    }
}
