/**
 * Created by yudiwbs on 11/04/2017.
 *
 *
 * method yg harus dilengkapi: 2
 *
 */
public class Tamu {
      int id;
      String nama;

      //lengkapi
      //constructor
      public Tamu(int id, String nama) {
          this.id = id;
          this.nama = nama;
      }

      //lengkapi
      public void print() {
          System.out.println("id tamu: "+id+ "; nama:"+nama);
      }

      //jangan edit
      public static void main(String[] args) {
          Tamu t = new Tamu(1,"Rudi");
          t.print();
      }
}
