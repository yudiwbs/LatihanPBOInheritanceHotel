import java.util.ArrayList;

/**
 *   Created by user on 26/04/2017.
 *   versi lebih generik daripada menginap
 *
 *   Menghitung total tagihan tamu
 *
 */


public class Tagihan {
    Tamu tamu;

    private ArrayList<Fasilitas> alFasilitas = new ArrayList<Fasilitas>();


    public void addFasilitas(Fasilitas f) {
        alFasilitas.add(f);
    }

    public double hitungSemuaTagihan() {
        double total = 0;
        for (Fasilitas f:alFasilitas) {
            total = total + f.hitungTagihan();
        }
        return total;
    }

    public Tagihan(Tamu t) {
        this.tamu = t;
    }

    public static void main(String[] args) {
        Tamu tamu = new Tamu(1,"Rudi");
        Tagihan  tagihan = new Tagihan(tamu);
        Kamar k = new Kamar(231,200);
        FasilitasKamar fk = new FasilitasKamar(k);
        fk.kamar = k;
        fk.jumHari = 3; //menginap 3 hari
        tagihan.addFasilitas(fk);
        System.out.println("Tagihan:"+tagihan.hitungSemuaTagihan());
    }
}
