public class Lokasi {
    public String kodeLokasi;
    public String alamat;
    public String luas;

    public Lokasi(String kodeLokasi, String alamat, String luas) {
        this.kodeLokasi = kodeLokasi;
        this.alamat = alamat;
        this.luas = luas;
    }

    public void cetak(){
        System.out.println("____________________________________________");
        System.out.println("*) LOKASI : ");
        System.out.println("+------------------------------------------+");
        System.out.println("   - Kode Lokasi      : "+kodeLokasi);
        System.out.println("   - alamat           : "+alamat);
        System.out.println("   - luas lokasi      : "+luas);
        System.out.println("+------------------------------------------+");
    }
}
