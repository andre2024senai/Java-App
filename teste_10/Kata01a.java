/*
Imprimir na tela os quadrados dos n�meros inteiros de 1 a 20.
(Com WHILE)
*/
import javax.swing.JOptionPane;
public class Kata01a {
   public static void main (String args[]) {
      // criando vari�veis e objetos
      int    cont;
      double resul;
      String msg = "Resultados\n\n";
      //loop
      cont = 1;
      while (cont <= 20) {
         resul = Math.pow(cont, 2);
         msg   = msg + cont + "� = " + resul + "\n";
         
         cont++; // cont = cont + 1;
      }
      JOptionPane.showMessageDialog(null, msg);
      // fim
      System.exit(0);
   }
}