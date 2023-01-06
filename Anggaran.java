public class Anggaran {
    public String NoAnggaran, nomimal;

    public Anggaran(String noAnggaran, String nomimal) {
        NoAnggaran = noAnggaran;
        this.nomimal = nomimal;
    }

    public void cetak(){
        System.out.println("____________________________________________");
        System.out.println("*) ANGGARAN : ");
        System.out.println("+------------------------------------------+");
        System.out.println("   - Kode anggaran    : "+NoAnggaran);
        System.out.println("   - Nominal          : "+nomimal);
        System.out.println("+------------------------------------------+");
    }

}
