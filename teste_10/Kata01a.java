/*
Imprimir na tela os quadrados dos números inteiros de 1 a 20.
(Com WHILE)
*/
import javax.swing.JOptionPane;
public class Kata01a {
   public static void main (String args[]) {
      // criando variáveis e objetos
      int    cont;
      double resul;
      String msg = "Resultados\n\n";
      //loop
      cont = 1;
      while (cont <= 20) {
         resul = Math.pow(cont, 2);
         msg   = msg + cont + "² = " + resul + "\n";
         
         cont++; // cont = cont + 1;
      }
      JOptionPane.showMessageDialog(null, msg);
      // fim
      System.exit(0);
   }
}