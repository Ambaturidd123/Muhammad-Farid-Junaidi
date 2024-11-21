public class Transaksi extends Barang {
    private String noFaktur;

    public Transaksi(String var1, String var2, String var3, double var4) {
    super(var2, var3, var4);
    this.noFaktur = var1;
    }

    public void tampilkanTransaksi(int var1) {
    double var2 = this.hitungTotal(var1);
    System.out.println("\n=== Detail Transaksi ===");
    System.out.println("No Faktur   : " + this.noFaktur);
    System.out.println("Kode Barang : " + this.kodeBarang);
    System.out.println("Nama Barang : " + this.namaBarang);
    System.out.println("Harga Barang: Rp " + this.hargaBarang);
    System.out.println("Jumlah Beli : " + var1);
    System.out.println("Total Harga : Rp " + var2);
   }
}
