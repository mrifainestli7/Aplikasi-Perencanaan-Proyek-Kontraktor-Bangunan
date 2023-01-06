public class Divisi_Konstruksi extends Divisi{
    public String nominal;

    public Divisi_Konstruksi(String code, String name, String number_employe, String anggaran) {
        super.kode_div=code;
        super.nama_div=name;
        super.jumlah_karyawan=number_employe;
        nominal=anggaran;
    }

    @Override
    public void Anggaran_Div() {
        System.out.println("   - Anggaran Divisi Konstruksi : "+nominal);
    }

    @Override
    public void spesialis() {
        System.out.println("   - Keterangan       : \n     Divisi spesialis pengerjaan proyek");
        System.out.println("+------------------------------------------+");
    }
    public void cetak(){
        System.out.println("____________________________________________");
        System.out.println("*) Divisi Kontruksi : ");
        System.out.println("+------------------------------------------+");
        System.out.println("   - Kode Divisi      : "+super.kode_div);
        System.out.println("   - Kepala Divisi    : "+super.nama_div);
        System.out.println("   - Jumlah Karyawan  : "+super.jumlah_karyawan);
    }

}
