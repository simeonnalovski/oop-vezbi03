package oop.fikt.vezhbi3;
public class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public double pominatiKM;
    public int GodinaNaProizvodstvo;
    public String Registracija;

    public Avtomobil(String marka,String model,String boja,double pominatiKM,int GodinaNaProizvodstvo,String Registracija){
    this.marka=marka;
    this.model=model;
    this.boja=boja;
    this.pominatiKM=pominatiKM;
    this.GodinaNaProizvodstvo=GodinaNaProizvodstvo;
    this.Registracija=Registracija;    
    }
    public void PrvMetod(){
        System.out.println(this.marka+", "+this.model+", "+this.boja);
    }
    public double VtorMetod(){
        double Pkm= pominatiKM + 1520.25;
        return Pkm;
    }
}