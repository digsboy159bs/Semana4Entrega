import javax.swing.JOptionPane;
public class Adicao
{
   public static void main (String args [])
   {
      
      int numero;
      int numero2;
      int soma;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("qual o numero"));
      numero2 = Integer.parseInt(JOptionPane.showInputDialog("qual o segundo numero"));
      
      soma = (numero + numero2);
      
      if (soma > 10)
      {
         JOptionPane.showMessageDialog(null, "o resultado é " + soma);
      }
      
      
      
      
      
   }
}