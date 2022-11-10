package oop.fikt.vezhbi3;
public class MainClass2 {
    public static void main(String[] args){
    Fakultet FIKT= new Fakultet();
    FIKT.nazivNaFakultet="FIKT";
    FIKT.dekan="Aleksandar Makrovski";
    FIKT.sediste="Bitola";
    FIKT.brojNaSmerovi=2;
    FIKT.brojNaStudenti=500;
    FIKT.Zgolemi50();
    System.out.println("Namalen broj studenti "+ FIKT.Namali(20));
    FIKT.Pecati();
    Fakultet PravenSK= new Fakultet();
    PravenSK.nazivNaFakultet="Justinijan Prvi";
    PravenSK.dekan="Saso Georgievski";
    PravenSK.sediste="Skopje";
    PravenSK.brojNaSmerovi=4;
    PravenSK.brojNaStudenti=1000;
    PravenSK.Zgolemi50();
    System.out.println("Namalen broj studenti "+ PravenSK.Namali(20));
    PravenSK.Pecati();

}
}
   
