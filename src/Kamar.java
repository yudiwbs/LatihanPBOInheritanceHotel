/**
 * Created by yudiwbs on 11/04/2017.
 *
 * method yg harus dilengkapi: 2
 */
public class Kamar {
    int id;
    int harga; //harga kamar permalam dalam ribu. Jadi kalau 400 artinya Rp400000
    boolean isKosong=true;   //apakah kamar ditempati

    //lengkapi
    //constructor
    public Kamar(int id, int harga) {
        this.id = id;
        this.harga = harga;
    }

    //lengkapi
    public void print() {
        System.out.println("id kamar:"+id+" harga:"+harga+"; kosong? "+isKosong);
    }

    public static void main(String[] args) {
        Kamar k = new Kamar(231,200);
        k.print();
    }

}
