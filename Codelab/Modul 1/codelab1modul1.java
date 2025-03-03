import java.time.LocalDateTime; //untuk mengambil data waktu
import java.util.Date; //untuk mengambil tanggal bulan tahun
import java.util.Scanner; //untuk class input

public class codelab1modul1 {
    public static void main(String[] args) {
        System.out.println("current date and time: " + new Date()); //untuk menampilkan data waktu sekarang
        String Nama; //untuk membuat variable nama
        String Gender; //untuk variable gender
        int tahun_lahir; //untuk variable tahun lahir
        Scanner objInput = new Scanner(System.in); //untuk memanggil scanner input

        System.out.print("Masukkan Nama Anda: ");//untuk memberitahu user untuk memasukkan nama
        Nama = objInput.nextLine(); // untuk memasukkan user input ke dalam variable
        System.out.print("Masukkan Gender Anda M/F: "); // untuk memberitahu user memasukkan gender
        Gender = objInput.nextLine();// untuk memasukkan user input ke dalam variable
        switch (Gender) { //untuk memulai switch
            case "M": //untuk pilihan pertama dengan memasukkan huruf M
                Gender = "Laki-laki"; // untuk menampilkan pilihan user jika memilih M
                break; //untuk memberhentikan pemrosesan switch
            case "F": //untuk pilihan kedua dengan memasukkan huruf F
                Gender  = "Perempuan";//untuk menampilkan pilihan user jika memilih F
                break;//untuk memberhentikan pemprosesan switch
            default:// apabila user tidak memasukkan pilihan selain yang ada di atas
                Gender = "Tidak Ada";// maka akan menampilkan gender = tidak ada
                break;
        }

        System.out.print("Masukkan tahun kelahiran anda: "); //untuk meminta user memasukkan tahun kelahirannya
        tahun_lahir = objInput.nextInt();//untuk memasukkan user input ke dalam variable
        tahun_lahir = LocalDateTime.now().getYear() - tahun_lahir; //rumus untuk mencari umur user dengan tahun sekarang dikurang tahun lahir user

        System.out.println("Personal Data"); //untuk menampilkan output
        System.out.println("Nama: " + Nama);//untuk menampilkan output nama user
        System.out.println("gender: " + Gender);//untuk menampilkan output gender user
        System.out.println("Age: "+ tahun_lahir);//untuk menampilkan output umur user
    }
}