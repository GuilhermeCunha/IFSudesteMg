package ifsudestemgatvd4;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IfsudestemgAtvd4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setSaldoMedio(Double.parseDouble(JOptionPane.showInputDialog("Qual o seu saldo médio do ultimo ano?")));
        JOptionPane.showMessageDialog(null, cliente.consultaSaldo());
    }
    
}
