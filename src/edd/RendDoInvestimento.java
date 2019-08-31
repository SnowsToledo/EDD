
package edd;

import javax.swing.*;

public class RendDoInvestimento extends JFrame {
    JLabel text1;
    JTextField campo1;
    JLabel text2;
    JTextField campo2;
    JLabel text3;
    JTextField campo3;
    JButton btn;
    JTextArea text4;
    public Rend(){
        Super("Rendimento do Investimento");
        initComponents();   
    }
    private void initComponents(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        text1 = new JLabel("Escreva o valor de depósito fixo mental: ");
        add(text1);
        campo1 = new JTextField(10);
        add(campo1);
        text2 = new JLabel("Escreva a taxa de rendimento: ");
        add(text2);
        campo2 = new JTextField(10);
        add(campo2);
        text3 = new JLabel("Quantidade de meses: ");
        add(text3);
        campo3 = new JTextField(10);
        add(campo3);
        add(text4);
        btn = new JButton("Calcular");
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            double MFinal =  calcularMontante(Double.parseDouble(campo2),Double.parseDouble(campo3), Double.parseDouble(campo1));   
            text4.append(""+MFinal);
            }
        });
    }
    public static void main(String [] args){
    Rend frame = new Rend();
    frame.setSize(400, 300);
    frame.setVisible(true);
    }
    public double calcularMotante(double taxa, int meses, double deposito){
        double Mfinal = (1 + taxa/100)*((Math.pow(1+taxa, meses)-1)/taxa)*deposito;
        return Mfinal;
    }
}
