package Kuliah.StrukturData.Modul1.LatihanPraktikum;

public class Konsumsi<M, I> {
    private M makanan;
    private I minuman;

    public M getMakanan(){
        return makanan;
    }

    public I getMinuman() {
        return minuman;
    }

    public void setKonsumsi(M makanan, I minuman){
        this.makanan = makanan;
        this.minuman = minuman;
    }
}
