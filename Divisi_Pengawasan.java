public class Divisi_Pengawasan extends Divisi{
    public int nominal;

    public Divisi_Pengawasan(int code, String name, int number_employe, int anggaran) {
        super.kode_div=code;
        super.nama_div=name;
        super.jumlah_karyawan=number_employe;
        nominal=anggaran;
    }

    @Override
    public void Anggaran_Div() {
        System.out.println("Anggaran divisi bahan : "+nominal);
    }
}
