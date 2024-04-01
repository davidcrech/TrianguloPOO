
package principal;
import model.Triangulo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Triangulo tri1 = new Triangulo();
        
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog("base: ")));
        tri1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("altura: ")));
        
        JOptionPane.showMessageDialog(null, tri1.getArea());
    }
}
