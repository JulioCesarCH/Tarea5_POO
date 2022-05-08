package tarea5;
public class InteresCompuesto {
    private double C;
    private double i;
    private double n;
    private Math math;
    public InteresCompuesto (double ca,double in,double pe){
        this.C=ca;
        this.i=in;
        this.n=pe;
    }
    public double getC(){
        return C;
    }
    public double geti(){
        this.i=i/100; // ponemos al valor en porcentaje
        return i;
    }
    public double getN(){
        return n;
    }
    public double getImporteAcumulado(){
        double ImporteA;
        ImporteA = this.getC()*this.math.pow(1+this.geti(),this.getN());
        return ImporteA;
    }
}
