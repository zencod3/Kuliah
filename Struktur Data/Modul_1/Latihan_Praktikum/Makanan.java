package Latihan_Praktikum;

public class Makanan extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " Dimakan";
    }
}
