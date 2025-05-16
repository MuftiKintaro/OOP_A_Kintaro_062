package com.praktikum.main;
import com.praktikum.user.userclass;
import com.praktikum.user.StudentClass;
import com.praktikum.user.adminclass;

import java.util.Scanner;

public class loginSystem {
    public static void main(String[] Args){
    Scanner ObjInput = new Scanner(System.in);
    int choice;
    userclass adminlog = new adminclass("","");
    userclass studentlog = new StudentClass("" ,"");

    System.out.println("Pilih login sebagai: ");
    System.out.println("1. Admin");
    System.out.println("2. Siswa");
    System.out.print("Masukkan pilihan anda: ");
    choice = ObjInput.nextInt();
    ObjInput.nextLine();

    switch (choice){
        case 1:
            System.out.print("Masukkan username: ");
            String username = ObjInput.nextLine();
            System.out.print("Masukkan Password: ");
            String password = ObjInput.nextLine();
            if (adminlog.login(username, password)){
                System.out.println("Login Sebagai Admin berhasil. ");
                adminlog.DisplayInfo();
            }
            else {
                System.out.println("login gagal coba lagi");
            }
            break;
        case 2:
            System.out.print("Enter Student Id: ");
            String Id = ObjInput.nextLine();
            System.out.print("Enter Your PIC: ");
            String Nama = ObjInput.nextLine();

            if (studentlog.login(Id, Nama)) {
                System.out.println("Login Sebagai Siswa");
                studentlog.DisplayInfo();
            } else {
                System.out.println("Login gagal coba lagi.");
            }
            break;
        default:
    }
    }
}
