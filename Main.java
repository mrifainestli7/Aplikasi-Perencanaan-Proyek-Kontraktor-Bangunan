import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, pil;
        String x;

        String namaP, kodeP, KepalaP;               //atribut penampung sementara atribut class proyek

        String IdJadwal, masaJadwal, TanggalJadwal; //atribut penampung sementara atribut class jadwal

        String IdLokasi, alamat, luas;              //atribut penampung sementara atribut class Lokasi

        String IdAnggaran, nominal;                 //atribut penampung sementara atribut class Anggaran

        String kepala_div, kode_div, jumlah_karyawan, AnggaranDiv; //atribut penampung sementara atribut class divisi

        System.out.println("============================================");
        System.out.println("Masukkan Data Proyek -> ");
        System.out.println("--------------------------------------------");
        System.out.print("  Kode Proyek       : "); kodeP = in.nextLine();
        System.out.print("  Nama Proyek       : "); namaP = in.nextLine();
        System.out.print("  Kepala Proyek     : "); KepalaP = in.nextLine();
        System.out.println("--------------------------------------------");
        System.out.print("  Kode Anggaran     : "); IdAnggaran = in.nextLine();
        System.out.print("  Nominal Anggaran  : "); nominal = in.nextLine();
        System.out.println("--------------------------------------------");
        System.out.print("  Kode Lokasi       : "); IdLokasi = in.nextLine();
        System.out.print("  Alamat Lokasi     : "); alamat = in.nextLine();
        System.out.print("  Luas Proyek       : "); luas = in.nextLine();
        System.out.println("--------------------------------------------");
        System.out.print("  Kode Jadwal       : "); IdJadwal = in.nextLine();
        System.out.print("  Tanggal Mulai     : "); TanggalJadwal = in.nextLine();
        System.out.print("  Lama Pengerjaan   : "); masaJadwal = in.nextLine();
        System.out.println("--------------------------------------------");

        Proyek proyek = new Proyek(kodeP,namaP,KepalaP);
        Anggaran anggaran = new Anggaran(IdAnggaran,nominal);
        Lokasi lokasi = new Lokasi(IdLokasi, alamat, luas);
        Jadwal jadwal = new Jadwal(IdJadwal, masaJadwal, TanggalJadwal);
        proyek.AddAnggaran(anggaran);
        proyek.AddLokasi(lokasi);
        proyek.AddJadwal(jadwal);

        System.out.print("Masukkan banyak divisi yang terlibat : "); n = in.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("--------------------------------------------");
            System.out.println("-> Pilih Jenis Divisi ");
            System.out.println(" 1). Dvisi Bahan");
            System.out.println(" 2). Dvisi Konstruksi");
            System.out.println(" 3). Dvisi Pengawasan");
            System.out.print("Pilihan : ");pil = in.nextInt(); x = in.nextLine();
            System.out.println("--------------------------------------------");
            System.out.print("  Kode Divisi       : "); kode_div = in.nextLine();
            System.out.print("  Kepala Divisi     : "); kepala_div = in.nextLine();
            System.out.print("  Anggaran Divisi   : "); AnggaranDiv = in.nextLine();
            System.out.print("  Jumlah Karyawan   : "); jumlah_karyawan = in.nextLine();
            System.out.println("--------------------------------------------");
            if(pil==1){
                Divisi_Bahan divBahan = new Divisi_Bahan(kode_div, kepala_div, jumlah_karyawan, AnggaranDiv);
                proyek.AddDivBahan(divBahan);
            } else if (pil==2) {
                Divisi_Konstruksi divKonstruksi = new Divisi_Konstruksi(kode_div, kepala_div, jumlah_karyawan, AnggaranDiv);
                proyek.AddDivKonstruksi(divKonstruksi);
            } else if (pil==3) {
                Divisi_Pengawasan divisi_pengawasan = new Divisi_Pengawasan(kode_div, kepala_div, jumlah_karyawan, AnggaranDiv);
                proyek.AddDivPengawas(divisi_pengawasan);
            }
        }
        proyek.cetakInformasiProyek();
    }
}