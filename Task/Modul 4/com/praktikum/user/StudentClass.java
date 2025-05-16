package com.praktikum.user;
import com.praktikum.action.MahasiswaAction;
import java.util.Scanner;

public class StudentClass extends userclass implements MahasiswaAction {
    final String Nama = "Muhammad Mufti Kintaro";
    public String namaBarang;
    public String deskripsiBarang;
    public String lokasiBarang;
    public int pilihan;
    String ulang;

    Scanner objInput = new Scanner(System.in);
    public StudentClass(String Student_Id, String Nama) {
        super(Student_Id, Nama); //untuk memanggil constructor yang ada di com.praktikum.user.userclass
        setStudent_Id("202410370110062");
        setName("132413");
    }
    public String getNama(){
        return Nama;
    }
    @Override
        public boolean login(String Student_Id, String Name){
        return this.getStudent_Id().equals(getStudent_Id()) && this.getName().equals(getName());
    }

    @Override
    public void reportItem() {
        do {
            System.out.println("========Laporkan======");
            System.out.print("Nama Barang: ");
            namaBarang = objInput.nextLine();
            System.out.print("Deskripsi Barang: ");
            deskripsiBarang = objInput.nextLine();
            System.out.print("Lokasi Terakhir ditemukan: ");
            lokasiBarang = objInput.nextLine();

            System.out.println("================================");
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Deskripsi barang; " + deskripsiBarang);
            System.out.println("lokasi terkhir: " + lokasiBarang);

            System.out.print("Apakah anda ingin membuat laporan lagi (y/n)");
            ulang = objInput.nextLine();
        } while (ulang.equals("y"));
        System.out.println("===Terima kasih Sudah melapor===");
    }

    @Override
    public void viewReportedItem() {
        System.out.println("===Mohon Maaf fitur ini belum tersedia===");

    }
    @Override
    public void DisplayInfo(){
        System.out.println("===Anda Login Sebagai Mahasiswa===");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getStudent_Id());
        while (true){
        System.out.println("===Laporan Barang Temuan/Hilang.===");
        System.out.println("1. Laporan Barang ");
        System.out.println("2. Lihat Daftar Laporan Barang");
        System.out.println("0. Logout");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = objInput.nextInt();
        objInput.nextLine();
        switch (pilihan) {
            case 1:
                reportItem();
                break;
            case 2:
                viewReportedItem();
                break;
            case 0:
                System.out.println("===Anda Telah Logout===");
                return;
            default:
                System.out.println("===Pilihan tidak tersedia===");
        }
        }

    }
}
