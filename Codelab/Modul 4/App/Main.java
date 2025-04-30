package App;
import Perpustakaan.Anggota;
import Perpustakaan.Fiksi;
import Perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Fiksi bukuFiksi = new Fiksi("Putri Salju", "Grimm Bersaudara", "Fiksi");
        NonFiksi bukuNonfiksi = new NonFiksi("Bussiness Strategy", "Brian Tracy", "NonFiksi");

        Anggota anggota1 = new Anggota("Fauzan", "A200");
        Anggota anggota2 = new Anggota("Kintaro", "B062");


        bukuFiksi.DisplayInfo();
        bukuNonfiksi.DisplayInfo();

        System.out.println("\n=======Anggota============");
        System.out.println("Nama: " + anggota1.Name + " Id: " + anggota1.Id);
        System.out.println("Nama: " + anggota2.Name + " Id: " + anggota2.Id);

        System.out.println("\n=======List Peminjam Buku=====");
        anggota1.pinjamBuku("Putri Salju", 7);
        anggota2.pinjamBuku("Busnisess Strategy", 3);

        System.out.println("\n=====List Pengembalian Buku===========");
        anggota1.kembalikanBuku("Putri Salju");
        anggota2.kembalikanBuku("Bussiness Strategy");

    }

}
