package ifsudestemgatvd3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IfsudestemgAtvd3 {


    public static void main(String[] args) {
        int y=0;
        int i=-1;
        Double contConsulta=0.0;
        Double porcentConsulta;
        int indiceMaior=0;
        ArrayList<Cartao> cartoes = new ArrayList();
        Cartao[] cartao = new Cartao[10];
        Habitante[] habitante = new Habitante[10];
        do{
            i++;
            habitante[i] = new Habitante();
            cartao[i] = new Cartao();
            Object [] opcoes = {"Masculino" ,"Feminino"};
            String option = (String) JOptionPane.showInputDialog(null, "Qual o sexo do seu " + (i+1) + " habitante?","Sexo: ",JOptionPane.PLAIN_MESSAGE,null, opcoes, "Masculino");
            switch (option){
                case "Masculino":
                    habitante[i].setSexo(option);
                    break;
                case "Feminino":
                    habitante[i].setSexo(option);
                    break;
            }
            Object [] opcoes2 = {"Azuis" , "Verdes", "Castanhos"};
            option = (String) JOptionPane.showInputDialog(null, "Qual a cor dos olhos do seu " + (i+1) + " habitante?","Cor dos olhos: ",JOptionPane.PLAIN_MESSAGE,null, opcoes2, "Azuis");
            
            switch (option){
                case "Azuis":
                    habitante[i].setCorDosOlhos(option);
                    break;
                case "Verdes":
                    habitante[i].setCorDosOlhos(option);
                    break;
                case "Castanhos":
                    habitante[i].setCorDosOlhos(option);
                    break;
            } 
            Object [] opcoes3 = {"Louros" , "Castanhos", "Pretos"};
            option = (String) JOptionPane.showInputDialog(null, "Qual a cor dos cabelos do seu " + (i+1) + " habitante?","Cor dos cabelos: ",JOptionPane.PLAIN_MESSAGE,null, opcoes3, "Louros");
            
            switch (option){
                case "Louros":
                    habitante[i].setCorDosCabelos(option);
                    break;
                case "Castanhos":
                    habitante[i].setCorDosCabelos(option);
                    break;
                case "Pretos":
                    habitante[i].setCorDosCabelos(option);
                    break;
            }
            habitante[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu " + (i+1) + " habitante")));
            cartao[i].setHabitante(habitante[i]);
            cartoes.add(cartao[i]);
            if((habitante[i].getSexo().equals("Feminino")) && (habitante[i].getIdade() >=18) && (habitante[i].getIdade() <35) && (habitante[i].getCorDosOlhos().equals("Verdes")) && (habitante[i].getCorDosCabelos().equals("Louros"))) contConsulta++; 
            
            if(i==0){
                indiceMaior=0;
            }else{
                if(cartao[i].getHabitante().getIdade() > cartao[indiceMaior].getHabitante().getIdade()) indiceMaior = i;
            }
        }while(cartao[i].getHabitante().getIdade()!= (-1));
        JOptionPane.showMessageDialog(null, "A maior idade entre os habitantes é de : " + cartoes.get(indiceMaior).getHabitante().getIdade());
        porcentConsulta = (((contConsulta)/(cartoes.size()-1))*100);
        JOptionPane.showMessageDialog(null, "A porcentagem é: " + porcentConsulta + "%");
        
        
        
        
    }
    
}
