
package um;

import javax.swing.JOptionPane;

public class Um {
    public static void main(String[] args) {
        String primeiroNumber = 
                JOptionPane.showInputDialog ("Digite o primeiro número inteiro");
        String segundoNumber = 
                JOptionPane.showInputDialog ("Digite o segundo número inteiro");
        int number1 = Integer.parseInt(primeiroNumber);
        int number2 = Integer.parseInt(segundoNumber);
        
        int soma = number1 + number2;
        
        JOptionPane.showMessageDialog (null, "a soma é" + soma, "soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }
    
}
