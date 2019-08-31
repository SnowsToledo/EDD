
package edd;

import javax.swing.JOptionPane;

public class Lista1 {
    String q1 = "As sementes servem para gerar números pseudo-aleatórios. Auditoria, confirmação de um sorteio aleatorio";
    String q2 ="d)";
    public void tempo(){//q3
        int tSeg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de segundos: "));
        int horas = 0, minutos = 0, segundos = 0;
        horas = tSeg/3600;
        minutos = (tSeg%3600)/60;
        segundos = (tSeg%3600)%60;
        JOptionPane.showMessageDialog(null, horas+" hora(s) "+minutos+" minuto(s) "+ segundos+" segundo(s)");
    }
    public void fatoracao(){//q4
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        String res = "";
        int fat = 2;
        do{        
                if(divisivel(fat, num)==0){
                    res =  res+fat+" ";
                    num = dividir(fat, num);
                }else{
                    fat++;
                }
        }while(num != 1);
        System.out.println(res+" ");
    }
    public int dividir(int div, int num){
        int divisao = num/div;
        return divisao;
    }
    public int divisivel(int div, int num){
        int divisao = num%div;
        return divisao;
    }
    public void numeroPI(){//q5
        double aux = 0;
        for (double i = 3; i < 100004; i+=2) {  
            aux =+ 1/i;
        }
        double pi =4*(1-aux);
        JOptionPane.showMessageDialog(null,"Número pi: "+ pi);
    }
    public void segundoGrau(){
        double a =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número A:"));
        double b =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite  número B:"));
        double c =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite  número C:"));
        double delta = Math.pow(b, 2)-4*a*c;
        double baskharaP = 0, baskharaN = 0, baskhara = 0;
        if(delta < 0)
            JOptionPane.showMessageDialog(null, "Não possui raiz");
        else if(delta > 0){
           baskharaP =  (Math.sqrt(delta) - b)/2*a;
           baskharaN = (-Math.sqrt(delta)-b)/2*a;
           JOptionPane.showMessageDialog(null, "Possui duas raizes: "+baskharaP+" e "+baskharaN);
        }
        else if(delta == 0){
            baskhara = -b/2*a;
            JOptionPane.showMessageDialog(null,"Possui uma raiz: "+baskhara);
        }
    
    }
    
}
