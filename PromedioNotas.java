package tarea5;

public class PromedioNotas {
    private double PTA;
    private double EMC;
    private double EFC;
    
    public void setPTA(double PTAp) {
        this.PTA=PTAp;
    }
    public double getPTA(){
        return PTA;
    }

    public void setEMC(double EMCp) {
        this.EMC=EMCp;
    }
    public double getEMC(){
        return EMC;
    }
    
    public void setEFC(double EFCp) {
        this.EFC=EFCp;
    }
    public double getEFC(){
        return EFC;
    }

    public double getPromedioN(){
        double PF;
        PF = (this.getPTA()+this.getEMC()+this.getEFC())/3;
        return PF;
    }
}
