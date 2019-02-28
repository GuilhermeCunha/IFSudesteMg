package ifsudestemgatvd2;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IfsudestemgAtvd2 {

    public static void main(String[] args) {
        CustoCarro custoCarro = new CustoCarro();
        custoCarro.setCustoCarro(Double.parseDouble(JOptionPane.showInputDialog("Qual o custo do carro?")));
        
        JOptionPane.showMessageDialog(null, "O valor total do carro é: " + custoCarro.getCustoTotal());
    }
    
}
