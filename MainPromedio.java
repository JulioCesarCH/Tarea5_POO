package tarea5;
import javax.swing.*;
public class MainPromedio {
    public static void main(String[] args) {
    double VPTA;
    double VEMC;
    double VEFC;

    VPTA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio de las Tareas Academicas"));
    VEMC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota del Examen de Medio Curso"));
    VEFC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota del Examen de Fin de Curso"));
    
    PromedioNotas promedionotas= new PromedioNotas();
    promedionotas.setPTA(VPTA);
    promedionotas.setEMC(VEMC);
    promedionotas.setEFC(VEFC);

     JOptionPane.showMessageDialog(null,"PARA LAS NOTAS SIGUIENTES:\n"
     +"--> Promedio de las Tareas Academicas = " +VPTA + "\n"
     +"--> Examen de Medio Curso = " +VEMC + "\n"
     +"--> Examen de Fin de Curso = " +VEFC+"\n"
     +"EL PROMEDIO ES: " +promedionotas.getPromedioN(),"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
    }
}
