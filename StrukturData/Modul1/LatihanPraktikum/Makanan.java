package Kuliah.StrukturData.Modul1.LatihanPraktikum;

public class Makanan extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " Dimakan";
    }
}
