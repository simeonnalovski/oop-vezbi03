package oop.fikt.vezhbi3;

import java.util.Random; // Java util za slucajnost (random)

public class Brojac{
    public String[] sostojbi={"Glava","Pismo"}; // mozni sostojbi na frlena paricka
    public int BrFrlanja;
    public int BrPismo=0;
    public int BrGlava=0;  // so BrGlava i Brpismo ke se broi kolku pati padnalo glava ili pismo
    public void ZgolemuvanjeBrojac(int BrFrlanja){
        for(int i=0;i<this.BrFrlanja;i++){
            String random=(sostojbi[new Random().nextInt(sostojbi.length)]); // String po slucaen izbor od sostojbi
            if(random=="Glava"){
                this.BrGlava++; // zgolemuvanje na brojac na glava
            }
            if(random=="Pismo"){
                this.BrPismo++; // zgolemuvanje na projac na pismo
            }
           

        }
           System.out.println(" Broj na frlanja "+this.BrFrlanja);
           System.out.println("Broj na pati koga padna glava "+this.BrGlava);
           System.out.println("Broj na pati koga padna pismo "+this.BrPismo);
    }
    public void Resetiranje(int BrGlava,int BrPismo){
        this.BrGlava=0;
        this.BrPismo=0;
    } // so void Resetiranje se resetiraat brojacite za glava i pismo

}