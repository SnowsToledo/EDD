
package edd;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lista2 {
  String q1 =  "Q1 - As variáveis de instância são criadas dentro do corpo do classe, e as de locais são criadas dentro de algum metódo";
   String q2 = "Q2 - f).";
//Q3:
   public void questao3(){
       int[] vetor  = new int[10];
       int soma = 0;   
       for(int i = 0; i<10;i++){
           vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 10 númertos. "+(i+1)+"º"));
           soma +=vetor[i];
       }
       double media = soma/10;
       JOptionPane.showMessageDialog(null, "A soma desses termos é: "+soma+"\nA média desses números é: "+media);
   }
       //Q4:
       public void questao4(){
            int[] vetor  = new int[10];
            int maior = 0, menor = 0;
       for(int i = 0; i<10; i++){
           vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 10 númertos. "+(i+1)+"º: "));
           }
           maior = vetor[0];
           menor = vetor[0];
            for(int i = 1;i<10;i++){
               if(maior<vetor[i]){
                   maior=vetor[i];
               }if(menor>vetor[i]){
                   menor = vetor[i];
               }
            }
       JOptionPane.showMessageDialog(null, "O maior número é: "+maior+". E o menor é: "+menor);
       }    
       public void questao5(){        
          int cont = 1;
          int aux1 = 0;
          int[] lista = new int[168];
          for(int num = 2; num<1001;num++){
          boolean aux = true;
          for(int i = 2; i<num; i++){
              int resto = num%i;
              if(resto == 0){
                  aux = false;
                  break;
              }
          }
            if(aux){
                lista[aux1] = num;
                cont++;
                aux1++;
            }
          }for(int i= 0;i<lista.length;i++){
              System.out.println(lista[i]);
          }
       }
       public void questao6(){
           int num1 =1;
           int num2 = 0;
           int soma = 0;
           int[] vet = new int[50];
           for(int i = 0; i<50;i++){
               vet[i] = soma;
               soma = num1+num2;
               num2=num1;
               num1 = soma;              
           }JOptionPane.showMessageDialog(null, vet[0]+" "+vet[1]+" "+vet[2]+" "+vet[3]+" "+vet[4]+" "+vet[5]+" "+vet[6]+" "+vet[7]+" "+vet[8]+" "+vet[9]+" "+vet[10]+
                   "\n"+vet[11]+" "+vet[12]+" "+vet[13]+" "+vet[14]+" "+vet[15]+" "+vet[16]+" "+vet[17]+" "+vet[18]+" "+vet[19]+vet[20]+" "+
                   "\n"+vet[21]+" "+vet[22]+" "+vet[23]+" "+vet[24]+" "+vet[25]+" "+vet[26]+" "+vet[27]+" "+vet[28]+" "+vet[29]+vet[30]+" "+
                   "\n"+vet[31]+" "+vet[32]+" "+vet[33]+" "+vet[34]+" "+vet[35]+" "+vet[36]+" "+vet[37]+" "+vet[38]+" "+vet[39]+vet[40]+" "+
                   "\n"+vet[41]+" "+vet[42]+" "+vet[43]+" "+vet[44]+" "+vet[45]+" "+vet[46]+" "+vet[47]+" "+vet[48]+" "+vet[49]);
           }
       public void questao7(){
           Random r = new Random();
           int numC = r.nextInt(101);
           int tentativas = 1;
           int aux = 1;
           do{
               int numP = pedirNum();
               if(numC == numP){
               JOptionPane.showMessageDialog(null, "Você acertou! Com "+tentativas+" tentativas");
               aux = 0;
               }
               else{
                      tentativas ++;
                      if(numC < numP){
                          JOptionPane.showMessageDialog(null, "O número é menor");
                      }else if(numC>numP){
                          JOptionPane.showMessageDialog(null, "O número é maior");
               }
               }      
           }while(aux != 0);
       }public int pedirNum(){
           int numP = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número?"));
           return numP;
       }
    }

