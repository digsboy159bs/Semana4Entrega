import javax.swing.JOptionPane;
public class RaizQuadrada
{
   public static void main (String args [])
   {
      
      int numero;
           
      numero = Integer.parseInt(JOptionPane.showInputDialog("qual o numero"));
      
      double raizquadrada = Math.pow(numero, 0.5);
      double quadrado = numero * numero;
      
      if (numero >= 0)
      {
         JOptionPane.showMessageDialog(null," o numero � positivo a raiz quadrada � " + raizquadrada);
      }
      else
      {
         JOptionPane.showMessageDialog(null," o numero � negativo o quadrado dele � " + quadrado);
      }
      
      
   }
}