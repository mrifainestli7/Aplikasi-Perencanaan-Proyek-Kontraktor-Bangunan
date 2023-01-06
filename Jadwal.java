public class Jadwal {
    public String kodeJadwal;
    public String masa;
    public String tanggal;

    public Jadwal(String kodeJadwal, String masa, String tanggal) {
        this.kodeJadwal = kodeJadwal;
        this.masa = masa;
        this.tanggal = tanggal;
    }

    public void cetak(){
        System.out.println("____________________________________________");
        System.out.println("*) JADWAl : ");
        System.out.println("+------------------------------------------+");
        System.out.println("   - Kode Jadwal      : "+kodeJadwal);
        System.out.println("   - Tanggal mulai    : "+tanggal);
        System.out.println("   - lama pengerjaan  : "+masa);
        System.out.println("+------------------------------------------+");
    }
}
