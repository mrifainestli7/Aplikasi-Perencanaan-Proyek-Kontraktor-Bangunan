public class Divisi_Bahan extends Divisi{
    public String nominal;

    public Divisi_Bahan(String code, String name, String number_employe, String anggaran) {
        super.kode_div=code;
        super.nama_div=name;
        super.jumlah_karyawan=number_employe;
        nominal=anggaran;
    }

    @Override
    public void Anggaran_Div() {
        System.out.println("   - Anggaran Divisi Bahan      : "+nominal);
    }
    @Override
    public void spesialis() {
        System.out.println("   - Keterangan       : \n     Divisi spesialis pengadaan bahan");
        System.out.println("+------------------------------------------+");
    }

    public void cetak(){
        System.out.println("____________________________________________");
        System.out.println("*) Divisi Bahan : ");
        System.out.println("+------------------------------------------+");
        System.out.println("   - Kode Divisi      : "+super.kode_div);
        System.out.println("   - Kepala Divisi    : "+super.nama_div);
        System.out.println("   - Jumlah Karyawan  : "+super.jumlah_karyawan);
    }
}
