package oop.fikt.vezhbi3;

import java.util.Scanner;

public class MainClass4 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            Brojac b=new Brojac();
            System.out.print("Vnesi go brojot na frlanja na parickata");  
            b.BrFrlanja= sc.nextInt();// vnes od tastatura na broj na frlanja na parickata
            b.ZgolemuvanjeBrojac(b.BrFrlanja); // povikuvanje na funkcija za zgolemuvanje na brojac, i so toa kolku pati padnale pismo ili glava
            b.Resetiranje(b.BrGlava,b.BrPismo); // povikuvanje na resetiranjeto na brojacite
}
}
}
