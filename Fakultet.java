package oop.fikt.vezhbi3;
public class Fakultet {
    public String nazivNaFakultet;
    public int brojNaSmerovi; 
    public int brojNaStudenti;
    public String dekan;
    public String sediste;

  public Fakultet(){}
    
    public void Zgolemi50(){
        System.out.println("Zgolemen broj na studenti "+(this.brojNaStudenti+50));
    }
    public int Namali(int namali){
        int namalen=this.brojNaStudenti-namali;
        return namalen;
    }
    public void Pecati(){
        System.out.println(this.nazivNaFakultet+" - "+this.sediste);
    }

}
