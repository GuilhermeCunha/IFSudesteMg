package ifsudestemgatvd1;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IfsudestemgAtvd1 {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        int indiceMaior=0;
        int indiceMenor=0;
        
        for (int i = 0; i < pessoas.length; i++) {
            
            pessoas[i] = new Pessoa();
            pessoas[i].setNome(JOptionPane.showInputDialog("Qual o nome da sua " + (i+1) + " pessoa"));
            pessoas[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da sua " + (i+1) + " pessoa")));
            if(i==0){
                indiceMaior=0;
                indiceMenor=0;
            }else{
                if(pessoas[i].getIdade() > pessoas[indiceMaior].getIdade()) indiceMaior = i;
                if(pessoas[i].getIdade() < pessoas[indiceMenor].getIdade()) indiceMenor = i;
            }

        }
        JOptionPane.showMessageDialog(null, "Mais velha: \n" + "Nome: " + pessoas[indiceMaior].getNome() + "\nIdade: " + pessoas[indiceMaior].getIdade());
        JOptionPane.showMessageDialog(null, "Mais nova: \n" + "Nome: " + pessoas[indiceMenor].getNome() + "\nIdade: " + pessoas[indiceMenor].getIdade());
    }
    
}
