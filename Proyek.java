public class Proyek {
    public String kodeProyek;
    public String NamaProyek;
    public String KepalaProyek;
    public Lokasi lokasi;
    public Anggaran anggaran;
    public Jadwal jadwal;
    public Divisi_Konstruksi[] DKontruksi = new Divisi_Konstruksi[3];
    public Divisi_Bahan[] DBahan = new Divisi_Bahan[3];
    public Divisi_Pengawasan[] DPengawasan = new Divisi_Pengawasan[3];

    private int i=0,j=0,k=0;

    public Proyek(String kodeProyek, String namaProyek, String kepalaProyek) {
        this.kodeProyek = kodeProyek;
        NamaProyek = namaProyek;
        KepalaProyek = kepalaProyek;
    }

    public void AddLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public void AddAnggaran(Anggaran anggaran) {
        this.anggaran = anggaran;
    }

    public void AddJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public void AddDivBahan(Divisi_Bahan a){
        this.DBahan[i] = a;
        this.i++;
    }
    public void AddDivKonstruksi(Divisi_Konstruksi b){
        this.DKontruksi[j] = b;
        this.j++;
    }
    public void AddDivPengawas(Divisi_Pengawasan c){
        this.DPengawasan[k] = c;
        this.k++;
    }
    public void cetakInformasiProyek(){
        System.out.println("============================================");
        System.out.println("              Detail Proyek");
        System.out.println("--------------------------------------------");
        System.out.println("  -) Kode Proyek   : "+kodeProyek);
        System.out.println("  -) Nama Proyek   : "+NamaProyek);
        System.out.println("  -) Kepala Proyek : "+KepalaProyek);
        anggaran.cetak();
        lokasi.cetak();
        jadwal.cetak();
        for (int a=0; a<i; a++){
            DBahan[a].cetak();
            DBahan[a].Anggaran_Div();
            DBahan[a].spesialis();
        }
        for (int b=0; b<j; b++){
            DKontruksi[b].cetak();
            DKontruksi[b].Anggaran_Div();
            DKontruksi[b].spesialis();
        }
        for (int c=0; c<k; c++){
            DPengawasan[c].cetak();
            DPengawasan[c].Anggaran_Div();
            DPengawasan[c].spesialis();
        }
        System.out.println("============================================");
    }
}