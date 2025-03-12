public class BankAccount { //untuk mendefinisikan class BankAccount
    String AccountNumber, OwnerName; //untuk mendeklarasikan attribut dengan tipe data String
    double Balance; //untuk mendeklerasikan attribut dengan tipe data double

    void DisplayInfo(){
        System.out.println("Nomor Rekening: " + AccountNumber); //untuk menampilkan nomor rekening
        System.out.println("Nama Pemilik: " + OwnerName); //untuk menampilkan nama pemilik rekening
        System.out.println("Saldo: " + Balance + "\n");//untuk menampilkan saldo pemilik rekening
    }
    void Deposit1(double setor){ //method untuk melakukan deposit dengan nama Mufti
        Balance += setor; //untuk menambahkan jumlah setoran ke dalam saldo
        System.out.print("Mufti berhasil deposit: " + setor);//untuk menampilkan berapa banyak setoran yang dimasukkan
        System.out.println(" Saldo Terbaru: " + Balance );//untuk menampilkan berapa banyak saldo pengguna setelah di setor
    }
    void Deposit2(double setor){ //method untuk melakukan deposit dengan nama Geraldo
        Balance += setor; //untuk menambahkan jumlah setoran ke dalam saldo
        System.out.print("Geraldo berhasil deposit: " + setor); //untuk menampilkan berapa banyak setoran yang dimasukkan
        System.out.println(" Saldo Terbaru: " + Balance + "\n"); //untuk menampilkan berapa banyak saldo pengguna setelah disetor
    }
    void withdraw1(double tarik){ //method untuk melakukan penarikan atau withdraw
        System.out.print("Mufti withdraw: " + tarik);//untuk menampilkan berapa banyak saldo yang akan ditarik
        if (Balance  > tarik){//sebuah pengkondisian jika balance lebih banyak daripada tarik maka akan mengeksekusi code di bawah
            Balance -= tarik;//untuk mengurangi saldo dengan berapa banyak yang diambil pengguna
            System.out.print("(Berhasil) ");//untuk menampilkan jika pengguna berhasil menarik saldonya
            System.out.println("Saldo Terbaru: " + Balance); //untuk menampilkan berapa banyak saldo setelah di tarik

        }else {//sebuah pengkondisian jika syarat if tidak terpenuhi
            System.out.print(" (Saldo Tidak mencukupi) ");//untuk menampilkan ke pengguna bahwa saldonya tidak mencukupi
            System.out.println("Saldo Terbaru: " + Balance);//untuk menampilkan saldo pengguna

        }
    }
    void withdraw2(double tarik){//method untuk melakukan penarikan atau withdraw dengan nama geraldo
        System.out.print("geraldo withdraw: " + tarik);//untuk menampilkan berapa banyak saldo yang akan di tarik
        if (Balance > tarik){//pengkondisian jika salod lebih banyak daripada yang ditarik maka akan mengeksekusi code dibawah
            Balance -= tarik;//untuk mengurangi saldo dengan jumlah yang ditarik
            System.out.print(" (Berhasil) ");//untuk menampilkan jika pengguna berhasil menarik saldonya
            System.out.println("Saldo Terbaru: " + Balance + "\n");//untuk menampilkan saldo terbaru setelah di tarik
        }else {//pengkondisian jika syarat if tidak dipenuhi
            System.out.print(" (Saldo Tidak mencukupi) ");//untuk menampilkan saldo tidak cukup untuk melakukan withdraw
            System.out.println("Saldo Terbaru" + Balance);//untuk menampilkan saldo pengguna
        }
    }
}
