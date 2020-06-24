
package livedes6quest8tarde;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveDes6Quest8Tarde {

    /**
     * Escrever um algoritmo que leia um valor X e calcule e mostre os 20 
     * primeiros termos da série: 
     * 1  1  1  .....
     * X¹ X² X³ ..... 
     */
    public static void main(String[] args) {
       int cont; String res = "Serie\n";
       double x, acSerie;
       acSerie=0;
        DecimalFormat f= new DecimalFormat("0.0");
       x = Double.parseDouble(JOptionPane.showInputDialog("Valor X:"));
       for(cont = 1; cont<=20; cont++){
           acSerie += 1.0/Math.pow(x,cont); 
           res += " "+(1.0/Math.pow(x,cont))+"\n"; 
       }//fim do loop
       JOptionPane.showMessageDialog(null, res);
       JOptionPane.showMessageDialog(null, "O resultado da série é: "
               +f.format(acSerie));
    }
    
}
