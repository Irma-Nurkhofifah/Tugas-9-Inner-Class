package nmr5_penerapan_inner_class;

/*
Nama      : Irma Nurkhofifah M.
Kelas     : B2
hari/tgl  : Minggu, 10 Mei 2020
 */
public class Latihan_inner {
    private class Inner {
        public void printText(){
            System.out.println("Contoh penerapan inner class pada Java");
    }
  }
  public static void main(String[] args){
    Latihan_inner IN = new Latihan_inner();
    Latihan_inner.Inner inr = IN.new Inner();
    inr.printText();
  }
}
