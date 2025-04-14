import java.util.Scanner;
public class Student {
    public String username;
    public String password;
    Scanner input1 = new Scanner(System.in);

    public void Displayinfo (){
        System.out.println("Nama: Muhammad Mufti Kintaro");
        System.out.println("NIM : 202410370110062");
        System.out.println("Jurusan/kelas: Informatika/2A");
    }
    public void Student1() {
        System.out.println("==============================");
        System.out.print("Masukkan usernama anda: ");
        username = input1.nextLine();
        System.out.print("Masukkan password PIC anda: ");
        password = input1.nextLine();

        if (username.equals("Mufti062") && password.equals("12345678")){
            System.out.println("Login berhasil");
            System.out.println("======================");
            Displayinfo();
        } else {
            System.out.println("Login gagal");
        }
    }
}
