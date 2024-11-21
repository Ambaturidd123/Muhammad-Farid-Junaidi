public class Barang {
protected String kodeBarang;
protected String namaBarang;
protected double hargaBarang;

public Barang(String var1, String var2, double var3) {
this.kodeBarang = var1;
this.namaBarang = var2;
this.hargaBarang = var3;
}

public double hitungTotal(int var1) {
      return (double)var1 * this.hargaBarang;
   }
}
