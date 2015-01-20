
package roberto3;
import javax.swing.JOptionPane;

public class Roberto3 {

public void imc()
{
    String num1,num2;
    int n1,n2,imc;
    
    num1=JOptionPane.showInputDialog("dame la mas");
    num2=JOptionPane.showInputDialog("dame la altura");
    
    n1=Integer.parseInt(num1);
    n2=Integer.parseInt(num2);
    
    imc=n1/n2*n2;
    System.out.pintIn(imc);
    
}

    public static void main(String[] args) {

    }
}





