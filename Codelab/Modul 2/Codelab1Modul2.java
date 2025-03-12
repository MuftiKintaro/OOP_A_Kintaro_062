public class Codelab1Modul2 {
    public static void main(String[] args) {
        Hewan Hewan1 = new Hewan(); //membuat objek dari class hewan untuk hewan pertama
        Hewan Hewan2 = new Hewan(); //untuk membuat objek dari class hewan untuk hewan kedua

        Hewan1.Name = "Cat"; //untuk mengisi nama hewan
        Hewan1.Type = "Mammal"; //untuk mengisi jenis hewan
        Hewan1.Sound = "Meeeooow"; //untuk mengisi suara yang dihasilkan hewan

        Hewan2.Name = "DOG"; //untuk mengisi nama hewan
        Hewan2.Type = "Mammal"; //untuk mengisi jenis hewan
        Hewan2.Sound = "woof-wooffffff"; //untuk mengisi suara yang di hasilkan hewan

        Hewan1.info(); //untuk menampilkan informasi hewan pertama
        Hewan2.info(); //untuk menampilkan informasi hewan kedua
    }
}
