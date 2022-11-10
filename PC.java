package oop.fikt.vezhbi3;
public class PC {
    public int memorija;
    public String TipnaMemorija;
    public int hardDisk;
    public String golemina="GB";

    public PC(){
        this.memorija=2;
        this.TipnaMemorija="DDR2";
        this.hardDisk=160;
    }
    public void Metod(int zgolemiMemorija, int novHardDisk){
        System.out.println("Memorijata bese "+ this.memorija+golemina+", sega inzesuva "+(this.memorija+zgolemiMemorija)+golemina);
        System.out.println("Tipot na memorija e "+this.TipnaMemorija);
        System.out.println("HD ima golemina od "+novHardDisk+golemina+". Predhodno iznesuvase "+this.hardDisk+golemina);
    }
}
