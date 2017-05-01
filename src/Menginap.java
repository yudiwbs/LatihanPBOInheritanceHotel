/**
 *  TIDAK DIGUNAKAN LAGI
 *
 *  Created by yudiwbs on 12/04/2017.
 *
 *  relasi antara kamar,tamu
 *    untuk menyimpan jumlahhari tamu menginap di suatu kamar dan menghitung tagihan
 *
 *    kenapa jadi class terpisah dari Tamu? karena nanti perhitungan tagihan bisa kompleks
 *

 */

public class Menginap {
    Kamar kamar;   //diawali huruf kecil nama objek, huruf besar nama class
    Tamu tamu;
    int jumHari;   //jumhari menginap

    //lengkapi
    //constructor
    public  Menginap(Kamar k, Tamu t, int jumHari) {
        this.kamar = k;
        this.tamu = t;
        this.jumHari = jumHari;
    }

    //lengkapi
    public void print() {
        tamu.print();
        kamar.print();
        System.out.println("Jum hari menginap:"+jumHari);
    }

    //lengkapi
    //tagihan adalah jumlahHari dikali dengan harga kamar (kamar.harga)
    public int hitungTagihan() {
        return jumHari * kamar.harga;
    }

    public static void main(String[] args) {
        //test
        Tamu  t = new Tamu(1,"Rini");
        Kamar k = new Kamar(231,200);
        Menginap inap = new Menginap(k,t,2);
        inap.print();
        System.out.println("Tagihan:"+inap.hitungTagihan());
    }

}
