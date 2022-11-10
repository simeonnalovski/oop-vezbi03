package oop.fikt.vezhbi3;
public class MainClass1 {
    public static void main(String[] args){
        Avtomobil a= new Avtomobil("Ford","C-Max","Siva",175000,2007,"BT2310RB");
        a.PrvMetod();
        System.out.println("Zgolemeni kilometri "+a.VtorMetod());
    }
}
