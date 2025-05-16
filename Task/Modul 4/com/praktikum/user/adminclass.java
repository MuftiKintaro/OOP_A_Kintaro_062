package com.praktikum.user;
import java.util.Scanner;
import com.praktikum.action.AdminAction;

public class adminclass extends userclass implements AdminAction {
    private final String username = "MuftiKintaro";
    private final String password = "Mufti062";
    public int pilihan;
    Scanner objInput = new Scanner(System.in);

    public adminclass(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void DisplayInfo(){
        System.out.println("========Admin=======");
        System.out.println("Nama : " + username);
        System.out.println("Anda login sebagai admin");
        while (true){
        System.out.println("==Admin menu==");
        System.out.println("1. Kelola Laporan Barang ");
        System.out.println("2. Kelola Data Mahasiswa ");
        System.out.println("0. Logout");
        System.out.print("Masukan Pilihan Anda: ");
        pilihan = objInput.nextInt();
        objInput.nextLine();

        switch (pilihan) {
            case 1:
                manageItems();
                break;
            case 2:
                manageUsers();
                break;
            case 0:
                System.out.println("===Anda Telah Logout===");
                return;
            default:
                System.out.println("pilihan tidak tersedia.");
        }
        }

    }

    @Override
    public void manageItems() {
        System.out.println("==Fitur ini belum tersedia==");
    }

    @Override
    public void manageUsers() {
        System.out.println("==Fitur ini belum tersedia==");

    }
}
