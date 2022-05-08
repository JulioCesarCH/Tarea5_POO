package tarea5;
import javax.swing.*;
public class MainInteres {
    public static void main(String[] args) 
    {
        double ValorC;
        double ValorI;
        double ValorN;

         ValorC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Capital?"));
         ValorI = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Tasa de Interes(%)?"));
         ValorN = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Total de periodos?"));
        
         InteresCompuesto interes = new  InteresCompuesto(ValorC,ValorI,ValorN);
       
         JOptionPane.showMessageDialog(null,"Para un Capital = " +ValorC + "\n"
         +"Un Interes = " +ValorI + "%\n"
         +"y total de Periodos = " +ValorN+"\n"
         +"El Importe Acumulado es: " +interes.getImporteAcumulado(),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);

    }
}