
package edd;
import javax.swing.JOptionPane;
public class Menu {
    public int executarMenu(){
    String opcoes[] = {"Questão 1", "Questão 2", "Questão 3", "Questão 4", "Questão 5", "Questão 6", "Questão 7", "Sair"};
     int opcao =    JOptionPane.showOptionDialog(null, "Escolha uma opção:", "MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
     return opcao;
    }public void escreverResposta(String a){
        JOptionPane.showMessageDialog(null, a);   
    }
}
