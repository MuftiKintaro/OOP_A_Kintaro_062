public class Codelab2Modul2 {//untuk mendefinisikan class
    public static void main (String[] args){//method yang akan di eksekusi pertama kali
    BankAccount account1 = new BankAccount();//membuat objek dari Bankaccount
    BankAccount account2 = new BankAccount();//membuat objek dari BankAccount

    account1.AccountNumber = "202410370110062";//untuk memasukkan nomor rekening pengguna
    account1.OwnerName = "Muhammad Mufti Kinta";//untuk memasukkan nama pengguna
    account1.Balance = 200000;//untuk memasukkan saldo awal pengguna

    account2.AccountNumber = "202410370110059";//untuk memasukkan nomor rekening pengguna
    account2.OwnerName = "Geraldo Agha Mahendr";//untuk memasukkan nama pengguna
    account2.Balance = 400000;//untuk memasukkan saldo awal pengguna

    account1.DisplayInfo();//untuk menampilkan informasi pengguna pertama
    account2.DisplayInfo();//untuk menampilkan informasi pengguna kedua
    account1.Deposit1(300000);//untuk memasukkan berapa banyak jumlah deposit ke rekening pertama
    account2.Deposit2(500000);//untuk memasukkan berapa banyak jumlah deposit ke rekening kedua
    account1.withdraw1(600000);//untuk memasukkan berapa banyak jumlah yang ditarik dari rekening pertama
    account2.withdraw2(200000);//untuk memasukkan berapa banyak jumlah yang ditarik dari rekening kedua
    account1.DisplayInfo();//untuk menampilkan infromasi pengguna pertama
    account2.DisplayInfo();//untuk menampilkna informasi pengguna kedua
    }
}
