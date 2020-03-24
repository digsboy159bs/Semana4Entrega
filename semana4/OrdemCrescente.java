import javax.swing.JOptionPane;
public class OrdemCrescente
{
   public static void main (String args [])
   {
      
      int numero;
      int numero2;
      int numero3;
      
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("qual o numero"));
      numero2 = Integer.parseInt(JOptionPane.showInputDialog("qual o segundo numero"));
      numero3 = Integer.parseInt(JOptionPane.showInputDialog("qual o terceiro numero"));
      
  
      
      if ((numero > numero2) && (numero > numero3) && (numero2 > numero3))
      {
         JOptionPane.showMessageDialog(null, "ordem crescente " + numero3 + " " + numero2 + " " + numero);
      }
      else if ((numero2 > numero) && (numero2 > numero3) && (numero > numero3))
      {
          JOptionPane.showMessageDialog(null, "ordem crescente " + numero3 + " " + numero + " " + numero2);

      }else if  ((numero3 > numero) && (numero3 > numero2) && (numero > numero2))

      {
          JOptionPane.showMessageDialog(null, "ordem crescente " + numero2 + " " + numero + " " + numero3);

      }else if  ((numero3 > numero) && (numero3 > numero2) && (numero2 > numero))

      {
          JOptionPane.showMessageDialog(null, "ordem crescente " + numero + " " + numero2 + " " + numero3);

      }else if  ((numero2 > numero) && (numero2 > numero3) && (numero3 > numero))

      {
          JOptionPane.showMessageDialog(null, "ordem crescente " + numero + " " + numero3 + " " + numero2);

      }else if  ((numero > numero2) && (numero > numero3) && (numero3 > numero2))

      {
          JOptionPane.showMessageDialog(null, "ordem crescente " + numero2 + " " + numero3 + " " + numero);

      }



      
      
      
      
      
   }
}