import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yudiwbs on 11/04/2017.
 *
 * method yg harus dilengkapi:
 *
 */

public class Hotel {

    //id kamar dan kamar
    HashMap <Integer,Kamar> daftarKamar = new HashMap<>();

    //daftar tagihan <tamu.id, tagihan>
    HashMap <Integer,Tagihan> daftarTagihan = new HashMap<>();

    //jangan diedit
    public void isiKamar() {
        Kamar k = new Kamar(231,200);
        daftarKamar.put(k.id,k);
        k = new Kamar(232,300);
        daftarKamar.put(k.id,k);
        k = new Kamar(233,400);
        daftarKamar.put(k.id,k);
        k = new Kamar(333,500);
        daftarKamar.put(k.id,k);
        k = new Kamar(533,800);
        daftarKamar.put(k.id,k);
    }

    //lengkapi
    public void printSemuaKamar() {
        for (Kamar k: daftarKamar.values()) {
            k.print();
        }
    }

    //lengkapi
    //tampilkan kamar yang kosong berdasarkan harga
    //tampilkan yang isKosong=true dan harganya <= hargaMaks
    public void tampilkanKamarKosongHarga (int hargaMaks) {
        for (Kamar k:daftarKamar.values()) {
            if (k.isKosong && k.harga<= hargaMaks) {
                k.print();
            }
        }
    }

    //lengkapi
    //cari kamar berdasarkan id
    public Kamar cariKamarBerdId(int idKamar) {
        return daftarKamar.get(idKamar);
    }

    //lengkapi
    //tamu t masuk ke kamar k selama jumHari
    //buat obj menginap, lalu add ke daftarMenginap
    //set isKosong kamar dengan false
    public void checkin(Tamu t,Kamar k, int jumHari) {
        //Menginap m = new Menginap(k,t,jumHari);
        //tagihan mulai dibuat disini
        Tagihan tagihan = new Tagihan(t);
        tagihan.tamu = t;
        daftarTagihan.put(t.id,tagihan);
        FasilitasKamar fk = new FasilitasKamar(k);
        fk.jumHari = jumHari;
        tagihan.addFasilitas(fk);
        k.isKosong = false;
    }

    //lengkapi
    //loop daftarMenginap, print dan hitung taghian
    public void printTagihanTamu() {
        for (Tagihan t: daftarTagihan.values()) {
            System.out.println("Tamu:"+t.tamu.nama);
            System.out.println("Tagihan:"+t.hitungSemuaTagihan());
        }
    }


    //jangan edit
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.isiKamar();
        h.printSemuaKamar();

        Tamu rudi = new Tamu(1,"Rudi");
        Tamu wati = new Tamu(2,"Wati");

        System.out.println();
        System.out.println("Kamar kosong dengan harga maks 300:");
        h.tampilkanKamarKosongHarga(300);

        //misal user pilih kamar 232
        Kamar kamarPilih = h.cariKamarBerdId(232);
        h.checkin(rudi,kamarPilih,3); //menginap 3 hari

        //wati memilih kamar termahal
        Kamar kamarPIlih = h.cariKamarBerdId(533);
        h.checkin(wati,kamarPIlih,2);

        System.out.println();
        System.out.println("Tagihan tamu:");
        h.printTagihanTamu();

        //print lagi seluurh kamar, kamar 232 dan 533 harusnya isKosong false
        System.out.println();
        System.out.println("Kamar 232 dan 533 terisi");
        h.printSemuaKamar();

        System.out.println();
        System.out.println("Kamar kosong dengan harga maks 300, kamar 232 harusnya sudah tidak muncul karena terisi:");
        h.tampilkanKamarKosongHarga(300);


    }

}
