
package edd;

import java.util.Random;
import javax.swing.JOptionPane;
public class EDD {
  public static void main(String[] args){ 
    Lista1 lista1 =  new Lista1();
    Lista2 lista2 = new Lista2();
    RendDoInvestimento janela = new RendDoInvestimento();
    Menu menu1 = new Menu();
    int aux1 = 1, aux2 = 1, aux3 = 0, aux;
        do{
            String menu[] = {"Lista 1","Lista 2", "Sair"};
            int option = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, null);
            if(option == JOptionPane.YES_OPTION){
                do{
                     aux = menu1.executarMenu();
                     if(aux == JOptionPane.YES_OPTION)//q1
                        menu1.escreverResposta(lista1.q1);
                     else if(aux == JOptionPane.NO_OPTION)//q2
                        menu1.escreverResposta(lista1.q2);
                     else if(aux == JOptionPane.CANCEL_OPTION)//q3
                        lista1.tempo();
                    else if(aux == JOptionPane.CANCEL_OPTION+1)//q4
                       lista1.fatoracao();
                      else if(aux == JOptionPane.CANCEL_OPTION+2)//q5
                         lista1.numeroPI();
                    else if(aux == JOptionPane.CANCEL_OPTION+3)//q6
                         lista1.segundoGrau();
                     else if(aux == JOptionPane.CANCEL_OPTION+4)//q7
                         janela.main();
                     else 
                        aux1 = 0;                
                    }while(aux1 !=0);
                }else if(option == JOptionPane.NO_OPTION){
                    do{
                     aux = menu1.executarMenu();
                     if(aux == JOptionPane.YES_OPTION)//q1
                        menu1.escreverResposta(lista2.q1);
                     else if(aux == JOptionPane.NO_OPTION)//q2
                        menu1.escreverResposta(lista2.q2);
                     else if(aux == JOptionPane.CANCEL_OPTION)//q3
                        lista2.questao3();
                     else if(aux == JOptionPane.CANCEL_OPTION+1)//q4
                        lista2.questao4();
                     else if(aux == JOptionPane.CANCEL_OPTION+2)//q5
                         lista2.questao5();
                     else if(aux == JOptionPane.CANCEL_OPTION+3)//q6
                         lista2.questao6();
                     else if(aux == JOptionPane.CANCEL_OPTION+4)//q7
                         lista2.questao7();
                     else
                        aux2 = 0;
                    }while(aux2 !=0);
            aux2 = 0;
        }else if(option == JOptionPane.CANCEL_OPTION){
        
           
                        }
                        }while(aux3 == 1);
        }

}            